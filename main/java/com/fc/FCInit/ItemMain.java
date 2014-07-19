package com.fc.FCInit;

import static com.fc.FCCore.FloorBallCraft.modid;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.fc.FCBall.Blue.ItemBallB;
import com.fc.FCBall.Green.ItemBallG;
import com.fc.FCBall.Orange.ItemBallO;
import com.fc.FCBall.Red.ItemBallR;
import com.fc.FCBall.White.ItemBallW;
import com.fc.FCCore.ConfigDetails;
import com.fc.FCItems.ItemBlade;
import com.fc.FCItems.ItemFieldCleaner;
import com.fc.FCItems.ItemGrip;
import com.fc.FCItems.ItemMaterials;
import com.fc.FCItems.ItemSQ2;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemMain 
{
	//Sticks
	public static Item SalmingQ2;

	//Balls
	public static Item BallW;
	public static Item BallO;
	public static Item BallR;
	public static Item BallG;
	public static Item BallB;
	
	//Materials
	public static Item Shaft;
	public static Item ShaftQ2;
	public static Item Grip;
	public static Item Blade;
	public static Item Net;
	public static Item LineBrush;
	public static Item FieldCleaner;
	public static Item FieldBuilder;
	
	public static void Init()
	{
		ToolMaterial EnumToolMaterialField = EnumHelper.addToolMaterial("Field", 1, 1000, 2.1F, 1, 17);

		//Sticks
		SalmingQ2 = (new ItemSQ2(ConfigDetails.SalmingQ2ID)).setUnlocalizedName("SalmingQ2OO").setFull3D();

		//Balls
		BallW = new ItemBallW().setUnlocalizedName("Ball").setTextureName(modid + ":BallW");
		BallO = new ItemBallO().setUnlocalizedName("BallO").setTextureName(modid + ":BallO");
		BallR = new ItemBallR().setUnlocalizedName("BallR").setTextureName(modid + ":BallR");
		BallG = new ItemBallG().setUnlocalizedName("BallG").setTextureName(modid + ":BallG");
		BallB = new ItemBallB().setUnlocalizedName("BallB").setTextureName(modid + ":BallB");

		//Materials
		Shaft = new ItemMaterials().setUnlocalizedName("Shaft").setTextureName(modid + ":Shaft");
		Grip = new ItemGrip().setUnlocalizedName("Grip").setTextureName(modid + ":Grip");
		Blade = new ItemBlade().setUnlocalizedName("Blade").setTextureName(modid + ":Blade");
		Net = new ItemMaterials().setUnlocalizedName("Net").setTextureName(modid + ":Net");
		LineBrush = new ItemMaterials().setUnlocalizedName("LineBrush").setTextureName(modid + ":LineBrush");
		FieldCleaner = new ItemFieldCleaner(EnumToolMaterialField, 1).setUnlocalizedName("FieldCleaner").setTextureName("FieldCleaner");
		FieldBuilder = new ItemFieldCleaner(EnumToolMaterialField, 2).setUnlocalizedName("FieldBuilder").setTextureName("FieldBuilder");
		
		//Shafts
		ShaftQ2 = new ItemMaterials().setUnlocalizedName("ShaftQ2").setTextureName(modid + ":ShaftQ2");

		GameRegistry.registerItem(BallB, "BallB", modid);
		GameRegistry.registerItem(BallG, "BallG", modid);
		GameRegistry.registerItem(BallR, "BallR", modid);
		GameRegistry.registerItem(BallO, "BallO", modid);
		GameRegistry.registerItem(BallW, "BallW", modid);
		GameRegistry.registerItem(ShaftQ2, "ShaftQ2", modid);
		GameRegistry.registerItem(Blade, "Blade", modid);
		GameRegistry.registerItem(Shaft, "Shaft", modid);
		GameRegistry.registerItem(Net, "Net", modid);
		GameRegistry.registerItem(LineBrush, "LineBrush", modid);
		GameRegistry.registerItem(SalmingQ2, "SalmingQ2", modid);
		GameRegistry.registerItem(Grip, "Grip", modid);
		GameRegistry.registerItem(FieldCleaner, "FieldCleaner", modid);
		GameRegistry.registerItem(FieldBuilder, "FieldBuilder", modid);
	}

}
