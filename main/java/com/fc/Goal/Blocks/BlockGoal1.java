package com.fc.Goal.Blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.fc.FCCore.FloorBallCraft;
import com.fc.FCInit.BlockMain;
import com.fc.Goal.TileEntity.TileEntityGoal1;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGoal1 extends Block implements ITileEntityProvider
{
	public static int rotangle = new Random().nextInt(3);

public BlockGoal1(int par1, Material wood)
{
	     super(Material.wood);
	     this.setBlockBounds(0F, 0.0F, 0.0F, 0.9F, 1F, 0.1F);
			this.setCreativeTab(FloorBallCraft.FCTab);

}
@Override
public int getRenderType() {
    return -1;
}

@Override
public boolean isOpaqueCube(){
return false;
}

/**
 * Returns the quantity of items to drop on block destruction.
 */
public int quantityDropped(Random par1Random)
{
    return 1;
}

@Override
public boolean renderAsNormalBlock(){
return false;
}

@Override
public TileEntity createNewTileEntity(World var1, int var2){
 return new TileEntityGoal1();
}

/**
 * Called when the block is placed in the world.
 */
public void onBlockPlacedBy(World par1World, int i, int j, int k, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
{
    int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    par1World.setBlockMetadataWithNotify(i, j, k, l, 2);

    if(l == 1)
    {
    	par1World.setBlock(i, j+1, k,BlockMain.Goal2, 1, 2);
    	par1World.setBlock(i+1,j , k,BlockMain.Goal3, 1, 2);
    	par1World.setBlock(i+1, j+1, k,BlockMain.Goal4, 1, 2);
    	par1World.setBlock(i+1, j, k+1,BlockMain.Goal5, 1, 2);
    	par1World.setBlock(i+1, j+1, k+1,BlockMain.Goal6, 1, 2);
    	par1World.setBlock(i, j+1, k+1,BlockMain.Goal7, 1, 2);
    	par1World.setBlock(i, j, k+2,BlockMain.Goal8, 1, 2);
    	par1World.setBlock(i, j+1, k+2,BlockMain.Goal9, 1, 2);
    	par1World.setBlock(i+1, j, k+2,BlockMain.Goal10, 1, 2);
    	par1World.setBlock(i+1, j+1, k+2,BlockMain.Goal11, 1, 2); 	
    }
    if(l == 2)
    {
    	par1World.setBlock(i, j+1, k,BlockMain.Goal2, 2, 2);
    	par1World.setBlock(i ,j , k+1,BlockMain.Goal3, 2, 2);
    	par1World.setBlock(i, j+1, k+1,BlockMain.Goal4, 2, 2);
    	par1World.setBlock(i-1, j, k+1,BlockMain.Goal5, 2, 2);
    	par1World.setBlock(i-1, j+1, k+1,BlockMain.Goal6, 2, 2);
    	par1World.setBlock(i-1, j+1, k,BlockMain.Goal7, 2, 2);
    	par1World.setBlock(i-2, j, k,BlockMain.Goal8, 2, 2);
    	par1World.setBlock(i-2, j+1, k,BlockMain.Goal9, 2, 2);
    	par1World.setBlock(i-2, j, k+1,BlockMain.Goal10, 2, 2);
    	par1World.setBlock(i-2, j+1, k+1,BlockMain.Goal11, 2, 2); 	
    }
    if(l == 3)
    {
    	par1World.setBlock(i, j+1, k,BlockMain.Goal2, 3, 2);
    	par1World.setBlock(i-1,j , k,BlockMain.Goal3, 3, 2);
    	par1World.setBlock(i-1, j+1, k,BlockMain.Goal4, 3, 2);
    	par1World.setBlock(i-1, j, k-1,BlockMain.Goal5, 3, 2);
    	par1World.setBlock(i-1, j+1, k-1,BlockMain.Goal6, 3, 2);
    	par1World.setBlock(i, j+1, k-1,BlockMain.Goal7, 3, 2);
    	par1World.setBlock(i, j, k-2,BlockMain.Goal8, 3, 2);
    	par1World.setBlock(i, j+1, k-2,BlockMain.Goal9, 3, 2);
    	par1World.setBlock(i-1, j, k-2,BlockMain.Goal10, 3, 2);
    	par1World.setBlock(i-1, j+1, k-2,BlockMain.Goal11, 3, 2);	
    }
    if(l == 0)
    {
    	par1World.setBlock(i, j+1, k,BlockMain.Goal2, 0, 2);
    	par1World.setBlock(i ,j , k-1,BlockMain.Goal3, 0, 2);
    	par1World.setBlock(i, j+1, k-1,BlockMain.Goal4, 0, 2);
    	par1World.setBlock(i+1, j, k-1,BlockMain.Goal5, 0, 2);
    	par1World.setBlock(i+1, j+1, k-1,BlockMain.Goal6, 0, 2);
    	par1World.setBlock(i+1, j+1, k,BlockMain.Goal7, 0, 2);
    	par1World.setBlock(i+2, j, k,BlockMain.Goal8, 0, 2);
    	par1World.setBlock(i+2, j+1, k,BlockMain.Goal9, 0, 2);
    	par1World.setBlock(i+2, j, k-1,BlockMain.Goal10, 0, 2);
    	par1World.setBlock(i+2, j+1, k-1,BlockMain.Goal11, 0, 2); 	
    }
}

@Override
@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister iconRegister)
{

    blockIcon = iconRegister.registerIcon(FloorBallCraft.modid + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}


public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
{
	if(par1World.getBlockMetadata(par2, par3, par4) == 1)
	{
    this.setBlockBounds(0F, 0.0F, 0.0F, 1F, 1F, 0.1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 2)
	{
    this.setBlockBounds(0.9F, 0.0F, 0.0F, 1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 3)
	{
    this.setBlockBounds(0F, 0.0F, 0.9F, 1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 0)
	{
    this.setBlockBounds(0F, 0.0F, 0.0F, .1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	
    this.setBlockBoundsForItemRender();
}

public void breakBlock(World par1World, int x, int y, int z, Block block, int par6)
{
	if(par1World.getBlockMetadata(x, y, z) == 0)
	{
		par1World.setBlockToAir(x , y + 1, z-1);
		par1World.setBlockToAir(x + 1, y + 1, z-1);
		par1World.setBlockToAir(x + 2, y + 1, z-1);
		
		par1World.setBlockToAir(x , y + 1, z);
		par1World.setBlockToAir(x + 1, y + 1, z);
		par1World.setBlockToAir(x + 2, y + 1, z);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x + 1, y, z);
		par1World.setBlockToAir(x + 2, y, z);
		
		par1World.setBlockToAir(x , y, z-1);
		par1World.setBlockToAir(x + 1, y, z-1);
		par1World.setBlockToAir(x + 2, y, z-1);
	}
	if(par1World.getBlockMetadata(x, y, z) == 1)
	{
		par1World.setBlockToAir(x+1 , y + 1, z);
		par1World.setBlockToAir(x+1, y + 1, z+1);
		par1World.setBlockToAir(x+1, y + 1, z+2);
		
		par1World.setBlockToAir(x , y + 1, z);
		par1World.setBlockToAir(x, y + 1, z+1);
		par1World.setBlockToAir(x, y + 1, z+2);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x, y, z+1);
		par1World.setBlockToAir(x, y, z+2);
		
		par1World.setBlockToAir(x + 1 , y, z);
		par1World.setBlockToAir(x + 1, y, z+1);
		par1World.setBlockToAir(x + 1, y, z+2);
	}
	if(par1World.getBlockMetadata(x, y, z) == 2)
	{
		par1World.setBlockToAir(x , y + 1, z+1);
		par1World.setBlockToAir(x - 1, y + 1, z+1);
		par1World.setBlockToAir(x - 2, y + 1, z+1);
		
		par1World.setBlockToAir(x , y + 1, z);
		par1World.setBlockToAir(x - 1, y + 1, z);
		par1World.setBlockToAir(x - 2, y + 1, z);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x - 1, y, z);
		par1World.setBlockToAir(x - 2, y, z);
		
		par1World.setBlockToAir(x , y, z+1);
		par1World.setBlockToAir(x - 1, y, z+1);
		par1World.setBlockToAir(x - 2, y, z+1);
	}
	if(par1World.getBlockMetadata(x, y, z) == 3)
	{
		par1World.setBlockToAir(x-1 , y + 1, z);
		par1World.setBlockToAir(x-1, y + 1, z-1);
		par1World.setBlockToAir(x-1, y + 1, z-2);
		
		par1World.setBlockToAir(x , y + 1, z);
		par1World.setBlockToAir(x, y + 1, z-1);
		par1World.setBlockToAir(x, y + 1, z-2);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x, y, z-1);
		par1World.setBlockToAir(x, y, z-2);
		
		par1World.setBlockToAir(x - 1 , y, z);
		par1World.setBlockToAir(x - 1, y, z-1);
		par1World.setBlockToAir(x - 1, y, z-2);
	}	
}

}