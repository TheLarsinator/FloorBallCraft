package com.fc.FCItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.fc.FCCore.FloorBallCraft;
import com.fc.FCInit.BlockMain;

public class ItemFieldCleaner extends ItemSpade
{
	int ID;
	public ItemFieldCleaner(Item.ToolMaterial par2EnumToolMaterial, int par1) 
	{
		super(par2EnumToolMaterial);
		this.setCreativeTab(FloorBallCraft.FCTab);
		ID = par1;
	}
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World world, int i, int j, int k, int par7, float par8, float par9, float par10)
    {
    	if(ID ==1)
    	{
    	world.setBlockToAir(i, j, k);
    	world.setBlockToAir(i+1, j, k);
    	world.setBlockToAir(i-1, j, k);
    	world.setBlockToAir(i, j, k+1);
    	world.setBlockToAir(i, j, k-1);
    	world.setBlockToAir(i+1, j, k-1);
    	world.setBlockToAir(i-1, j, k-1);
    	world.setBlockToAir(i+1, j, k+1);
    	world.setBlockToAir(i-1, j, k+1);
        return true;
    	}
    	else
    	{
    		world.setBlock(i, j, k, BlockMain.Floor);
    		world.setBlock(i+1, j, k, BlockMain.Floor);
    		world.setBlock(i-1, j, k, BlockMain.Floor);
    		world.setBlock(i, j, k-1, BlockMain.Floor);
    		world.setBlock(i, j, k+1, BlockMain.Floor);
    		world.setBlock(i+1, j, k-1, BlockMain.Floor);
    		world.setBlock(i-1, j, k-1, BlockMain.Floor);
    		world.setBlock(i+1, j, k+1, BlockMain.Floor);
    		world.setBlock(i-1, j, k+1, BlockMain.Floor);
    		return true;
    	}
    }
}