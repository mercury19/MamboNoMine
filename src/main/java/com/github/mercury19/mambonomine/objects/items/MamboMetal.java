package com.github.mercury19.mambonomine.objects.items;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class MamboMetal
{
	public Item INGOT;
	public Item NUGGET;
	
	private String name;

	public MamboMetal(String name, boolean enabled) 
	{			
		this.INGOT = new MamboItem(name + "_ingot", enabled);
		this.NUGGET = new MamboItem(name + "_nugget", enabled);
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre("ingot" + name.substring(0,1).toUpperCase() + name.substring(1), this.INGOT);
		OreDictionary.registerOre("nugget" + name.substring(0,1).toUpperCase() + name.substring(1), this.NUGGET);
	}
}
