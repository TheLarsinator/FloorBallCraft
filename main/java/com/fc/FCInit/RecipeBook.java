package com.fc.FCInit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import static com.fc.FCInit.BlockMain.*;
import static com.fc.FCInit.ItemMain.*;

public class RecipeBook 
{
	public static void Init()
	{
		GameRegistry.addRecipe(new ItemStack(Grip, 1, 0), new Object [] {"#", "X", '#', new ItemStack(Items.dye, 0, 14), Character.valueOf('X'), Items.paper});
		GameRegistry.addRecipe(new ItemStack(Grip, 1, 1), new Object [] {"#", "X", '#', new ItemStack(Items.dye, 0, 1), Character.valueOf('X'), Items.paper});
		GameRegistry.addRecipe(new ItemStack(Grip, 1, 2), new Object [] {"#", "X", '#', new ItemStack(Items.dye, 0, 2), Character.valueOf('X'), Items.paper});
		GameRegistry.addRecipe(new ItemStack(Grip, 1, 3), new Object [] {"#", "X", '#', new ItemStack(Items.dye, 0, 4), Character.valueOf('X'), Items.paper});
		
		
		GameRegistry.addRecipe(new ItemStack(Blade, 1, 0), new Object [] {"X  ", "ZZZ",'X', new ItemStack(Items.dye, 0, 14), Character.valueOf('Z'), Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Blade, 1, 1), new Object [] {"X  ", "ZZZ",'X', new ItemStack(Items.dye, 0, 1), Character.valueOf('Z'), Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Blade, 1, 2), new Object [] {"X  ", "ZZZ",'X', new ItemStack(Items.dye, 0, 2), Character.valueOf('Z'), Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(Blade, 1, 3), new Object [] {"X  ", "ZZZ",'X', new ItemStack(Items.dye, 0, 4), Character.valueOf('Z'), Items.iron_ingot});
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.getItemFromBlock(Floor)), (new ItemStack(Items.dye, 1, 12)), new ItemStack(Blocks.stone, 64, 0)));
		
		GameRegistry.addRecipe(new ItemStack(BallW, 1, 117), new Object [] {" X ", "X#X", " X ", Character.valueOf('X'), Items.paper, Character.valueOf('#'), Items.slime_ball});
		GameRegistry.addShapelessRecipe(new ItemStack(BallO, 1, 118), new Object[]{new ItemStack(Items.dye, 0, 14), new ItemStack(BallW, 0, 117) });
		GameRegistry.addShapelessRecipe(new ItemStack(BallR, 1, 119), new Object[]{new ItemStack(Items.dye, 0, 1), new ItemStack(BallW, 0, 117) });
		GameRegistry.addShapelessRecipe(new ItemStack(BallG, 1, 121), new Object[]{new ItemStack(Items.dye, 0, 2), new ItemStack(BallW, 0, 117) });
		GameRegistry.addShapelessRecipe(new ItemStack(BallB, 1, 122), new Object[]{new ItemStack(Items.dye, 0, 4), new ItemStack(BallW, 0, 117) });
		GameRegistry.addShapelessRecipe(new ItemStack(Floor, 16,0), new Object[]{new ItemStack(Items.dye, 0, 12), new ItemStack(Blocks.stone) });

		
		GameRegistry.addRecipe(new ItemStack(Shaft, 1), new Object [] {"Z  ", " # ", "  Z", Character.valueOf('Z'), Items.iron_ingot, Character.valueOf('#'), Items.stick, Character.valueOf('Z'), Items.iron_ingot});
			//Shafts
		GameRegistry.addRecipe(new ItemStack(ShaftQ2, 1), new Object [] {"Z  ", " # ", "  X", 'X', new ItemStack(Items.dye, 0, 11), Character.valueOf('#'), Shaft, 'Z', new ItemStack(Items.dye, 0, 8)});
			
		//Sticks
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 0), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 0), 'Z', new ItemStack(Blade, 0, 0)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 1), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 0), 'Z', new ItemStack(Blade, 0, 1)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 2), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 0), 'Z', new ItemStack(Blade, 0, 2)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 3), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 0), 'Z', new ItemStack(Blade, 0, 3)});
		
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 4), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 1), 'Z', new ItemStack(Blade, 0, 0)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 5), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 1), 'Z', new ItemStack(Blade, 0, 1)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 6), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 1), 'Z', new ItemStack(Blade, 0, 2)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 7), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 1), 'Z', new ItemStack(Blade, 0, 3)});
		
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 8), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 2), 'Z', new ItemStack(Blade, 0, 0)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 9), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 2), 'Z', new ItemStack(Blade, 0, 1)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 10), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 2), 'Z', new ItemStack(Blade, 0, 2)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 11), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 2), 'Z', new ItemStack(Blade, 0, 3)});
		
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 12), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 3), 'Z', new ItemStack(Blade, 0, 0)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 13), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 3), 'Z', new ItemStack(Blade, 0, 1)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 14), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 3), 'Z', new ItemStack(Blade, 0, 2)});
		GameRegistry.addRecipe(new ItemStack(SalmingQ2, 1, 15), new Object [] {"#  ", " X ", "  Z", Character.valueOf('X'), ShaftQ2, '#', new ItemStack(Grip, 0, 3), 'Z', new ItemStack(Blade, 0, 3)});
	
		GameRegistry.addRecipe(new ItemStack(Net, 1), new Object [] {"XXX", "XZX", "XXX", 'Z', new ItemStack(Items.dye, 0, 0), Character.valueOf('X'), Items.string});
		GameRegistry.addRecipe(new ItemStack(Goal1, 1), new Object [] {"XXX", "XZX", "XZX", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Z'), Net});
		GameRegistry.addRecipe(new ItemStack(Rink, 32), new Object [] {"XZX", "XZX", "XZX", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('Z'), Blocks.iron_block});
		GameRegistry.addRecipe(new ItemStack(LineBrush, 1), new Object [] {" X ", " Z ", " Y ", Character.valueOf('X'), new ItemStack(Items.dye, 0, 14), Character.valueOf('Z'), Items.feather, Character.valueOf('Y'), Items.stick});

	}
}
