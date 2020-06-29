package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictInit 
{
	public static final List<String> ORES = new ArrayList<String>();
	public static final List<Item> ORE_NAMES = new ArrayList<Item>();
	
	
	public static void registerOres()
	{
		for (int i=0; i<ORES.size(); i++) 
		{
			OreDictionary.registerOre(ORES.get(i), ORE_NAMES.get(i));
		}
	}
}
