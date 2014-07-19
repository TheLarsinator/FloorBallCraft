package com.fc.FCCore;

import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import com.fc.FCBall.Blue.EntityBallB;
import com.fc.FCBall.Blue.RenderBallB;
import com.fc.FCBall.Green.EntityBallG;
import com.fc.FCBall.Green.RenderBallG;
import com.fc.FCBall.Orange.EntityBallO;
import com.fc.FCBall.Orange.RenderBallO;
import com.fc.FCBall.Red.EntityBallR;
import com.fc.FCBall.Red.RenderBallR;
import com.fc.FCBall.White.EntityBallW;
import com.fc.FCBall.White.RenderBallW;
import com.fc.FCInit.BlockMain;
import com.fc.FCInit.ItemMain;
import com.fc.FCItemRenderer.ItemRenderSalmingQ2;
import com.fc.FCModels.FloorBall;
import com.fc.Goal.TileEntity.TileEntityGoal1;
import com.fc.Goal.TileEntity.TileEntityGoal10;
import com.fc.Goal.TileEntity.TileEntityGoal11;
import com.fc.Goal.TileEntity.TileEntityGoal2;
import com.fc.Goal.TileEntity.TileEntityGoal3;
import com.fc.Goal.TileEntity.TileEntityGoal4;
import com.fc.Goal.TileEntity.TileEntityGoal5;
import com.fc.Goal.TileEntity.TileEntityGoal6;
import com.fc.Goal.TileEntity.TileEntityGoal7;
import com.fc.Goal.TileEntity.TileEntityGoal8;
import com.fc.Goal.TileEntity.TileEntityGoal9;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal10Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal11Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal1Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal2Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal3Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal4Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal5Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal6Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal7Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal8Renderer;
import com.fc.Goal.TileEntityRenderer.TileEntityGoal9Renderer;
import com.fc.Rink.ItemRenderRink;
import com.fc.Rink.TileEntityRenderRink;
import com.fc.Rink.TileEntityRink;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FloorBallCraftClient extends FloorBallCraftProxy
{
    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
        {
    		MinecraftForgeClient.registerItemRenderer(ItemMain.SalmingQ2, (IItemRenderer)new ItemRenderSalmingQ2());

    		RenderingRegistry.registerEntityRenderingHandler(EntityBallW.class, new RenderBallW(new FloorBall(), 0.1F));
    		RenderingRegistry.registerEntityRenderingHandler(EntityBallO.class, new RenderBallO(new FloorBall(), 0.1F));
    		RenderingRegistry.registerEntityRenderingHandler(EntityBallR.class, new RenderBallR(new FloorBall(), 0.1F));
    		RenderingRegistry.registerEntityRenderingHandler(EntityBallG.class, new RenderBallG(new FloorBall(), 0.1F));
    		RenderingRegistry.registerEntityRenderingHandler(EntityBallB.class, new RenderBallB(new FloorBall(), 0.1F));
        
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal1.class, new TileEntityGoal1Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal2.class, new TileEntityGoal2Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal3.class, new TileEntityGoal3Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal4.class, new TileEntityGoal4Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal5.class, new TileEntityGoal5Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal6.class, new TileEntityGoal6Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal7.class, new TileEntityGoal7Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal8.class, new TileEntityGoal8Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal9.class, new TileEntityGoal9Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal10.class, new TileEntityGoal10Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoal11.class, new TileEntityGoal11Renderer());
      		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRink.class, new TileEntityRenderRink());

      		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockMain.Rink), (new ItemRenderRink()));

        }
    
    
    public void registerSound() {
    	//MinecraftForge.EVENT_BUS.register(new LotsOMobs_EventSounds());
    }
    
    public int addArmor(String armor){
    	return RenderingRegistry.addNewArmourRendererPrefix(armor);
    } 
}
