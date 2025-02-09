
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.antlersofthewinter.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.antlersofthewinter.entity.SnowwalkerEntity;
import net.antlersofthewinter.entity.FrostballProjectileEntity;
import net.antlersofthewinter.AntlersOfTheWinterMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AntlersOfTheWinterModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AntlersOfTheWinterMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FrostballProjectileEntity>> FROSTBALL_PROJECTILE = register("frostball_projectile",
			EntityType.Builder.<FrostballProjectileEntity>of(FrostballProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowwalkerEntity>> SNOWWALKER = register("snowwalker",
			EntityType.Builder.<SnowwalkerEntity>of(SnowwalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(25).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		SnowwalkerEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SNOWWALKER.get(), SnowwalkerEntity.createAttributes().build());
	}
}
