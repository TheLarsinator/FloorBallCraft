package com.fc.FCBlocks;

import static com.fc.FCInit.BlockMain.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.fc.FCCore.FloorBallCraft;
import com.fc.FCInit.ItemMain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFloor extends Block{

	private IIcon side;
	private IIcon top;
	private int textureID;

	public BlockFloor(Material material, int par1) 
	{
		super(material);
		this.textureID = par1;
        this.slipperiness = 0.98F;   
        if(textureID == 1)
        {
        	this.setCreativeTab(FloorBallCraft.FCTab);
        }
	}
	
    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer player, int par1, float par2, float par3, float par4)
    {
    	ItemStack itemstack = player.inventory.getCurrentItem();
    	if(itemstack != null && itemstack.getItem() == ItemMain.LineBrush)
    	{   			
    		switch(textureID)
    		{
    		case 1:
    			world.setBlock(i, j, k, FloorCross);
    	    	break;
    		case 2:
    			world.setBlock(i, j, k, FloorCorner1);
    			break;
    		case 3:
    			world.setBlock(i, j, k, FloorCorner2);
    			break;
    		case 4:
    			world.setBlock(i, j, k, FloorCorner3);
    			break;
    		case 5:
    			world.setBlock(i, j, k, FloorCorner4);
    			break;
    		case 6:
    			world.setBlock(i, j, k, FloorLine1);
    			break;
    		case 7:
    			world.setBlock(i, j, k, FloorLine2);
    			break;
    		case 8:
    			world.setBlock(i, j, k, FloorLineCross1);
    			break;
    		case 9:
    			world.setBlock(i, j, k, FloorLineCross2);
    			break;
    		case 10:
    			world.setBlock(i, j, k, FloorTCross1);
    			break;
    		case 11:
    			world.setBlock(i, j, k, FloorTCross2);
    			break;
    		case 12:
    			world.setBlock(i, j, k, FloorTCross3);
    			break;
    		case 13:
    			world.setBlock(i, j, k, FloorTCross4);
    			break;
    		case 14:    			
    			world.setBlock(i, j, k, Floor);
    			break;
    		}
    		return true;
    	}
    	else
    	{
        return false;
    	}
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int sides, int z) 
    {
    	if(sides == 1)
    	{
    		return this.top;
    	}
    	else
    	{
    		return this.side;
    	}  		
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        this.side = register.registerIcon("fc:Floor");
        this.top= register.registerIcon(this.getTextureName());
    }
}