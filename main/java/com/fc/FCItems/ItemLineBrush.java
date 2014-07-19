package com.fc.FCItems;

import net.minecraft.item.Item;

import com.fc.FCCore.FloorBallCraft;

public class ItemLineBrush extends Item
{
    public ItemLineBrush()
    {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(FloorBallCraft.FCTab);
        this.setMaxDamage(250);
    }
}