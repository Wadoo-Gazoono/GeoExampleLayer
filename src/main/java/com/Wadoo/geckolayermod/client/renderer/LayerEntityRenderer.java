package com.Wadoo.geckolayermod.client.renderer;

import com.Wadoo.geckolayermod.client.layer.GeoExampleLayer;
import com.Wadoo.geckolayermod.client.model.LayerEntityModel;
import com.Wadoo.geckolayermod.server.entity.GeoLayerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LayerEntityRenderer extends GeoEntityRenderer<GeoLayerEntity> {

    public LayerEntityRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LayerEntityModel());
        this.addLayer(new GeoExampleLayer(this));
        this.shadowRadius = 0.25f;
    }
}
