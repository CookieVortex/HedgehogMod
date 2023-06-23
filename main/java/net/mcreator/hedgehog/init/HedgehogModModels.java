
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hedgehog.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.hedgehog.client.model.ModelhedgehogTest;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HedgehogModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelhedgehogTest.LAYER_LOCATION, ModelhedgehogTest::createBodyLayer);
	}
}
