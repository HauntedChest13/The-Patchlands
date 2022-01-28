package com.hauntedchest.the_patchlands.block.block_classes;

import com.hauntedchest.the_patchlands.registry.PCItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber
public class IgnisteelOreBlock extends Block {
    public IgnisteelOreBlock(Properties prop) {
        super(prop);
    }

    public void wasExploded(Level lvl, BlockPos pos, Explosion explosion){
        Random r = new Random();
        int result = r.nextInt(99-1);

        if (result < 70) {
            Block.popResource(lvl, pos, PCItems.RAW_IGNISTEEL.get().getDefaultInstance());
        }
    }

}
