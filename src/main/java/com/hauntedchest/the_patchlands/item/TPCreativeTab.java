package com.hauntedchest.the_patchlands.item;

import com.hauntedchest.the_patchlands.registry.PCBlocks;
import com.hauntedchest.the_patchlands.registry.PCItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TPCreativeTab {
    public static final CreativeModeTab PATCHLANDS_BLOCKS_TAB = new CreativeModeTab("patchlandsBlockModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(PCBlocks.BRITTLESTONE.get());
        }
    };

    public static final CreativeModeTab PATCHLANDS_ITEMS_TAB = new CreativeModeTab("patchlandsItemModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(PCItems.WRETCHED_BEANS.get());
        }
    };
}
