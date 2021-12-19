package com.Wadoo.geckolayermod.client.renderer;

import com.Wadoo.geckolayermod.client.layer.GeoExampleLayer;
import com.Wadoo.geckolayermod.client.model.AEModel;
import com.Wadoo.geckolayermod.client.model.LEModel;
import com.Wadoo.geckolayermod.server.entity.AEEntity;
import com.Wadoo.geckolayermod.server.entity.LEEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AERenderer extends GeoEntityRenderer<AEEntity> {

    public AERenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AEModel());
        this.shadowRadius = 0.45f;
    }
}
