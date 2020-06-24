package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.items.MamboItem;
import com.github.mercury19.mambonomine.util.handlers.ConfigHandler;

import net.minecraft.item.Item;

public class ItemInit 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	// Metal Base Setup
	public static final Item COPPER_INGOT = new MamboItem("copper_ingot", "ingotCopper", ConfigHandler.COPPER);
	public static final Item COPPER_NUGGET = new MamboItem("copper_nugget", "nuggetcopper", ConfigHandler.COPPER);
	

}
