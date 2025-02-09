
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.antlersofthewinter.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.antlersofthewinter.client.renderer.SnowwalkerRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AntlersOfTheWinterModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AntlersOfTheWinterModEntities.FROSTBALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AntlersOfTheWinterModEntities.SNOWWALKER.get(), SnowwalkerRenderer::new);
	}
}
