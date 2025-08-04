package dev.morphie.morphLib.itemstack;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.xml.sax.ext.Attributes2;

import javax.print.attribute.Attribute;
import java.util.ArrayList;

public class ItemMaker {

    public ItemStack makeItem(Material material, int amount, int modelid, String name, ArrayList<String> lore, Boolean glow, Boolean unbreakable, Player p) {
        ItemStack item = new ItemStack(material, amount);
        if (material.equals(Material.PLAYER_HEAD)) {
            SkullMeta meta = (SkullMeta) item.getItemMeta();
            meta.setOwner(p.getName());
            meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
            meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_DESTROYS });
            meta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ADDITIONAL_TOOLTIP});
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
        } else {
            ItemMeta meta = item.getItemMeta();
            meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
            meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_DESTROYS });
            meta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ADDITIONAL_TOOLTIP});
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
        }
        return item;
    }
}
