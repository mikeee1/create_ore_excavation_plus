package com.mike.create_ore_excavation_plus.item;

import com.mike.create_ore_excavation_plus.create_ore_excavation_plus;
import com.tterrag.registrate.util.entry.RegistryEntry;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, create_ore_excavation_plus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_ORE_EXCAVATION_PLUS_TAB = CREATIVE_MODE_TABS.register("create_ore_excavation_plus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ultimate_drill.get()))
                    .title(Component.translatable("itemGroup.create_ore_excavation_plus_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ultimate_drill.get());
                        pOutput.accept(ModItems.cut_raw_diamond.get());
                        pOutput.accept(ModItems.heated_raw_diamond.get());
                        pOutput.accept(ModItems.raw_diamond_dust.get());
                        pOutput.accept(ModItems.washed_raw_diamond.get());
                        pOutput.accept(ModItems.pressed_raw_diamond.get());
                        pOutput.accept(ModItems.cut_raw_emerald.get());
                        pOutput.accept(ModItems.pressed_raw_emerald.get());
                        pOutput.accept(ModItems.heated_raw_emerald.get());
                        pOutput.accept(ModItems.raw_emerald_dust.get());
                        pOutput.accept(ModItems.washed_raw_emerald.get());
                        pOutput.accept(ModItems.raw_netherite_scrap.get());
                        pOutput.accept(ModItems.burned_netherite_scrap.get());
                        pOutput.accept(ModItems.haunted_raw_netherite_scrap.get());
                        pOutput.accept(ModItems.fired_netherite_scrap.get());
                        pOutput.accept(ModItems.lavad_netherite_scrap.get());
                        pOutput.accept(ModItems.crushed_redstone.get());
                        pOutput.accept(ModItems.raw_lapis_lazuli.get());
                        pOutput.accept(ModItems.crushed_lapis_lazuli.get());
                        pOutput.accept(ModItems.enchanted_lapis_lazuli.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
