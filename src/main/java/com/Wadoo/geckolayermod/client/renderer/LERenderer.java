package com.Wadoo.geckolayermod.client.renderer;

import com.Wadoo.geckolayermod.client.layer.GeoExampleLayer;
import com.Wadoo.geckolayermod.client.model.LEModel;
import com.Wadoo.geckolayermod.server.entity.LEEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LERenderer extends GeoEntityRenderer<LEEntity> {

    public LERenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LEModel());
        this.addLayer(new GeoExampleLayer(this));
        this.shadowRadius = 0.25f;
    }
}
