package com.hauntedchest.the_patchlands;

import com.hauntedchest.the_patchlands.client.PatchlandsClient;
import com.hauntedchest.the_patchlands.registry.PCBlocks;
import com.hauntedchest.the_patchlands.registry.PCItems;
import com.hauntedchest.the_patchlands.registry.PCParticleTypes;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PatchlandsMain.MOD_ID)
public class PatchlandsMain
{
    public static final String MOD_ID = "the_patchlands";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public PatchlandsMain() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PCItems.register(eventBus);
        PCBlocks.register(eventBus);
        PCParticleTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);
        //MinecraftForge.EVENT_BUS.addListener(IgnisteelOreBlock::dropsWhenExploded);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        PatchlandsClient.registerBlockRenderers();

        event.enqueueWork(() -> {
            PatchlandsClient.registerBlockColors();
            PatchlandsClient.registerItemColors();
        });

    }

    private void setup(final FMLCommonSetupEvent event)
    {


        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
