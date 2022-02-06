package com.surrealitymodding.the_patchlands.core.registry;

import com.surrealitymodding.the_patchlands.client.particle.RustParticle;
import com.surrealitymodding.the_patchlands.core.ThePatchlands;
import gg.moonflower.pollen.api.event.events.registry.client.ParticleFactoryRegistryEvent;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.function.Supplier;

public class PCParticles {
    public static final PollinatedRegistry<ParticleType<?>> PARTICLES = PollinatedRegistry.create(Registry.PARTICLE_TYPE, ThePatchlands.MOD_ID);

    public static final Supplier<SimpleParticleType> RUST = PARTICLES.register("rust", () -> new SimpleParticleType(false));

    public static void setupClient() {
        ParticleFactoryRegistryEvent.EVENT.register(registry -> {
            registry.register(RUST.get(), RustParticle.Provider::new);
        });
    }
}