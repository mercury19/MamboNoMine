package com.github.mercury19.mambonomine.items.tools;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.item.ItemPickaxe;

public class MamboPickaxe extends ItemPickaxe
{

	public MamboPickaxe(String name, ToolMaterial material, boolean enabled) 
	{
		super(material);
		setTranslationKey(MamboNoMine.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.creativeTab);
	}

}
