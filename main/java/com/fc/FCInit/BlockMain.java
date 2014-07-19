package com.fc.FCInit;

import static com.fc.FCCore.FloorBallCraft.modid;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.fc.FCBlocks.BlockFloor;
import com.fc.FCCore.ConfigDetails;
import com.fc.Goal.Blocks.BlockGoal1;
import com.fc.Goal.Blocks.BlockGoal10;
import com.fc.Goal.Blocks.BlockGoal11;
import com.fc.Goal.Blocks.BlockGoal2;
import com.fc.Goal.Blocks.BlockGoal3;
import com.fc.Goal.Blocks.BlockGoal4;
import com.fc.Goal.Blocks.BlockGoal5;
import com.fc.Goal.Blocks.BlockGoal6;
import com.fc.Goal.Blocks.BlockGoal7;
import com.fc.Goal.Blocks.BlockGoal8;
import com.fc.Goal.Blocks.BlockGoal9;
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
import com.fc.Rink.BlockRink;
import com.fc.Rink.TileEntityRink;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockMain 
{
	public static Block Goal1;
	public static Block Goal2;
	public static Block Goal3;
	public static Block Goal4;
	public static Block Goal5;
	public static Block Goal6;
	public static Block Goal7;
	public static Block Goal8;
	public static Block Goal9;
	public static Block Goal10;
	public static Block Goal11;
	public static Block Rink;
	public static Block RinkSwing1;
	public static Block RinkSwing2;
	public static Block RinkSwing3;
	public static Block Floor;
	public static Block FloorCross;
	public static Block FloorCorner1;
	public static Block FloorCorner2;
	public static Block FloorCorner3;
	public static Block FloorCorner4;
	public static Block FloorLine1;
	public static Block FloorLine2;
	public static Block FloorLineCross1;
	public static Block FloorLineCross2;
	public static Block FloorTCross1;
	public static Block FloorTCross2;
	public static Block FloorTCross3;
	public static Block FloorTCross4;
	
	public static void Init()	
	{
		//BLocks
		Goal1 = new BlockGoal1(ConfigDetails.Goal1ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal2 = new BlockGoal2(ConfigDetails.Goal2ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal3 = new BlockGoal3(ConfigDetails.Goal3ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal4 = new BlockGoal4(ConfigDetails.Goal4ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal5 = new BlockGoal5(ConfigDetails.Goal5ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal6 = new BlockGoal6(ConfigDetails.Goal6ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal7 = new BlockGoal7(ConfigDetails.Goal7ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal8 = new BlockGoal8(ConfigDetails.Goal8ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal9 = new BlockGoal9(ConfigDetails.Goal9ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal10 = new BlockGoal10(ConfigDetails.Goal10ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		Goal11 = new BlockGoal11(ConfigDetails.Goal11ID, Material.wood).setBlockName("Goal1").setHardness(0.5F).setResistance(0F);
		
		Rink = new BlockRink(ConfigDetails.RinkID, Material.wood).setBlockName("Rink").setHardness(0.5F).setResistance(0F);
		
		Floor = new BlockFloor(Material.rock, 1).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":Floor");
		FloorCross = new BlockFloor(Material.rock, 2).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorCross");
		FloorCorner1 = new BlockFloor(Material.rock, 3).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorCorner1");
		FloorCorner2 = new BlockFloor(Material.rock, 4).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorCorner2");
		FloorCorner3 = new BlockFloor(Material.rock, 5).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorCorner3");
		FloorCorner4 = new BlockFloor(Material.rock, 6).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorCorner4");
		FloorLine1 = new BlockFloor(Material.rock, 7).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorLine1");
		FloorLine2 = new BlockFloor(Material.rock, 8).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorLine2");
		FloorLineCross1 = new BlockFloor(Material.rock, 9).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorLineCross1");
		FloorLineCross2 = new BlockFloor(Material.rock, 10).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorLineCross2");
		FloorTCross1 = new BlockFloor(Material.rock, 11).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorTCross1");
		FloorTCross2 = new BlockFloor(Material.rock, 12).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorTCross2");
		FloorTCross3 = new BlockFloor(Material.rock, 13).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorTCross3");
		FloorTCross4 = new BlockFloor(Material.rock, 14).setBlockName("Floor").setHardness(0.5F).setResistance(0F).setBlockTextureName(modid + ":FloorTCross4");
		//Goal
	    GameRegistry.registerBlock(Goal1, "Goal1");GameRegistry.registerTileEntity(TileEntityGoal1.class, "Goal1");
	    GameRegistry.registerBlock(Goal2, "Goal2");GameRegistry.registerTileEntity(TileEntityGoal2.class, "Goal2");
	    GameRegistry.registerBlock(Goal3, "Goal3");GameRegistry.registerTileEntity(TileEntityGoal3.class, "Goal3");
	    GameRegistry.registerBlock(Goal4, "Goal4");GameRegistry.registerTileEntity(TileEntityGoal4.class, "Goal4");
	    GameRegistry.registerBlock(Goal5, "Goal5");GameRegistry.registerTileEntity(TileEntityGoal5.class, "Goal5");
	    GameRegistry.registerBlock(Goal6, "Goal6");GameRegistry.registerTileEntity(TileEntityGoal6.class, "Goal6");
	    GameRegistry.registerBlock(Goal7, "Goal7");GameRegistry.registerTileEntity(TileEntityGoal7.class, "Goal7");
	    GameRegistry.registerBlock(Goal8, "Goal8");GameRegistry.registerTileEntity(TileEntityGoal8.class, "Goal8");
	    GameRegistry.registerBlock(Goal9, "Goal9");GameRegistry.registerTileEntity(TileEntityGoal9.class, "Goal9");
	    GameRegistry.registerBlock(Goal10, "Goal10");GameRegistry.registerTileEntity(TileEntityGoal10.class, "Goal10");
	    GameRegistry.registerBlock(Goal11, "Goal11");GameRegistry.registerTileEntity(TileEntityGoal11.class, "Goal11");

	    GameRegistry.registerBlock(Rink, "Rink");GameRegistry.registerTileEntity(TileEntityRink.class, "Rink");
	    GameRegistry.registerBlock(Floor, "Floor");
	    GameRegistry.registerBlock(FloorCross, "FloorCorner1");
	    GameRegistry.registerBlock(FloorCorner1, "FloorCross");
	    GameRegistry.registerBlock(FloorCorner2, "FloorCorner2");
	    GameRegistry.registerBlock(FloorCorner3, "FloorCorner3");
	    GameRegistry.registerBlock(FloorCorner4, "FloorCorner4");
	    GameRegistry.registerBlock(FloorLine1, "FloorLine1");
	    GameRegistry.registerBlock(FloorLine2, "FloorLine2");
	    GameRegistry.registerBlock(FloorLineCross1, "FloorLineCross1");
	    GameRegistry.registerBlock(FloorLineCross2, "FloorLineCross2");
	    GameRegistry.registerBlock(FloorTCross1, "FloorTCross1");
	    GameRegistry.registerBlock(FloorTCross2, "FloorTCross2");
	    GameRegistry.registerBlock(FloorTCross3, "FloorTCross3");
	    GameRegistry.registerBlock(FloorTCross4, "FloorTCross4");

	}

}
