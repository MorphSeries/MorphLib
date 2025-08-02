package dev.morphie.morphLib.itemstack;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemMaker {

    public ItemStack makeItem(Material material, int amount, int modelid, String name, ArrayList<String> lore, Boolean glow, Boolean unbreakable) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
        meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_DESTROYS });
        if (glow) {
            meta.addEnchant(Enchantment.UNBREAKING, 1, true);
            meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
        }
        if (unbreakable) {
            meta.setUnbreakable(true);
        }
        meta.setDisplayName(name);
        meta.setLore(lore);
        meta.setCustomModelData(modelid);
        item.setItemMeta(meta);
        return item;
    }
}
