package com.surrealitymodding.the_patchlands.core.registry;

import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class EMItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, ThePatchlands.MOD_ID);
}