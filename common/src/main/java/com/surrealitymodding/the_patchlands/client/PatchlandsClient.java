package com.surrealitymodding.the_patchlands.client;

import com.hauntedchest.the_patchlands.registry.PCBlocks;
import com.surrealitymodding.the_patchlands.core.registry.PCBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = PatchlandsMain.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PatchlandsClient {

    private static void render(Supplier<? extends Block> block, RenderType render) {
        ItemBlockRenderTypes.setRenderLayer(block.get(), render);
    }

    public static void registerBlockRenderers() {
        RenderType cutout = RenderType.cutout();
        RenderType mipped = RenderType.cutoutMipped();
        RenderType translucent = RenderType.translucent();

        render(PCBlocks.IGNISTEEL_BARS, cutout);
        render(PCBlocks.IGNISTEEL_BAR_DOOR, cutout);
        render(PCBlocks.IGNISTEEL_CHAINS, cutout);
        render(PCBlocks.IGNISTEEL_LANTERN_BLOCK, cutout);
        render(PCBlocks.SOUL_IGNISTEEL_LANTERN_BLOCK, cutout);

        render(PCBlocks.OVERGROWN_WRETCHED_LEAF, cutout);
        render(PCBlocks.WHITE_WRETCHED_LEAF, cutout);
        render(PCBlocks.GRAY_WRETCHED_LEAF, cutout);
        render(PCBlocks.GREEN_WRETCHED_LEAF, cutout);
        render(PCBlocks.BLACK_WRETCHED_LEAF, cutout);
        render(PCBlocks.BLUE_WRETCHED_LEAF, cutout);
        render(PCBlocks.LIGHT_BLUE_WRETCHED_LEAF, cutout);
        render(PCBlocks.LIGHT_GRAY_WRETCHED_LEAF, cutout);
        render(PCBlocks.LIME_WRETCHED_LEAF, cutout);
        render(PCBlocks.PURPLE_WRETCHED_LEAF, cutout);
        render(PCBlocks.CYAN_WRETCHED_LEAF, cutout);
        render(PCBlocks.ORANGE_WRETCHED_LEAF, cutout);
        render(PCBlocks.BROWN_WRETCHED_LEAF, cutout);
        render(PCBlocks.RED_WRETCHED_LEAF, cutout);
        render(PCBlocks.YELLOW_WRETCHED_LEAF, cutout);
        render(PCBlocks.PINK_WRETCHED_LEAF, cutout);
        render(PCBlocks.MAGENTA_WRETCHED_LEAF, cutout);
        render(PCBlocks.WRETCHED_LEAF, cutout);
    }
    public static void registerBlockColors() {
        BlockColors blockColors = Minecraft.getInstance().getBlockColors();
        BlockColor oakLeafColor = (x, world, pos, u) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor();
        blockColors.register(oakLeafColor, PCBlocks.OVERGROWN_WRETCHED_LEAF.get());
    }


    public static void registerItemColors() {
        BlockColors bColors = Minecraft.getInstance().getBlockColors();
        ItemColors iColors = Minecraft.getInstance().getItemColors();

        iColors.register((stack, tint) -> bColors.getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, 0),
                PCBlocks.OVERGROWN_WRETCHED_LEAF.get()

        );

    }
}
