package com.extrask.maceanvil;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;

public final class MaceAnvilBlocker implements Listener {

    @EventHandler
    public void onPrepareAnvil(PrepareAnvilEvent event) {
        ItemStack firstSlot = event.getInventory().getItem(0);
        ItemStack secondSlot = event.getInventory().getItem(1);

        if (isMace(firstSlot) && isMace(secondSlot)) {
            event.setResult(null);
        }
    }

    private boolean isMace(ItemStack item) {
        return item != null && item.getType().name().equals("MACE");
    }
}