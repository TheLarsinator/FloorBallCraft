package com.fc.Rink;

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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRink extends Block implements ITileEntityProvider
{
	public static int rotangle = new Random().nextInt(3);

public BlockRink(int par1, Material wood)
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
public TileEntity createNewTileEntity(World var1, int var2) {
 return new TileEntityRink();
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
    this.setBlockBounds(0F, 0.0F, 0.0F, .1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 2)
	{
    this.setBlockBounds(0F, 0.0F, 0.0F, 1F, 1F, .1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 3)
	{
    this.setBlockBounds(0.9F, 0.0F, 0F, 1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	if(par1World.getBlockMetadata(par2, par3, par4) == 0)
	{
    this.setBlockBounds(0F, 0.0F, 0.9F, 1F, 1F, 1F);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}
	
    this.setBlockBoundsForItemRender();
}
}