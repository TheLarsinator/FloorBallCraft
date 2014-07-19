package com.fc.FCBall.Red;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.fc.FCCore.FloorBallCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBallR extends RenderLiving
{
//	public static int i;
    public RenderBallR(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderBall(EntityBallR par1EntityBallB, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityBallB, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBall((EntityBallR)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBall((EntityBallR)par1Entity, par2, par4, par6, par8, par9);
    }
    
    
	private static final ResourceLocation Balltexture1 = new ResourceLocation(FloorBallCraft.modid, "FBC/Balls/Red.png");

	protected Random rand = new Random();

	
	
    protected ResourceLocation func_110849_a(EntityBallR par1EntityBallB)
    {
    		return Balltexture1;
    }

    
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
    	return this.func_110849_a((EntityBallR)par1Entity);

    }

}
