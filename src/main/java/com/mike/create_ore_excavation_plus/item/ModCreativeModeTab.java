package com.mike.create_ore_excavation_plus.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab create_ore_excavation_plus_tab = new CreativeModeTab("create_ore_excavation_plus_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ultimate_drill.get());
        }
    };
}
