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
    public static final RegistryObject<Item> heated_raw_diamond = ITEMS.register("heated_raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> raw_diamond_dust = ITEMS.register("raw_diamond_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> washed_raw_diamond = ITEMS.register("washed_raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> pressed_raw_diamond = ITEMS.register("pressed_raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> cut_raw_emerald = ITEMS.register("cut_raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> pressed_raw_emerald = ITEMS.register("pressed_raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> heated_raw_emerald = ITEMS.register("heated_raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> raw_emerald_dust = ITEMS.register("raw_emerald_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> washed_raw_emerald = ITEMS.register("washed_raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> raw_netherite_scrap = ITEMS.register("raw_netherite_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> burned_netherite_scrap = ITEMS.register("burned_netherite_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> haunted_raw_netherite_scrap = ITEMS.register("haunted_raw_netherite_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> fired_netherite_scrap = ITEMS.register("fired_netherite_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> lavad_netherite_scrap = ITEMS.register("lavad_netherite_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));
    public static final RegistryObject<Item> ultimate_drill = ITEMS.register("ultimate_drill",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab).stacksTo(1)));
    public static final RegistryObject<Item> crushed_redstone = ITEMS.register("crushed_redstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.create_ore_excavation_plus_tab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
