package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.items.ItemBase;
import com.github.mercury19.mambonomine.util.handlers.ConfigHandler;

import net.minecraft.item.Item;

public class ItemInit 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", ConfigHandler.COPPER);
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget", ConfigHandler.COPPER);
	
	public static final Item TIN_INGOT = new ItemBase("tin_ingot", ConfigHandler.TIN);
	public static final Item TIN_NUGGET = new ItemBase("tin_nugget", ConfigHandler.TIN);
	
	public static final Item RAW_BRONZE_INGOT = new ItemBase("raw_bronze_ingot", ConfigHandler.BRONZE);
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot", ConfigHandler.BRONZE);
	public static final Item BRONZE_NUGGET = new ItemBase("bronze_nugget", ConfigHandler.BRONZE);
	
	public static final Item RAW_STEEL_INGOT = new ItemBase("raw_steel_ingot", ConfigHandler.STEEL);
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot", ConfigHandler.STEEL);
	public static final Item STEEL_NUGGET = new ItemBase("steel_nugget", ConfigHandler.STEEL);

}
