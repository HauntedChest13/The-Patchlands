package com.hauntedchest.the_patchlands.registry;

import com.hauntedchest.the_patchlands.PatchlandsMain;
import com.hauntedchest.the_patchlands.block.block_classes.IgnisteelLanternBlock;
import com.hauntedchest.the_patchlands.block.block_classes.IgnisteelOreBlock;
import com.hauntedchest.the_patchlands.item.TPCreativeTab;
import com.hauntedchest.the_patchlands.registry.TPItemRegister;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class TPBlockRegister {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PatchlandsMain.MOD_ID);

    public static final RegistryObject<Block> BRITTLESTONE = registerBlock("brittlestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(3.5F, 8F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);

    public static final RegistryObject<Block> IGNISTEEL_ORE = registerBlock("ignisteel_ore", () -> new IgnisteelOreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(3.5F, 3F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> IGNISTEEL_BLOCK = registerBlock("ignisteel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> RAW_IGNISTEEL_BLOCK = registerBlock("raw_ignisteel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(3.5F, 3.5F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> IGNISTEEL_BARS = registerBlock("ignisteel_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> IGNISTEEL_BAR_DOOR = registerBlock("ignisteel_bar_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> IGNISTEEL_CHAINS = registerBlock("ignisteel_chain", () -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> CUT_IGNISTEEL = registerBlock("cut_ignisteel", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> CUT_IGNISTEEL_TILES = registerBlock("cut_ignisteel_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F)), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);
    public static final RegistryObject<Block> IGNISTEEL_LANTERN = registerBlock("ignisteel_lantern", () -> new IgnisteelLanternBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(5F, 6F).sound(SoundType.LANTERN).lightLevel((p_152680_) -> {
        return 10;
}).noOcclusion()), TPCreativeTab.PATCHLANDS_BLOCKS_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        TPItemRegister.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        TPItemRegister.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(TPCreativeTab.PATCHLANDS_BLOCKS_TAB)));
    }






    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
