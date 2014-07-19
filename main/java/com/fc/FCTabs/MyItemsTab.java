package com.fc.FCTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.fc.FCInit.ItemMain;

public class MyItemsTab extends CreativeTabs
{
	public MyItemsTab(int i, String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ItemMain.SalmingQ2;
	}
}