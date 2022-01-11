package com.hauntedchest.the_patchlands.block.block_classes;

import com.hauntedchest.the_patchlands.block.ModBlocks;
import com.hauntedchest.the_patchlands.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber
public class IgnisteelOreBlock extends Block {
    public IgnisteelOreBlock(Properties prop) {
        super(prop);
    }

    /*@SubscribeEvent
    public static void dropsWhenExploded(final ExplosionEvent.Detonate event) {
        Random r = new Random();
        int result = r.nextInt(100-1);

        if(event.getAffectedBlocks().contains()) {
            if (result < 90) {
                Block.popResource(event.getWorld(), event.getAffectedBlocks().get(r.nextInt(1)), ModItems.RAW_IGNISTEEL.get().getDefaultInstance());
            }
            if (result < 60) {
                Block.popResource(event.getWorld(), event.getAffectedBlocks().get(r.nextInt(1)), ModBlocks.BRITTLESTONE.get().asItem().getDefaultInstance());
            }
        }
    }*/

    public void wasExploded(Level lvl, BlockPos pos, Explosion explosion){
        Random r = new Random();
        int result = r.nextInt(99-1);

        if (result < 70) {
            Block.popResource(lvl, pos, ModItems.RAW_IGNISTEEL.get().getDefaultInstance());
        }
        if (result < 60) {
            Block.popResource(lvl, pos, ModBlocks.BRITTLESTONE.get().asItem().getDefaultInstance());
        }
    }

}
