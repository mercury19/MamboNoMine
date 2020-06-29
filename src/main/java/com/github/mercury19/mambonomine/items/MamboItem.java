package com.github.mercury19.mambonomine.items;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MamboItem extends Item
{
	protected String name;
	
	public MamboItem(String name)
	{
		this.name = name;
		
		setTranslationKey(MamboNoMine.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.creativeTab);
	}
	
	public void registerItemModel()
	{
		MamboNoMine.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public MamboItem setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}
}
