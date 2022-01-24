package com.hauntedchest.the_patchlands.registry;

import com.hauntedchest.the_patchlands.PatchlandsMain;
import com.hauntedchest.the_patchlands.item.TPCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PCItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PatchlandsMain.MOD_ID);

    public static final RegistryObject<Item> WRETCHED_BEANS = ITEMS.register("wretched_beans",
            () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));

    public static final RegistryObject<Item> RAW_IGNISTEEL = ITEMS.register("raw_ignisteel",
            () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));

    public static final RegistryObject<Item> IGNISTEEL_NUGGET = ITEMS.register("ignisteel_nugget",
            () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));

    public static final RegistryObject<Item> IGNISTEEL_INGOT = ITEMS.register("ignisteel_ingot",
            () -> new Item(new Item.Properties().tab(TPCreativeTab.PATCHLANDS_ITEMS_TAB)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
