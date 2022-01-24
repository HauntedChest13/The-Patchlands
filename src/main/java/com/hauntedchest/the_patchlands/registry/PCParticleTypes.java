package com.hauntedchest.the_patchlands.registry;

import com.hauntedchest.the_patchlands.PatchlandsMain;
import com.hauntedchest.the_patchlands.client.particle.RustParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.AshParticle;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = PatchlandsMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PCParticleTypes {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PatchlandsMain.MOD_ID);

    public static final RegistryObject<SimpleParticleType> RUST = PARTICLES.register("rust", () -> new SimpleParticleType(false));

    @SubscribeEvent
    public static void registerParticleFactories(ParticleFactoryRegisterEvent event) {
        ParticleEngine particleManager = Minecraft.getInstance().particleEngine;

        particleManager.register(RUST.get(), RustParticle.Provider::new);
    }

    public static void register(IEventBus eventBus) {
        PARTICLES.register(eventBus);
    }
}
