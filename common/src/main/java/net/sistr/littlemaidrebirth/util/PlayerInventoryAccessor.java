package net.sistr.littlemaidrebirth.util;

import net.minecraft.entity.player.PlayerInventory;

public interface PlayerInventoryAccessor {
    PlayerInventory getPlayerInventory_LMRB();
    void setPlayerInventory_LMRB(PlayerInventory inventory);
}