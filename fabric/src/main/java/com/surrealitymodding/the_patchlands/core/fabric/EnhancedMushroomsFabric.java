package com.surrealitymodding.the_patchlands.core.fabric;

import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import net.fabricmc.api.ModInitializer;

public class EnhancedMushroomsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ThePatchlands.PLATFORM.setup();
    }
}