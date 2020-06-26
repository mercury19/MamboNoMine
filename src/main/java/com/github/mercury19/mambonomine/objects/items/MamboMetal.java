package com.github.mercury19.mambonomine.objects.items;

import com.github.mercury19.mambonomine.init.ItemInit;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class MamboMetal
{

	private String name;
	private boolean enabled;

	public MamboMetal(String name, boolean enabled) 
	{			
		this.name = name;
		this.enabled = enabled;
		
		if (enabled)
		{
			ItemInit.ITEMS.add(this.getNugget());
			ItemInit.ITEMS.add(this.getIngot());
		}
	}
	
	public Item getNugget ()
	{
		Item nugget = new MamboItem(name + "_nugget", enabled);
		
		return nugget;
	}
	
	public Item getIngot()
	{
		Item ingot = new MamboItem(name + "_ingot", enabled);
		
		return ingot;
	}

}
