package com.fc.Goal.TileEntityRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.fc.FCCore.FloorBallCraft;
import com.fc.Goal.Models.ModelGoal4;
import com.fc.Goal.TileEntity.TileEntityGoal4;

public class TileEntityGoal4Renderer extends TileEntitySpecialRenderer
{
	
	public TileEntityGoal4Renderer(){
		model = new ModelGoal4();
		}

		public void renderAModelAt(TileEntityGoal4 tile, double d, double d1, double d2, float f) {

		int rotation = 0;
		if(tile.getWorldObj() != null)
		{
		rotation = tile.getBlockMetadata();
		}
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Models/Goal4.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glScalef(1F, -1F, -1F);
		GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
		model.renderAll();
		GL11.glPopMatrix(); //end
		}

		private ModelGoal4 model;

		public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
		{
		this.renderAModelAt((TileEntityGoal4)par1TileEntity, par2, par4, par6, par8);
		}
		}
    






