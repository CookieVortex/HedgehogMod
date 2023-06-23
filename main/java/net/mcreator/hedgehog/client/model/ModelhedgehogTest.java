package net.mcreator.hedgehog.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelhedgehogTest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hedgehog", "modelhedgehog_test"), "main");
	public final ModelPart Body;
	public final ModelPart Legs;
	public final ModelPart Nose;
	public final ModelPart Ears;

	public ModelhedgehogTest(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Legs = root.getChild("Legs");
		this.Nose = root.getChild("Nose");
		this.Ears = root.getChild("Ears");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition Legs = partdefinition.addOrReplaceChild("Legs",
				CubeListBuilder.create().texOffs(1, 1).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition Nose = partdefinition.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offset(0.0F, 22.5F, -3.1F));
		PartDefinition cube_r1 = Nose.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -0.5515F, -1.0295F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Ears = partdefinition.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = Ears.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8693F, -1.3425F, -0.5013F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6529F, -5.2878F, -1.9873F, 0.0873F, 0.0873F, -0.6981F));
		PartDefinition cube_r3 = Ears.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.1307F, -1.3425F, -0.5013F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6529F, -5.2878F, -1.9873F, 0.0873F, -0.0873F, 0.6981F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Nose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ears.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Legs.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
