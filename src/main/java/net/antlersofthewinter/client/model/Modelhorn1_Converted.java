package net.antlersofthewinter.client.model;

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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhorn1_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("antlers_of_the_winter", "modelhorn_1_converted"), "main");
	public final ModelPart bone;

	public Modelhorn1_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(12, 11).addBox(-4.0F, -10.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).texOffs(14, 0).addBox(-8.7699F, -12.0425F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).texOffs(12, 16)
						.addBox(-15.7199F, -13.4175F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).texOffs(8, 20).addBox(-13.6985F, -13.4175F, -1.0036F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 20)
						.addBox(-8.3985F, -12.0425F, -1.0036F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-19.2449F, -19.9925F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.001F)).texOffs(24, 8).mirror()
						.addBox(-13.6985F, -19.9675F, 3.5214F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 11).mirror().addBox(1.0F, -10.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false).texOffs(14, 0)
						.mirror().addBox(4.7699F, -12.0425F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false).texOffs(12, 16).mirror().addBox(11.7199F, -13.4175F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F))
						.mirror(false).texOffs(8, 20).mirror().addBox(11.6985F, -13.4175F, -1.0036F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 20).mirror()
						.addBox(6.3985F, -12.0425F, -1.0036F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 24).mirror().addBox(17.2449F, -19.9925F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
						.texOffs(24, 8).addBox(11.6985F, -19.9675F, 3.5214F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-1.0F, -0.4437F, -0.6419F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)).mirror(false).texOffs(0, 11).addBox(-15.797F,
				-0.4437F, -0.6419F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(7.3985F, -11.6095F, 1.35F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -0.4437F, -0.6419F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)).mirror(false).texOffs(0, 0).addBox(-26.397F,
				-0.4437F, -0.6419F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(12.6985F, -12.9845F, 1.35F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-2.225F, -1.875F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(17.2049F, -13.0919F, -2.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 4).mirror().addBox(1.475F, -0.3F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.7699F, -11.0425F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 15).mirror().addBox(-0.375F, -0.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false),
				PartPose.offsetAndRotation(2.975F, -10.425F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 25).mirror().addBox(1.0F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5765F, -9.4989F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -6.5F, -0.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 17).addBox(-5.0F, -6.5F, -0.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -10.6818F, 0.7324F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(8, 25).mirror().addBox(-1.0F, -3.0F, 0.45F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false).texOffs(8, 25).addBox(-5.0F, -3.0F, 0.45F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(2.0F, -11.0F, -1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 7).addBox(-2.775F, -1.875F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.2049F, -13.0919F, -2.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 4).addBox(-5.475F, -0.3F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7699F, -11.0425F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(16, 25).addBox(-3.0F, -1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5765F, -9.4989F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 15).addBox(-1.625F, -0.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-2.975F, -10.425F, -2.0F, 0.0F, 0.0F, -0.3927F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
