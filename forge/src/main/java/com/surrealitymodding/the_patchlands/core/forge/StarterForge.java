package com.surrealitymodding.the_patchlands.core.forge;

import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import net.minecraftforge.fml.common.Mod;

@Mod(ThePatchlands.MOD_ID)
public class StarterForge {
    public StarterForge() {
        ThePatchlands.PLATFORM.setup();
    }
}