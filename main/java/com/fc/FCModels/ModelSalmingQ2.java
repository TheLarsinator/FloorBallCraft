// Date: 12.04.2013 20:36:47
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.fc.FCModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSalmingQ2 extends ModelBase
{
  //fields
	public ModelRenderer Shaft;
	public ModelRenderer Blade;
  
  public ModelSalmingQ2()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shaft = new ModelRenderer(this, 0, 0);
      Shaft.addBox(0F, 0F, 0F, 1, 17, 1);
      Shaft.setRotationPoint(0F, 6F, 3.5F);
      Shaft.setTextureSize(64, 32);
      Shaft.mirror = true;
      setRotation(Shaft, -0.2602503F, 0F, 0F);
      Blade = new ModelRenderer(this, 5, 0);
      Blade.addBox(0F, 0F, 0F, 1, 2, 5);
      Blade.setRotationPoint(0F, 22F, -4.7F);
      Blade.setTextureSize(64, 32);
      Blade.mirror = true;
      setRotation(Blade, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, null);
    Shaft.render(f5);
    Blade.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}