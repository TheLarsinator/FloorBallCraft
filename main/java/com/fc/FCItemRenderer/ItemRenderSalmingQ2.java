package com.fc.FCItemRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.fc.FCCore.FloorBallCraft;
import com.fc.FCModels.SalmingQ;

public class ItemRenderSalmingQ2 implements IItemRenderer {

	protected SalmingQ StickModel;

	public ItemRenderSalmingQ2()
	{
		StickModel = new SalmingQ();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED:
			return true;
		case EQUIPPED_FIRST_PERSON:
			return true;
		default: 
			return false;
		}

	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) 
	{

		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		switch(type)
		{
		case EQUIPPED:
		{		
			GL11.glPushMatrix();
			
			switch(item.getItemDamage())
			{
			case 0:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2.png"));
				break;
			case 1:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2OR.png"));
				break;
			case 2:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2OG.png"));
				break;
			case 3:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2OB.png"));
				break;
			case 4:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RO.png"));
				break;
			case 5:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RR.png"));
				break;
			case 6:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RG.png"));
				break;
			case 7:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RB.png"));
				break;
			case 8:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GO.png"));
				break;
			case 9:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GR.png"));
				break;
			case 10:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GG.png"));
				break;
			case 11:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GB.png"));
				break;
			case 12:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BO.png"));
				break;
			case 13:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BR.png"));
				break;
			case 14:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BG.png"));
				break;
			case 15:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BB.png"));
				break;
			}
			
			GL11.glRotatef(90, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(50, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-90, 0.0F, 0.0F, 1.0F);
			
			boolean isFirstPerson = false;
			
			if(data[1] != null && data[1] instanceof EntityPlayer)
			{
				if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
				{
					GL11.glTranslatef(0.4F, 0.1F, -0.0F);
				}
				else
				{
					isFirstPerson = true;
					GL11.glRotatef(90, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(60, 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(-90, 0.0F, 0.0F, 1.0F);
					GL11.glTranslatef(0.0F, 0.0F, 0.0F);
				}
			}
			else
			{
			GL11.glTranslatef(0.4F, 0.1F, -0.0F);
			}
			
			float scale = 1.2F;
			
			GL11.glScalef(scale, scale, scale);
			
			StickModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
		}
		break;
		case EQUIPPED_FIRST_PERSON:
		{
			GL11.glPushMatrix();

			switch(item.getItemDamage())
			{
			case 0:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2.png"));
				break;
			case 1:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2OR.png"));
				break;
			case 2:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2OG.png"));
				break;
			case 3:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2OB.png"));
				break;
			case 4:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RO.png"));
				break;
			case 5:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RR.png"));
				break;
			case 6:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RG.png"));
				break;
			case 7:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2RB.png"));
				break;
			case 8:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GO.png"));
				break;
			case 9:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GR.png"));
				break;
			case 10:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GG.png"));
				break;
			case 11:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2GB.png"));
				break;
			case 12:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BO.png"));
				break;
			case 13:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BR.png"));
				break;
			case 14:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BG.png"));
				break;
			case 15:
				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(FloorBallCraft.modid, "FBC/Sticks/SalmingQ2BB.png"));
				break;
			}
			
			GL11.glRotatef(90, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(5, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(-90, 0.0F, 0.0F, 1.0F);
			
			GL11.glTranslatef(0.4F, 0.1F, -0.5F);

			float scale = 1.5F;
			
			GL11.glScalef(scale, scale, scale);
			
			StickModel.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
		}
		break;
		default: 
			break;
		}

	}

}
