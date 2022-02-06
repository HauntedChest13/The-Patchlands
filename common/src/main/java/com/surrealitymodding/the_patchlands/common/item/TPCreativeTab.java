package com.surrealitymodding.the_patchlands.common.item;

import com.surrealitymodding.the_patchlands.core.registry.PCBlocks;
import gg.moonflower.pollen.api.client.util.CreativeModeTabBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TPCreativeTab {
    public static final CreativeModeTab PATCHLANDS_BLOCKS_TAB = CreativeModeTabBuilder.builder(new ResourceLocation("patchlands", "blocks_tab")).setIcon(()-> new ItemStack(PCBlocks.BRITTLESTONE.get())).build();
    public static final CreativeModeTab PATCHLANDS_ITEMS_TAB = CreativeModeTabBuilder.builder(new ResourceLocation("patchlands", "items_tab")).setIcon(()-> new ItemStack(PCBlocks.BRITTLESTONE.get())).build();
}