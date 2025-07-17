package dev.morphie.morphLib;

import org.bukkit.plugin.java.JavaPlugin;

public final class MorphLib extends JavaPlugin {

    public String Version;

    @Override
    public void onEnable() {
        Version = this.getDescription().getVersion();
    }

    @Override
    public void onDisable() {
    }
}
