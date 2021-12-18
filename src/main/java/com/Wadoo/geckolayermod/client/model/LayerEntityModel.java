package com.Wadoo.geckolayermod.client.model;

import com.Wadoo.geckolayermod.GeckoLayerMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class LayerEntityModel extends AnimatedTickingGeoModel {

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "geo/layerentity.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "textures/entity/layerentity.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "animations/layerentity.animations.json");
    }

}
