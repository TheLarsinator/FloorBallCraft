package com.fc.Goal.Blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.fc.FCCore.FloorBallCraft;
import com.fc.FCInit.BlockMain;
import com.fc.Goal.TileEntity.TileEntityGoal4;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGoal4 extends Block implements ITileEntityProvider
{
	public static int rotangle = new Random().nextInt(3);

public BlockGoal4(int par1, Material wood)
{
    super(Material.wood);

}
@Override
public int getRenderType() {
    return -1;
}

@Override
public boolean isOpaqueCube(){
return false;
}

@Override
public boolean renderAsNormalBlock(){
return false;
}

@Override
public TileEntity createNewTileEntity(World var1, int var2){
 return new TileEntityGoal4();
}
/**
 * Returns the ID of the items to drop on destruction.
 */
public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
    return Item.getItemFromBlock(BlockMain.Goal1);
}
/**
 * Called when the block is placed in the world.
 */
public void onBlockPlacedBy(World par1World, int i, int j, int k, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
{
    int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    par1World.setBlockMetadataWithNotify(i, j, k, l, 2);

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
    this.setBlockBounds(0F, 0.9F, 0.0F, 1F, 1F, 1.0F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    this.setBlockBounds(0.9F, 0.0F, 0.0F, 1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    this.setBlockBoundsForItemRender();
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 2)
	{
	    this.setBlockBounds(0F, 0.0F, 0.9F, 1F, 1F, 1F);
	    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	    this.setBlockBounds(0F, 0.9F, 0.0F, 1F, 1F, 1.0F);
	    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	    this.setBlockBounds(0.9F, 0.0F, 0.0F, 1F, 1F, 1F);
	    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	    this.setBlockBoundsForItemRender();
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 3)
	{
    this.setBlockBounds(0F, 0.0F, 0.0F, .1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    this.setBlockBounds(0F, 0.9F, 0.0F, 1F, 1F, 1.0F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    this.setBlockBounds(0F, 0.0F, 0.9F, 1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    this.setBlockBoundsForItemRender();
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 0)
	{
	    this.setBlockBounds(0F, 0.0F, 0F, 1F, 1F, .1F);
	    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	    this.setBlockBounds(0F, 0.9F, 0.0F, 1F, 1F, 1.0F);
	    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	    this.setBlockBounds(0F, 0.0F, 0.0F, .1F, 1F, 1F);
	    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	    this.setBlockBoundsForItemRender();
	}
}
public void breakBlock(World par1World, int x, int y, int z, Block block, int par6)
{
	if(par1World.getBlockMetadata(x, y, z) == 0)
	{
		par1World.setBlockToAir(x , y - 1, z+1);
		par1World.setBlockToAir(x + 1, y - 1, z+1);
		par1World.setBlockToAir(x + 2, y - 1, z+1);
		
		par1World.setBlockToAir(x , y - 1, z);
		par1World.setBlockToAir(x + 1, y - 1, z);
		par1World.setBlockToAir(x + 2, y - 1, z);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x + 1, y, z);
		par1World.setBlockToAir(x + 2, y, z);
		
		par1World.setBlockToAir(x , y, z+1);
		par1World.setBlockToAir(x + 1, y, z+1);
		par1World.setBlockToAir(x + 2, y, z+1);
	}
	if(par1World.getBlockMetadata(x, y, z) == 1)
	{
		par1World.setBlockToAir(x-1 , y - 1, z);
		par1World.setBlockToAir(x-1, y - 1, z+1);
		par1World.setBlockToAir(x-1, y - 1, z+2);
		
		par1World.setBlockToAir(x , y - 1, z);
		par1World.setBlockToAir(x, y - 1, z+1);
		par1World.setBlockToAir(x, y - 1, z+2);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x, y, z+1);
		par1World.setBlockToAir(x, y, z+2);
		
		par1World.setBlockToAir(x - 1 , y, z);
		par1World.setBlockToAir(x - 1, y, z+1);
		par1World.setBlockToAir(x - 1, y, z+2);
	}
	if(par1World.getBlockMetadata(x, y, z) == 2)
	{
		par1World.setBlockToAir(x , y - 1, z-1);
		par1World.setBlockToAir(x - 1, y - 1, z-1);
		par1World.setBlockToAir(x - 2, y - 1, z-1);
	
		par1World.setBlockToAir(x , y - 1, z);
		par1World.setBlockToAir(x - 1, y - 1, z);
		par1World.setBlockToAir(x - 2, y - 1, z);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x - 1, y, z);
		par1World.setBlockToAir(x - 2, y, z);
		
		par1World.setBlockToAir(x , y, z-1);
		par1World.setBlockToAir(x - 1, y, z-1);
		par1World.setBlockToAir(x - 2, y, z-1);
	}
	if(par1World.getBlockMetadata(x, y, z) == 3)
	{
		par1World.setBlockToAir(x+1 , y - 1, z);
		par1World.setBlockToAir(x+1, y - 1, z-1);
		par1World.setBlockToAir(x+1, y - 1, z-2);
		
		par1World.setBlockToAir(x , y - 1, z);
		par1World.setBlockToAir(x, y - 1, z-1);
		par1World.setBlockToAir(x, y - 1, z-2);
		
		par1World.setBlockToAir(x , y, z);
		par1World.setBlockToAir(x, y, z-1);
		par1World.setBlockToAir(x, y, z-2);
		
		par1World.setBlockToAir(x + 1 , y, z);
		par1World.setBlockToAir(x + 1, y, z-1);
		par1World.setBlockToAir(x + 1, y, z-2);
	}	
}

}