package com.surrealitymodding.the_patchlands.core.registry;

import com.surrealitymodding.the_patchlands.common.item.FollowItemLike;
import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import com.surrealitymodding.the_patchlands.core.registry.util.Woodset;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class EMBlocks {
    public static final PollinatedRegistry<Block> BLOCKS = PollinatedRegistry.create(Registry.BLOCK, ThePatchlands.MOD_ID);

    /* Red Mushroom Wood Set */
    private static final Woodset RED_MUSHROOM = new Woodset(MaterialColor.WOOL, MaterialColor.SAND);

    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_STEM = registerBlock("stripped_red_mushroom_stem", RED_MUSHROOM::stripped_log, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.STRIPPED_WARPED_STEM);
    public static final Supplier<Block> STRIPPED_RED_MUSHROOM_HYPHAE = registerBlock("stripped_red_mushroom_hyphae", RED_MUSHROOM::stripped_wood, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.STRIPPED_WARPED_HYPHAE);
    public static final Supplier<Block> RED_MUSHROOM_STEM = registerBlock("red_mushroom_stem", RED_MUSHROOM::log, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_STEM);
    public static final Supplier<Block> RED_MUSHROOM_HYPHAE = registerBlock("red_mushroom_hyphae", RED_MUSHROOM::wood, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_HYPHAE);

    public static final Supplier<Block> RED_MUSHROOM_PLANKS = registerBlock("red_mushroom_planks", RED_MUSHROOM::planks, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_PLANKS);
    public static final Supplier<Block> RED_MUSHROOM_SLAB = registerBlock("red_mushroom_slab", RED_MUSHROOM::slab, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_SLAB);
    public static final Supplier<Block> RED_MUSHROOM_STAIRS = registerBlock("red_mushroom_stairs", () -> RED_MUSHROOM.stairs(RED_MUSHROOM_PLANKS), CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_STAIRS);
    public static final Supplier<Block> RED_MUSHROOM_PRESSURE_PLATE = registerBlock("red_mushroom_pressure_plate", RED_MUSHROOM::pressurePlate, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_PRESSURE_PLATE);
    public static final Supplier<Block> RED_MUSHROOM_BUTTON = registerBlock("red_mushroom_button", RED_MUSHROOM::button, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_BUTTON);
    public static final Supplier<Block> RED_MUSHROOM_FENCE = registerBlock("red_mushroom_fence", RED_MUSHROOM::fence, CreativeModeTab.TAB_DECORATIONS, Blocks.WARPED_FENCE);
    public static final Supplier<Block> RED_MUSHROOM_FENCE_GATE = registerBlock("red_mushroom_fence_gate", RED_MUSHROOM::fenceGate, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_FENCE_GATE);
    public static final Supplier<Block> RED_MUSHROOM_DOOR = registerBlock("red_mushroom_door", RED_MUSHROOM::door, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_DOOR);
    public static final Supplier<Block> RED_MUSHROOM_TRAPDOOR = registerBlock("red_mushroom_trapdoor", RED_MUSHROOM::trapdoor, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_TRAPDOOR);

    /* Brown Mushroom Wood Set */
    private static final Woodset BROWN_MUSHROOM = new Woodset(MaterialColor.COLOR_ORANGE, MaterialColor.DIRT);

    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_STEM = registerBlock("stripped_brown_mushroom_stem", BROWN_MUSHROOM::stripped_log, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.STRIPPED_WARPED_STEM);
    public static final Supplier<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE = registerBlock("stripped_brown_mushroom_hyphae", BROWN_MUSHROOM::stripped_wood, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.STRIPPED_WARPED_HYPHAE);
    public static final Supplier<Block> BROWN_MUSHROOM_STEM = registerBlock("brown_mushroom_stem", BROWN_MUSHROOM::log, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_STEM);
    public static final Supplier<Block> BROWN_MUSHROOM_HYPHAE = registerBlock("brown_mushroom_hyphae", BROWN_MUSHROOM::wood, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_HYPHAE);

    public static final Supplier<Block> BROWN_MUSHROOM_PLANKS = registerBlock("brown_mushroom_planks", BROWN_MUSHROOM::planks, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_PLANKS);
    public static final Supplier<Block> BROWN_MUSHROOM_SLAB = registerBlock("brown_mushroom_slab", BROWN_MUSHROOM::slab, CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_SLAB);
    public static final Supplier<Block> BROWN_MUSHROOM_STAIRS = registerBlock("brown_mushroom_stairs", () -> BROWN_MUSHROOM.stairs(BROWN_MUSHROOM_PLANKS), CreativeModeTab.TAB_BUILDING_BLOCKS, Blocks.WARPED_STAIRS);
    public static final Supplier<Block> BROWN_MUSHROOM_PRESSURE_PLATE = registerBlock("brown_mushroom_pressure_plate", BROWN_MUSHROOM::pressurePlate, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_PRESSURE_PLATE);
    public static final Supplier<Block> BROWN_MUSHROOM_BUTTON = registerBlock("brown_mushroom_button", BROWN_MUSHROOM::button, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_BUTTON);
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE = registerBlock("brown_mushroom_fence", BROWN_MUSHROOM::fence, CreativeModeTab.TAB_DECORATIONS, Blocks.WARPED_FENCE);
    public static final Supplier<Block> BROWN_MUSHROOM_FENCE_GATE = registerBlock("brown_mushroom_fence_gate", BROWN_MUSHROOM::fenceGate, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_FENCE_GATE);
    public static final Supplier<Block> BROWN_MUSHROOM_DOOR = registerBlock("brown_mushroom_door", BROWN_MUSHROOM::door, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_DOOR);
    public static final Supplier<Block> BROWN_MUSHROOM_TRAPDOOR = registerBlock("brown_mushroom_trapdoor", BROWN_MUSHROOM::trapdoor, CreativeModeTab.TAB_REDSTONE, Blocks.WARPED_TRAPDOOR);

    private static Supplier<Block> registerBlock(String id, Supplier<Block> block, CreativeModeTab tab, Block followBlock) {
        Supplier<Block> register = BLOCKS.register(id, block);
        EMItems.ITEMS.register(id, () -> new FollowItemLike(register.get(), new Item.Properties(), tab, followBlock));
        return register;
    }
}
