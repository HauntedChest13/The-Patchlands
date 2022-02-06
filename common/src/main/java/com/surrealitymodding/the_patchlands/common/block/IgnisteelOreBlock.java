package com.surrealitymodding.the_patchlands.common.block;

import com.surrealitymodding.the_patchlands.core.registry.PCItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Random;

public class IgnisteelOreBlock extends Block {
    public IgnisteelOreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void wasExploded(Level lvl, BlockPos pos, Explosion explosion){
        Random r = new Random();
        int result = r.nextInt(99-1);

        if (result < 70) {
            Block.popResource(lvl, pos, PCItems.RAW_IGNISTEEL.get().getDefaultInstance());
        }
    }
}