package com.mike.create_ore_excavation_plus.item;

import com.mike.create_ore_excavation_plus.create_ore_excavation_plus;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, create_ore_excavation_plus.MOD_ID);

    public static final RegistryObject<Item> cut_raw_diamond = ITEMS.register("cut_raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> pressed_raw_diamond = ITEMS.register("pressed_raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> cut_raw_emerald = ITEMS.register("cut_raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> pressed_raw_emerald = ITEMS.register("pressed_raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
