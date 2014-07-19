package com.fc.FCItems;

import java.util.List;
import java.util.Random;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.fc.FCCore.FloorBallCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSQ2 extends Item
{
	public int F;
    public ItemSQ2(int var1)
    {
        super();
		this.setHasSubtypes(true);
        this.maxStackSize = 1;
        this.setCreativeTab(FloorBallCraft.FCTab);
        
    }
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
    	return 0.0F;
    }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    par3List.add("KickZone, TipCurve");
    }
    
    protected Random rand = new Random();
    
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    	if(itemstack.isItemEnchanted()== false)
    	{
    	int KB = rand.nextInt(5)+1;
    itemstack.addEnchantment(Enchantment.knockback, KB);
    	}
    }
    public boolean hasEffect(ItemStack par1ItemStack)
    {
    		return false;
    }
    
    @SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[16];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(FloorBallCraft.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}

	public static final String[] names = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };

	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 16);
		return super.getUnlocalizedName() + "." + names[i];
	}

	public IIcon getIconFromDamage(int par1)
	{
		return icons[par1];
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int x = 0; x < 16; x++)
		{
			par3List.add(new ItemStack(this, 1, x));
		}
	}
}