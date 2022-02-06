package com.surrealitymodding.the_patchlands.core;

import com.surrealitymodding.the_patchlands.core.registry.PCBlocks;
import com.surrealitymodding.the_patchlands.core.registry.PCItems;
import com.surrealitymodding.the_patchlands.core.registry.PCParticles;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.client.ColorRegistry;
import gg.moonflower.pollen.api.registry.client.RenderTypeRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;

public class ThePatchlands {
    public static final String MOD_ID = "the_patchlands";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(ThePatchlands::onClientInit)
            .clientPostInit(ThePatchlands::onClientPostInit)
            .commonInit(ThePatchlands::onCommonInit)
            .commonPostInit(ThePatchlands::onCommonPostInit)
            .build();

    public static void onClientInit() {
        ColorRegistry.register((x, world, pos, u) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(), PCBlocks.OVERGROWN_WRETCHED_LEAF);
        ColorRegistry.register(((stack, tint) -> Minecraft.getInstance().getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, 0)), PCBlocks.OVERGROWN_WRETCHED_LEAF);

        PCParticles.setupClient();
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
        RenderTypeRegistry.register(PCBlocks.IGNISTEEL_BARS.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.IGNISTEEL_BAR_DOOR.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.IGNISTEEL_CHAINS.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.IGNISTEEL_LANTERN_BLOCK.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.SOUL_IGNISTEEL_LANTERN_BLOCK.get(), RenderType.cutout());

        RenderTypeRegistry.register(PCBlocks.OVERGROWN_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.WHITE_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.GRAY_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.GREEN_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.BLACK_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.BLUE_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.LIGHT_BLUE_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.LIGHT_GRAY_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.LIME_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.PURPLE_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.CYAN_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.ORANGE_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.BROWN_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.RED_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.YELLOW_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.PINK_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.MAGENTA_WRETCHED_LEAF.get(), RenderType.cutout());
        RenderTypeRegistry.register(PCBlocks.WRETCHED_LEAF.get(), RenderType.cutout());
    }

    public static void onCommonInit() {
        PCBlocks.BLOCKS.register(ThePatchlands.PLATFORM);
        PCItems.ITEMS.register(ThePatchlands.PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }
}