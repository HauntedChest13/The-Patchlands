package com.surrealitymodding.the_patchlands.core.registry;

import com.surrealitymodding.the_patchlands.common.block.IgnisteelLanternBlock;
import com.surrealitymodding.the_patchlands.common.block.IgnisteelOreBlock;
import com.surrealitymodding.the_patchlands.common.block.OvergrownWretchedLeafBlock;
import com.surrealitymodding.the_patchlands.common.block.WretchedLeafBlock;
import com.surrealitymodding.the_patchlands.common.item.TPCreativeTab;
import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import gg.moonflower.pollen.api.blockentity.PollenBlockEntity;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

public class PCBlocks {
    public static final PollinatedRegistry<Block> BLOCKS = PollinatedRegistry.create(Registry.BLOCK, ThePatchlands.MOD_ID);

    //Brittlestone Blocks
    public static final Supplier<Block> BRITTLESTONE = registerBlock("brittlestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(3.5F, 8F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> POLISHED_BRITTLESTONE = registerBlock("polished_brittlestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(3.5F, 8F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> CHISELED_POLISHED_BRITTLESTONE = registerBlock("chiseled_polished_brittlestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(3.5F, 8F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> POLISHED_BRITTLESTONE_BRICKS = registerBlock("polished_brittlestone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(3.5F, 8F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> CRACKED_POLISHED_BRITTLESTONE_BRICKS = registerBlock("cracked_polished_brittlestone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(3.5F, 8F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);

    //Ignisteel Blocks
    public static final Supplier<Block> IGNISTEEL_ORE = registerBlock("ignisteel_ore", () -> new IgnisteelOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(3.5F, 3F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> IGNISTEEL_BLOCK = registerBlock("ignisteel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> RAW_IGNISTEEL_BLOCK = registerBlock("raw_ignisteel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(3.5F, 3.5F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> IGNISTEEL_BARS = registerBlock("ignisteel_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> IGNISTEEL_BAR_DOOR = registerBlock("ignisteel_bar_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> IGNISTEEL_CHAINS = registerBlock("ignisteel_chain", () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> CUT_IGNISTEEL = registerBlock("cut_ignisteel", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> CUT_IGNISTEEL_TILES = registerBlock("cut_ignisteel_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> IGNISTEEL_BRICKS = registerBlock("ignisteel_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> IGNISTEEL_LANTERN_BLOCK = registerBlock("ignisteel_lantern_block", () -> new IgnisteelLanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F).sound(SoundType.LANTERN).lightLevel((p_152680_) -> {return 15;}).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final Supplier<Block> SOUL_IGNISTEEL_LANTERN_BLOCK = registerBlock("soul_ignisteel_lantern_block", () -> new IgnisteelLanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F).sound(SoundType.LANTERN).lightLevel((p_152680_) -> {return 10;}).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);

    // Reinforced Logs
    public static final Supplier<Block> REINFORCED_CRIMSON_LOG = registerBlock("reinforced_crimson_stem", () -> reinforcedLog(MaterialColor.CRIMSON_STEM));
    public static final Supplier<Block> REINFORCED_STRIPPED_CRIMSON_LOG = registerBlock("reinforced_stripped_crimson_stem", () -> reinforcedLog(MaterialColor.CRIMSON_STEM));
    public static final Supplier<Block> REINFORCED_WARPED_LOG = registerBlock("reinforced_warped_stem", () -> reinforcedLog(MaterialColor.WARPED_STEM));
    public static final Supplier<Block> REINFORCED_STRIPPED_WARPED_LOG = registerBlock("reinforced_stripped_warped_stem", () -> reinforcedLog(MaterialColor.WARPED_STEM));
    public static final Supplier<Block> REINFORCED_OAK_LOG = registerBlock("reinforced_oak_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_STRIPPED_OAK_LOG = registerBlock("reinforced_stripped_oak_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_BIRCH_LOG = registerBlock("reinforced_birch_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_STRIPPED_BIRCH_LOG = registerBlock("reinforced_stripped_birch_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_ACACIA_LOG = registerBlock("reinforced_acacia_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_STRIPPED_ACACIA_LOG = registerBlock("reinforced_stripped_acacia_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_SPRUCE_LOG = registerBlock("reinforced_spruce_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_STRIPPED_SPRUCE_LOG = registerBlock("reinforced_stripped_spruce_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_JUNGLE_LOG = registerBlock("reinforced_jungle_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_STRIPPED_JUNGLE_LOG = registerBlock("reinforced_stripped_jungle_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_DARK_OAK_LOG = registerBlock("reinforced_dark_oak_log", () -> reinforcedLog(MaterialColor.WOOD));
    public static final Supplier<Block> REINFORCED_STRIPPED_DARK_OAK_LOG = registerBlock("reinforced_stripped_dark_oak_log", () -> reinforcedLog(MaterialColor.WOOD));

    //Wretched Grove Blocks
    public static final Supplier<Block> OVERGROWN_WRETCHED_LEAF = registerBlock("overgrown_wretched_leaf", () -> new OvergrownWretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> 7)));
    public static final Supplier<Block> WRETCHED_LEAF = registerBlock("wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> 7)));
    public static final Supplier<Block> WHITE_WRETCHED_LEAF = registerBlock("white_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> 7)));
    public static final Supplier<Block> ORANGE_WRETCHED_LEAF = registerBlock("orange_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> MAGENTA_WRETCHED_LEAF = registerBlock("magenta_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> LIGHT_BLUE_WRETCHED_LEAF = registerBlock("light_blue_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> YELLOW_WRETCHED_LEAF = registerBlock("yellow_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> LIME_WRETCHED_LEAF = registerBlock("lime_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> PINK_WRETCHED_LEAF = registerBlock("pink_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> GRAY_WRETCHED_LEAF = registerBlock("gray_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> LIGHT_GRAY_WRETCHED_LEAF = registerBlock("light_gray_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> CYAN_WRETCHED_LEAF = registerBlock("cyan_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> PURPLE_WRETCHED_LEAF = registerBlock("purple_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> BLUE_WRETCHED_LEAF = registerBlock("blue_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> BROWN_WRETCHED_LEAF = registerBlock("brown_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> GREEN_WRETCHED_LEAF = registerBlock("green_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> RED_WRETCHED_LEAF = registerBlock("red_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((p_152680_) -> {return 7;})));
    public static final Supplier<Block> BLACK_WRETCHED_LEAF = registerBlock("black_wretched_leaf", () -> new WretchedLeafBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.2F).sound(SoundType.GRASS).noOcclusion().lightLevel((7))));

    private static Supplier<Block> registerBlock(String id, Supplier<Block> block) {
        Supplier<Block> register = BLOCKS.register(id, block);
        EMItems.ITEMS.register(id, () -> new BlockItem(register.get(), new Item.Properties().tab(tab)));
        return register;
    }
    

    private static Block reinforcedLog(MaterialColor pMaterialColor) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, (p_152620_) -> pMaterialColor).strength(4.0F, 30.0F).sound(SoundType.WOOD));
    }

    private static Boolean ocelotOrParrot(BlockState pState, BlockGetter pBlockGetter, BlockPos pPos, EntityType<?> pEntity) {
        return pEntity == EntityType.OCELOT || pEntity == EntityType.PARROT;
    }
}