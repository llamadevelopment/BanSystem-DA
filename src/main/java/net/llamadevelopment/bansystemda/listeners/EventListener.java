package net.llamadevelopment.bansystemda.listeners;

import club.minnced.discord.webhook.WebhookClient;
import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import net.llamadevelopment.bansystem.components.event.*;
import net.llamadevelopment.bansystemda.BanSystemDA;
import net.llamadevelopment.bansystemda.components.language.Language;

import java.awt.*;
import java.time.Instant;
import java.time.temporal.TemporalAccessor;

public class EventListener implements Listener {

    private final String url;

    public EventListener(BanSystemDA instance) {
        this.url = instance.getConfig().getString("webhook.url");
    }

    @EventHandler
    public void on(ClearBanlogEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("clearbanlog-title"), ""))
                    .setDescription(Language.getNP("clearbanlog-description", event.getTarget()))
                    .setColor(Color.decode(Language.getNP("clearbanlog-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(ClearMutelogEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("clearmutelog-title"), ""))
                    .setDescription(Language.getNP("clearmutelog-description", event.getTarget()))
                    .setColor(Color.decode(Language.getNP("clearmutelog-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(ClearWarnlogEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("clearwarnlog-title"), ""))
                    .setDescription(Language.getNP("clearwarnlog-description", event.getTarget()))
                    .setColor(Color.decode(Language.getNP("clearwarnlog-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(DeleteBanEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("deleteban-title"), ""))
                    .setDescription(Language.getNP("deleteban-description", event.getId()))
                    .setColor(Color.decode(Language.getNP("deleteban-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(DeleteMuteEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("deletemute-title"), ""))
                    .setDescription(Language.getNP("deletemute-description", event.getId()))
                    .setColor(Color.decode(Language.getNP("deletemute-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(DeleteWarnEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("deletewarn-title"), ""))
                    .setDescription(Language.getNP("deletewarn-description", event.getId()))
                    .setColor(Color.decode(Language.getNP("deletewarn-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerBanEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerban-title"), ""))
                    .setDescription(Language.getNP("playerban-description", event.getBan().getPlayer()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playerban-id"), event.getBan().getBanID()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playerban-reason"), event.getBan().getReason()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playerban-banner"), event.getBan().getBanner()))
                    .setColor(Color.decode(Language.getNP("playerban-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerKickEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerkick-title"), ""))
                    .setDescription(Language.getNP("playerkick-description", event.getTarget(), event.getExecutor()))
                    .setColor(Color.decode(Language.getNP("playerkick-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerMuteEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playermute-title"), ""))
                    .setDescription(Language.getNP("playermute-description", event.getMute().getPlayer()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playermute-id"), event.getMute().getMuteID()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playermute-reason"), event.getMute().getReason()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playermute-banner"), event.getMute().getMuter()))
                    .setColor(Color.decode(Language.getNP("playermute-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerUnbanEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerunban-title"), ""))
                    .setDescription(Language.getNP("playerunban-description", event.getTarget()))
                    .setColor(Color.decode(Language.getNP("playerunban-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerUnmuteEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerunmute-title"), ""))
                    .setDescription(Language.getNP("playerunmute-description", event.getTarget()))
                    .setColor(Color.decode(Language.getNP("playerunmute-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @EventHandler
    public void on(PlayerWarnEvent event) {
        try (WebhookClient client = WebhookClient.withUrl(this.url)) {
            TemporalAccessor accessor = Instant.ofEpochMilli(System.currentTimeMillis());
            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(new WebhookEmbed.EmbedTitle(Language.getNP("playerwarn-title"), ""))
                    .setDescription(Language.getNP("playerwarn-description", event.getWarn().getPlayer()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playerwarn-id"), event.getWarn().getWarnID()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playerwarn-reason"), event.getWarn().getReason()))
                    .addField(new WebhookEmbed.EmbedField(true, Language.getNP("playerwarn-banner"), event.getWarn().getCreator()))
                    .setColor(Color.decode(Language.getNP("playerwarn-color")).getRGB())
                    .setTimestamp(accessor)
                    .build();
            client.send(embed).thenAccept(readonlyMessage -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
