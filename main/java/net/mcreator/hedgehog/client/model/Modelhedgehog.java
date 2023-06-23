package net.mcreator.hedgehog.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelhedgehog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hedgehog", "modelhedgehog"), "main");
	public final ModelPart Body;
	public final ModelPart Nose;
	public final ModelPart Tail;
	public final ModelPart Parts;
	public final ModelPart FrontLeftLeg;
	public final ModelPart FrontRightLeg;
	public final ModelPart BackLeftLeg;
	public final ModelPart BackRightLeg;
	public final ModelPart LeftEar;
	public final ModelPart RightEar;

	public Modelhedgehog(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Nose = root.getChild("Nose");
		this.Tail = root.getChild("Tail");
		this.Parts = root.getChild("Parts");
		this.FrontLeftLeg = root.getChild("FrontLeftLeg");
		this.FrontRightLeg = root.getChild("FrontRightLeg");
		this.BackLeftLeg = root.getChild("BackLeftLeg");
		this.BackRightLeg = root.getChild("BackRightLeg");
		this.LeftEar = root.getChild("LeftEar");
		this.RightEar = root.getChild("RightEar");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.9F, -3.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 2.9F, 0.0F));
		PartDefinition Nose = partdefinition.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offset(-0.9F, 1.5F, -3.7F));
		PartDefinition cube_r1 = Nose.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 3.5F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -4.0F, 0.4F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-1.1F, 0.9F, 4.0F));
		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 0).addBox(-0.29F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1775F, 0.1431F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Parts = partdefinition.addOrReplaceChild("Parts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Parts.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 4).addBox(-0.5F, -1.1076F, 0.01F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.3776F, -3.98F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Parts.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 3).addBox(-0.5F, -0.1F, -0.8381F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.1868F, -3.1619F, -0.2182F, 0.0F, 0.0F));
		PartDefinition FrontLeftLeg = partdefinition.addOrReplaceChild("FrontLeftLeg", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.3F, 2.5F));
		PartDefinition FrontRightLeg = partdefinition.addOrReplaceChild("FrontRightLeg", CubeListBuilder.create().texOffs(8, 12).addBox(-0.6F, -0.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6F, 0.4F, -1.5F));
		PartDefinition BackLeftLeg = partdefinition.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.4F, 2.5F));
		PartDefinition BackRightLeg = partdefinition.addOrReplaceChild("BackRightLeg", CubeListBuilder.create().texOffs(0, 3).addBox(-0.6F, -0.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6F, 0.3F, 2.6F));
		PartDefinition LeftEar = partdefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offset(-3.8F, 6.3F, -2.1F));
		PartDefinition cube_r5 = LeftEar.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8693F, -0.6575F, -0.5013F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1471F, -1.0122F, 0.1127F, 0.0873F, 0.0873F, -0.6981F));
		PartDefinition RightEar = partdefinition.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offset(1.5F, 6.4F, -2.0F));
		PartDefinition cube_r6 = RightEar.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.6296F, -1.5111F, -0.4009F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0359F, -0.1137F, -0.1613F, 0.0873F, -0.0873F, 0.6981F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Nose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Parts.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftEar.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightEar.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
