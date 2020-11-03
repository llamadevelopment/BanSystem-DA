package net.llamadevelopment.bansystemda;

import cn.nukkit.plugin.PluginBase;
import lombok.Getter;
import net.llamadevelopment.bansystemda.components.language.Language;
import net.llamadevelopment.bansystemda.listeners.EventListener;

public class BanSystemDA extends PluginBase {

    @Getter
    private static BanSystemDA instance;

    @Override
    public void onEnable() {
        instance = this;
        try {
            this.saveDefaultConfig();
            Language.init();
            this.loadPlugin();
            this.getLogger().info("§aBanSystem-DA successfully started.");
        } catch (Exception e) {
            e.printStackTrace();
            this.getLogger().error("§4Failed to load BanSystem-DA.");
        }
    }

    private void loadPlugin() {
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
    }
}
