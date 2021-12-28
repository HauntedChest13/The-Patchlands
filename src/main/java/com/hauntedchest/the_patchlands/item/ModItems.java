package com.hauntedchest.the_patchlands.item;

import com.hauntedchest.the_patchlands.PatchlandsMain;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PatchlandsMain.MOD_ID);

    public static final RegistryObject<Item> WRETCHED_BEANS = ITEMS.register("wretched_beans",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.PATCHLANDS_ITEMS_TAB)));

    public static final RegistryObject<Item> RAW_CONVISTEEL = ITEMS.register("raw_convisteel",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.PATCHLANDS_ITEMS_TAB)));






    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
