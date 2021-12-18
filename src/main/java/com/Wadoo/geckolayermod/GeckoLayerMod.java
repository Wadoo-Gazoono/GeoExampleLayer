package com.Wadoo.geckolayermod;

import com.Wadoo.geckolayermod.server.registry.EntityRegister;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("geckolayermod")
public class GeckoLayerMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "geckolayermod";
    public GeckoLayerMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        MinecraftForge.EVENT_BUS.register(this);
        EntityRegister.ENTITIES.register(bus);
        GeckoLib.initialize();
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
