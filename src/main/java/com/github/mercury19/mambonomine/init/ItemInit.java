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
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item TIN_NUGGET = new ItemBase("tin_nugget");
	public static final Item RAW_STEEL_INGOT = new ItemBase("raw_steel_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item STEEL_NUGGET = new ItemBase("steel_nugget");

}
