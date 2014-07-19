package com.fc.FCItems;

import java.util.List;

import javax.swing.Icon;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import com.fc.FCCore.FloorBallCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlade extends Item
{
	public ItemBlade()
	{
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(FloorBallCraft.FCTab);
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon[4];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon(FloorBallCraft.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}

	public static final String[] names = new String[] { "first", "second", "third", "fourth" };

	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
		return super.getUnlocalizedName() + "." + names[i];
	}

	public IIcon getIconFromDamage(int par1)
	{
		return icons[par1];
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int x = 0; x < 4; x++)
		{
			par3List.add(new ItemStack(this, 1, x));
		}
	}
}