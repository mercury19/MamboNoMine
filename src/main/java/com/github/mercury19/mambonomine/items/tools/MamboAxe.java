package com.github.mercury19.mambonomine.items.tools;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.item.ItemAxe;

public class MamboAxe extends ItemAxe
{
	private String name;
	
	public MamboAxe(String name, ToolMaterial material, float speed) 
	{
		super(material, 7.0F + material.getAttackDamage(), speed);
		
		this.name = name;
		
		setTranslationKey(MamboNoMine.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.creativeTab);
	}
	
	public void registerItemModel()
	{
		MamboNoMine.proxy.registerItemRenderer(this, 0, name);
	}
	
}
