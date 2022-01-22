package com.hauntedchest.the_patchlands;

import com.hauntedchest.the_patchlands.registry.TPBlockRegister;
import com.hauntedchest.the_patchlands.registry.TPItemRegister;
import com.hauntedchest.the_patchlands.registry.TPParticleTypes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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

        TPItemRegister.register(eventBus);
        TPBlockRegister.register(eventBus);
        TPParticleTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);
        //MinecraftForge.EVENT_BUS.addListener(IgnisteelOreBlock::dropsWhenExploded);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.IGNISTEEL_BARS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.IGNISTEEL_BAR_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.IGNISTEEL_CHAINS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.IGNISTEEL_LANTERN_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.SOUL_IGNISTEEL_LANTERN_BLOCK.get(), RenderType.cutout());

        //Wretched Leaf Colors
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.GREEN_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.WHITE_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.BLACK_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.YELLOW_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.CYAN_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.GRAY_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.LIGHT_GRAY_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.LIGHT_BLUE_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.LIME_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.RED_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.BROWN_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.ORANGE_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.MAGENTA_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.PURPLE_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.PINK_WRETCHED_LEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TPBlockRegister.BLUE_WRETCHED_LEAF.get(), RenderType.cutout());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
