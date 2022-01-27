package com.surrealitymodding.the_patchlands.core;

import com.surrealitymodding.the_patchlands.client.PatchlandsClient;
import com.surrealitymodding.the_patchlands.core.registry.EMBlocks;
import com.surrealitymodding.the_patchlands.core.registry.EMItems;
import gg.moonflower.pollen.api.platform.Platform;

public class ThePatchlands {
    public static final String MOD_ID = "the_patchlands";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(ThePatchlands::onClientInit)
            .clientPostInit(ThePatchlands::onClientPostInit)
            .commonInit(ThePatchlands::onCommonInit)
            .commonPostInit(ThePatchlands::onCommonPostInit)
            .build();

    public static void onClientInit() {}

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(() -> {
            PatchlandsClient.registerBlockColors();
            PatchlandsClient.registerItemColors();
        });
    }

    public static void onCommonInit() {
        EMBlocks.BLOCKS.register(ThePatchlands.PLATFORM);
        EMItems.ITEMS.register(ThePatchlands.PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {}
}