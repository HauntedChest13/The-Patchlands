package com.surrealitymodding.the_patchlands.core.registry;

import com.surrealitymodding.the_patchlands.common.item.TPCreativeTab;
import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class PCItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, ThePatchlands.MOD_ID);

    public static final Supplier<Item> WRETCHED_BEANS = ITEMS.register("wretched_beans", () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));
    public static final Supplier<Item> RAW_IGNISTEEL = ITEMS.register("raw_ignisteel", () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));
    public static final Supplier<Item> IGNISTEEL_NUGGET = ITEMS.register("ignisteel_nugget", () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));
    public static final Supplier<Item> IGNISTEEL_INGOT = ITEMS.register("ignisteel_ingot", () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));
}