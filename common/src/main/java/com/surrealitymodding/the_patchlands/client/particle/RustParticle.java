package com.surrealitymodding.the_patchlands.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.WhiteAshParticle;
import net.minecraft.core.particles.SimpleParticleType;

@Environment(EnvType.CLIENT)
public class RustParticle extends WhiteAshParticle {
    protected RustParticle(ClientLevel pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed, float pQuadSizeMultiplier, SpriteSet pSprites) {
        super(pLevel,pX,pY,pZ,pXSpeed,pYSpeed,pZSpeed, pQuadSizeMultiplier,pSprites);
    }

    @Environment(EnvType.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet pSprites) {
            this.sprites = pSprites;
        }

        public Particle createParticle(SimpleParticleType pType, ClientLevel pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
            return new RustParticle(pLevel, pX, pY, pZ, 0.0D, 0.0D, 0.0D, 1.0F, this.sprites);
        }
    }
}
