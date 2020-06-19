package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");

}
