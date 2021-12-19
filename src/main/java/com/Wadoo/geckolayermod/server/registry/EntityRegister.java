package com.Wadoo.geckolayermod.server.registry;

import com.Wadoo.geckolayermod.GeckoLayerMod;
import com.Wadoo.geckolayermod.server.entity.AEEntity;
import com.Wadoo.geckolayermod.server.entity.LEEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityRegister {
        public static final DeferredRegister<EntityType<?>> ENTITIES
                = DeferredRegister.create(ForgeRegistries.ENTITIES, GeckoLayerMod.MOD_ID);

        public static final RegistryObject<EntityType<LEEntity>> GEOLAYERENTITY =
                ENTITIES.register("geolayerentity",
                        ()->EntityType.Builder.of(LEEntity::new, MobCategory.CREATURE)
                                .sized(0.45F,1.0F)
                                .build("geolayerentity"));
        public static final RegistryObject<EntityType<AEEntity>> GEOATTACKENTITY =
                ENTITIES.register("geoattackentity",
                        ()->EntityType.Builder.of(AEEntity::new, MobCategory.CREATURE)
                                .sized(0.65F,2.0F)
                                .build("geoattackentity"));
}
