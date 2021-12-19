package com.Wadoo.geckolayermod.client;

import com.Wadoo.geckolayermod.GeckoLayerMod;
import com.Wadoo.geckolayermod.client.renderer.AERenderer;
import com.Wadoo.geckolayermod.client.renderer.LERenderer;
import com.Wadoo.geckolayermod.server.entity.AEEntity;
import com.Wadoo.geckolayermod.server.registry.EntityRegister;
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
        event.registerEntityRenderer(EntityRegister.GEOLAYERENTITY.get(), LERenderer::new);
        event.registerEntityRenderer(EntityRegister.GEOATTACKENTITY.get(), AERenderer::new);

    }
}