package com.Wadoo.geckolayermod.client;

import com.Wadoo.geckolayermod.GeckoLayerMod;
import com.Wadoo.geckolayermod.client.renderer.LayerEntityRenderer;
import com.Wadoo.geckolayermod.server.registry.GeckoEntityRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GeckoLayerMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(GeckoEntityRegistry.GEOLAYERENTITY.get(), LayerEntityRenderer::new);

    }
}