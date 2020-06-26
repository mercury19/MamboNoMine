package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.items.MamboItem;
import com.github.mercury19.mambonomine.objects.items.MamboMetal;
import com.github.mercury19.mambonomine.util.handlers.ConfigHandler;

import net.minecraft.item.Item;

public class ItemInit 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Alloy Catalysts and Items
	public static final Item LOW_CATALYST = new MamboItem("low_catalyst", true);
	public static final Item MED_CATALYST = new MamboItem("med_catalyst", true);
	public static final Item HIGH_CATALYST = new MamboItem("high_catalyst", true);
	
	// Metal Base Items
	public static final MamboMetal COPPER = new MamboMetal("copper", ConfigHandler.COPPER);
	
	public static final MamboMetal TIN = new MamboMetal("tin", ConfigHandler.TIN);
	
	public static final MamboMetal BRONZE = new MamboMetal("bronze", ConfigHandler.BRONZE);
	
	public static final MamboMetal STEEL = new MamboMetal("steel", ConfigHandler.STEEL);
	

}
