package com.github.mercury19.mambonomine.client;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MamboTab extends CreativeTabs
{
	public MamboTab()
	{
		super(MamboNoMine.MODID);
	}
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemInit.ETHERIUM);
	}
}
