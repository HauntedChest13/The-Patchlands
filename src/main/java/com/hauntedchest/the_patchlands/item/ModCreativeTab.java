package com.hauntedchest.the_patchlands.item;

import com.hauntedchest.the_patchlands.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab PATCHLANDS_BLOCKS_TAB = new CreativeModeTab("patchlandsBlockModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BRITTLESTONE.get());
        }
    };

    public static final CreativeModeTab PATCHLANDS_ITEMS_TAB = new CreativeModeTab("patchlandsItemModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WRETCHED_BEANS.get());
        }
    };
}
