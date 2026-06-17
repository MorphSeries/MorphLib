package dev.morphie.morphLib.utils;

import de.themoep.inventorygui.InventoryGui;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class MiniMessageGui {

    public InventoryGui createMiniMessageGui(JavaPlugin plugin, InventoryHolder holder, String title, String[] guiSetup) {
        InventoryGui.InventoryCreator miniMessageInventoryCreator = new InventoryGui.InventoryCreator(
                (gui, viewer, type) ->
                        Bukkit.createInventory(new InventoryGui.Holder(gui), type, new Colorize().miniMessage(gui.replaceVars(viewer, gui.getTitle()))),
                (gui, viewer, size) ->
                        Bukkit.createInventory(new InventoryGui.Holder(gui), size, new Colorize().miniMessage(gui.replaceVars(viewer, gui.getTitle()))));

        BiConsumer<ItemMeta, String> miniMessageNameSetter = (itemMeta, name) -> {
            if (name != null) {
                itemMeta.displayName((new Colorize().miniMessage(name)));
            }
        };

        BiConsumer<ItemMeta, List<String>> miniMessageLoreSetter = (itemMeta, lore) -> {
            if (lore != null) {
                List<Component> loreComponents = new ArrayList<>();
                for (String line : lore) {
                    loreComponents.add(new Colorize().miniMessage(line));
                }
                itemMeta.lore(loreComponents);
            }
        };

        return new InventoryGui(plugin, miniMessageInventoryCreator, miniMessageNameSetter, miniMessageLoreSetter, holder, title, guiSetup);
    }
}
