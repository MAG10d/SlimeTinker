package io.github.sefiraat.slimetinker.events;

import io.github.sefiraat.slimetinker.events.friend.EventFriend;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.concurrent.ThreadLocalRandom;

public final class DurabilityEvents {

    private DurabilityEvents() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static void headSmithium(EventFriend friend) {
        if (ThreadLocalRandom.current().nextInt(1, 3) == 1) {
            friend.setCancelEvent(true);
        }
    }

    public static void rodAluBronze(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 1);
    }

    public static void headSolder(EventFriend friend) {
        ItemMeta im = friend.getTool().getItemMeta();
        assert im != null;
        Damageable damageable = (Damageable) im;
        damageable.setDamage(friend.getTool().getType().getMaxDurability() - 1);
        friend.getTool().setItemMeta(im);
        friend.setCancelEvent(true);
    }

    public static void headAluminum(EventFriend friend) {
        if (ThreadLocalRandom.current().nextInt(1, 4) == 1) {
            ItemUtils.incrementRepair(friend.getTool(), 1);
            friend.setCancelEvent(true);
        }
    }

    public static void rodAluminum(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 1);
    }

    public static void explosive(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 17);
    }

    public static void headSingInfinity(EventFriend friend) {
        friend.setDurabilityMod(0);
    }

    public static void headMythril(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 0.5);
    }

    public static void headInfinity(EventFriend friend) {
        friend.setDurabilityMod(0);
    }

    public static void headSingAluminum(EventFriend friend) {
        if (ThreadLocalRandom.current().nextInt(1, 4) == 1) {
            ItemUtils.incrementRepair(friend.getTool(), 2);
            friend.setCancelEvent(true);
        }
    }

    public static void rodSingAluminum(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 1);
    }

    public static void rodAdvancedAlloy(EventFriend friend) {
        Damageable d = (Damageable) friend.getTool().getItemMeta();
        assert d != null;
        if (d.getDamage() < 50) {
            return;
        }
        ItemStack i = new ItemStack(Material.IRON_INGOT, 1);
        if (friend.getPlayer().getInventory().containsAtLeast(new ItemStack(Material.IRON_INGOT), 1)) {
            ItemUtils.repairItem(friend.getTool(), 50);
            friend.getPlayer().getInventory().removeItem(i);
            friend.getPlayer().sendMessage(ThemeUtils.SUCCESS + "你的工具使用了 1 個鐵錠來恢復部分耐久!");
        }

    }

    public static void headScrap(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 3);
    }

    public static void plateBrass(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 2);
    }

    public static void linksBrass(EventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 1);
    }

    public static void plateHardened(EventFriend friend) {
        friend.setCancelEvent(true);
    }
}
