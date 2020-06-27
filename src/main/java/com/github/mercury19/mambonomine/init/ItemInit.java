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
//	public static final Item LOW_CATALYST = new MamboItem("low_catalyst", true);
//	public static final Item MED_CATALYST = new MamboItem("med_catalyst", true);
//	public static final Item HIGH_CATALYST = new MamboItem("high_catalyst", true);
	
	// Metal Base Items
//	public static final MamboMetal ZINC = new MamboMetal("zinc", true);
	public static final MamboMetal COPPER = new MamboMetal("copper", ConfigHandler.COPPER);
	public static final MamboMetal TIN = new MamboMetal("tin", ConfigHandler.TIN);
//	public static final MamboMetal SILVER = new MamboMetal("silver", true);
//	public static final MamboMetal ETHERIUM = new MamboMetal("etherium", true);
//	
//	public static final MamboMetal BRASS = new MamboMetal("brass", true);	
	public static final MamboMetal BRONZE = new MamboMetal("bronze", ConfigHandler.BRONZE);
	public static final MamboMetal STEEL = new MamboMetal("steel", ConfigHandler.STEEL);
	
//	public static final MamboMetal ASTRAL_SILVER = new MamboMetal("astral_silver", true);
//	public static final MamboMetal CELESTIAL_BRONZE = new MamboMetal("celestial_bronze", true);
//	public static final MamboMetal IMPERIAL_GOLD = new MamboMetal("imperial_gold", true);
//	public static final MamboMetal STYGIAN_IRON = new MamboMetal("stygian_iron", true);
//	public static final MamboMetal VOID_STEEL = new MamboMetal("void_steel", true);

}
