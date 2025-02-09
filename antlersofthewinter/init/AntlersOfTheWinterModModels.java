
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.antlersofthewinter.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.antlersofthewinter.client.model.Modelhorn1_Converted;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AntlersOfTheWinterModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhorn1_Converted.LAYER_LOCATION, Modelhorn1_Converted::createBodyLayer);
	}
}
