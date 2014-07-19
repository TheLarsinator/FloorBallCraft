package com.fc.FCCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.fc.FCBall.Blue.EntityBallB;
import com.fc.FCBall.Blue.ItemBallB;
import com.fc.FCBall.Green.EntityBallG;
import com.fc.FCBall.Green.ItemBallG;
import com.fc.FCBall.Orange.EntityBallO;
import com.fc.FCBall.Orange.ItemBallO;
import com.fc.FCBall.Red.EntityBallR;
import com.fc.FCBall.Red.ItemBallR;
import com.fc.FCBall.White.EntityBallW;
import com.fc.FCBall.White.ItemBallW;
import com.fc.FCInit.BlockMain;
import com.fc.FCInit.EntityMain;
import com.fc.FCInit.ItemMain;
import com.fc.FCInit.RecipeBook;
import com.fc.FCItems.ItemBlade;
import com.fc.FCItems.ItemGrip;
import com.fc.FCItems.ItemMaterials;
import com.fc.FCItems.ItemSQ2;
import com.fc.FCTabs.MyItemsTab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid = "fc",name = "FloorBallCraft", version = "0.3.3")

public class FloorBallCraft 
{
	public static String modid = "fc";

	@SidedProxy(clientSide = "com.fc.FCCore.FloorBallCraftClient",serverSide = "com.fc.FCCore.FloorBallCraftProxy")
	public static FloorBallCraftProxy proxy;

	@Instance("fc")
	public static FloorBallCraft instance;

	public static CreativeTabs FCTab = new MyItemsTab(CreativeTabs.getNextID(),"FCItems");
	
	@EventHandler
	public void preload(FMLPreInitializationEvent event)
	{
		BlockMain.Init();
		ItemMain.Init();
	}
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		RecipeBook.Init();
		EntityMain.Init();

		proxy.registerRenderInformation();
	}
}