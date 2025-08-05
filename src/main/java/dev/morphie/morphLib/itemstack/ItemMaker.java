package dev.morphie.morphLib.itemstack;

import de.tr7zw.nbtapi.NBTCompound;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class ItemMaker {

    public ItemStack makeItem(Material material, int amount, int modelid, String name, ArrayList<String> lore, Boolean glow, Boolean unbreakable, Player p, String nbt) {
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
            meta.setHideTooltip(true);
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
            meta.setHideTooltip(true);
            meta.setDisplayName(name);
            meta.setLore(lore);
            meta.setCustomModelData(modelid);
            item.setItemMeta(meta);
            if (nbt != null) {
                NBTItem nbtItem = new NBTItem(item);
                NBTCompound comp = nbtItem.addCompound(nbt);
                return nbtItem.getItem();
            }

        }
        return item;
    }
}
