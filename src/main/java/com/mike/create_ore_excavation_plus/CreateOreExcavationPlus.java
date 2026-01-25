package com.mike.create_ore_excavation_plus;

import com.mike.create_ore_excavation_plus.item.ModCreativeModeTabs;
import com.mike.create_ore_excavation_plus.item.ModItems;
import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateOreExcavationPlus.MOD_ID)
public class CreateOreExcavationPlus
{
    public static final String MOD_ID = "create_ore_excavation_plus";
    private static final Logger LOGGER = LogUtils.getLogger();

    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);


    public CreateOreExcavationPlus(IEventBus modEventBus, ModContainer modContainer)
    {
        onCtor(modEventBus, modContainer);
    }

    public static void onCtor(IEventBus modEventBus, ModContainer modContainer)
    {
        ModLoadingContext modLoadingContext = ModLoadingContext.get();
//        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRATE.registerEventListeners(modEventBus);

        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        modEventBus.addListener(CreateOreExcavationPlus::onRegister);
    }

    public static void onRegister(final RegisterEvent event) {

    }


    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("create_ore_excavation_plus is starting up on the server side!");
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("create_ore_excavation_plus is starting up on the client side!");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
