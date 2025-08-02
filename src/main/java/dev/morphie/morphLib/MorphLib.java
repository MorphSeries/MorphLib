package dev.morphie.morphLib;

import dev.morphie.morphLib.utils.Colorize;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MorphLib extends JavaPlugin {

    public String Version;

    @Override
    public void onEnable() {
        Version = this.getDescription().getVersion();
        Bukkit.getConsoleSender().sendMessage(new Colorize().addColor("&9ᴍᴏʀᴘʜ&3ʟɪʙ &7➛ &aPlugin Enabled!"));
        Bukkit.getConsoleSender().sendMessage(new Colorize().addColor("&3ᴠᴇʀꜱɪᴏɴ&7: &a" + Version));
    }

    @Override
    public void onDisable() {
    }
}
