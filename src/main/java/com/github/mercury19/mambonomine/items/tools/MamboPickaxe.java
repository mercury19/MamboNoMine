package com.github.mercury19.mambonomine.items.tools;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.item.ItemPickaxe;

public class MamboPickaxe extends ItemPickaxe
{
	private String name;

	public MamboPickaxe(String name, ToolMaterial material) 
	{
		super(material);
		
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
