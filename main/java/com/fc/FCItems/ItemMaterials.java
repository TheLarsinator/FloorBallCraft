package com.fc.FCItems;

import net.minecraft.item.Item;

import com.fc.FCCore.FloorBallCraft;

public class ItemMaterials extends Item
{
    public ItemMaterials()
    {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(FloorBallCraft.FCTab);
        
    }
}