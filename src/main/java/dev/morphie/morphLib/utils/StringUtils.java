package dev.morphie.morphLib.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.entity.Player;

public class StringUtils {

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty strings
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public void ActionBar (String message, Player player ) {
        final TextComponent component = Component.text(message);
        player.sendActionBar(component);
    }
}
