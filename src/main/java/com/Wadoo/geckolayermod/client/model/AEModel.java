package com.Wadoo.geckolayermod.client.model;

import com.Wadoo.geckolayermod.GeckoLayerMod;
import com.Wadoo.geckolayermod.server.entity.AEEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class AEModel extends AnimatedTickingGeoModel {

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "geo/ae.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "textures/entity/ae.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return new ResourceLocation(GeckoLayerMod.MOD_ID, "animations/ae.animations.json");
    }

    public void setLivingAnimations(AEEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");
        EntityModelData extraData = (EntityModelData)customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
        head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 200F));
    }
}
