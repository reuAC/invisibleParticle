package net.reuac.invisibleparticle;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class InvisibleParticle extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new MainListener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
