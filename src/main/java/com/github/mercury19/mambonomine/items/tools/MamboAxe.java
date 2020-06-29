package com.github.mercury19.mambonomine.items.tools;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.item.ItemAxe;

public class MamboAxe extends ItemAxe
{
	
	public MamboAxe(String name, ToolMaterial material, float speed, boolean enabled) 
	{
		super(material, 7.0F + material.getAttackDamage(), speed);
		setTranslationKey(MamboNoMine.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.creativeTab);
	}
	
}
