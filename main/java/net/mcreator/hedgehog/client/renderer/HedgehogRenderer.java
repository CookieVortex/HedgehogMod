
package net.mcreator.hedgehog.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.hedgehog.entity.HedgehogEntity;
import net.mcreator.hedgehog.client.model.ModelhedgehogTest;

public class HedgehogRenderer extends MobRenderer<HedgehogEntity, ModelhedgehogTest<HedgehogEntity>> {
	public HedgehogRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelhedgehogTest(context.bakeLayer(ModelhedgehogTest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HedgehogEntity entity) {
		return new ResourceLocation("hedgehog:textures/entities/texture.png");
	}
}
