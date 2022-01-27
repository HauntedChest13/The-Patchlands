package com.surrealitymodding.the_patchlands.client.forge;

import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = ThePatchlands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EMClient {
    @SubscribeEvent
    public static void registerClient(final FMLClientSetupEvent event) {}
}