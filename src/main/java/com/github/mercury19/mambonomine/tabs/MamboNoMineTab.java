package com.github.mercury19.mambonomine.tabs;

import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MamboNoMineTab extends CreativeTabs
{
	public MamboNoMineTab()
	{
		super(Reference.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemInit.COPPER_INGOT);
	}

}
