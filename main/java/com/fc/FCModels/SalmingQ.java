package com.fc.FCModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SalmingQ extends ModelBase
{
	//fields
	public ModelRenderer Shaft;
	public ModelRenderer Blade;

	public SalmingQ()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shaft = new ModelRenderer(this, 16, 0);
		Shaft.addBox(0F, 0F, 0F, 1, 18, 1);
		Shaft.setRotationPoint(-5F, 6F, 7F);
		Shaft.setTextureSize(64, 32);
		Shaft.mirror = true;
		setRotation(Shaft, -0.4461433F, 0F, 0F);
		Blade = new ModelRenderer(this, 0, 0);
		Blade.addBox(0F, 0F, 0F, 1, 2, 6);
		Blade.setRotationPoint(-5F, 22F, -5.5F);
		Blade.setTextureSize(64, 32);
		Blade.mirror = true;
		setRotation(Blade, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shaft.render(f5);
		Blade.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}


}
