package com.Wadoo.geckolayermod.client.model;

import com.Wadoo.geckolayermod.GeckoLayerMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class LEModel extends AnimatedTickingGeoModel {

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "geo/le.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "textures/entity/le.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "animations/le.animations.json");
    }

}
