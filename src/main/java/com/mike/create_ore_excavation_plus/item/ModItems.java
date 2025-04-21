package com.mike.create_ore_excavation_plus.item;

import com.mike.create_ore_excavation_plus.create_ore_excavation_plus;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(create_ore_excavation_plus.MOD_ID);

    public static final DeferredHolder<Item, Item> ultimate_drill = ITEMS.register("ultimate_drill",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredHolder<Item, Item> cut_raw_diamond = ITEMS.register("cut_raw_diamond",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> heated_raw_diamond = ITEMS.register("heated_raw_diamond",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> raw_diamond_dust = ITEMS.register("raw_diamond_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> washed_raw_diamond = ITEMS.register("washed_raw_diamond",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> pressed_raw_diamond = ITEMS.register("pressed_raw_diamond",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> cut_raw_emerald = ITEMS.register("cut_raw_emerald",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> pressed_raw_emerald = ITEMS.register("pressed_raw_emerald",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> heated_raw_emerald = ITEMS.register("heated_raw_emerald",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> raw_emerald_dust = ITEMS.register("raw_emerald_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> washed_raw_emerald = ITEMS.register("washed_raw_emerald",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> raw_netherite_scrap = ITEMS.register("raw_netherite_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> burned_netherite_scrap = ITEMS.register("burned_netherite_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> haunted_raw_netherite_scrap = ITEMS.register("haunted_raw_netherite_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> fired_netherite_scrap = ITEMS.register("fired_netherite_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> lavad_netherite_scrap = ITEMS.register("lavad_netherite_scrap",
            () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> crushed_redstone = ITEMS.register("crushed_redstone",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> raw_lapis_lazuli = ITEMS.register("raw_lapis_lazuli",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> crushed_lapis_lazuli = ITEMS.register("crushed_lapis_lazuli",
            () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, EnchantedLapisLazuliItem> enchanted_lapis_lazuli = ITEMS.register("enchanted_lapis_lazuli",
            () -> new EnchantedLapisLazuliItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
