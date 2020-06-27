package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.items.MamboItem;
import com.github.mercury19.mambonomine.objects.items.MamboMetal;
import com.github.mercury19.mambonomine.util.Reference;
import com.github.mercury19.mambonomine.util.handlers.ConfigHandler;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Tool Materials
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("COPPER", 1, 175, 5.0F, 1.0F, 12);
	public static final ToolMaterial TOOL_SILVER = EnumHelper.addToolMaterial("SILVER", 1, 32, 10.0F, 1.0F, 20);
	
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 360, 6.0F, 2.0F, 16);
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("STEEL", 2, 500, 7.0F, 2.0F, 10);
	
	public static final ToolMaterial TOOL_ASILVER = EnumHelper.addToolMaterial("ASTRAL_SILVER", 3, 1864, 9.0F, 4.0F, 24);
	public static final ToolMaterial TOOL_CBRONZE = EnumHelper.addToolMaterial("CELESTIAL_BRONZE", 3, 1864, 9.0F, 4.0F, 24);
	public static final ToolMaterial TOOL_IGOLD = EnumHelper.addToolMaterial("IMPERIAL_GOLD", 3, 1864, 9.0F, 4.0F, 24);
	public static final ToolMaterial TOOL_SIRON = EnumHelper.addToolMaterial("STYGIAN_IRON", 3, 1864, 9.0F, 4.0F, 24);
	public static final ToolMaterial TOOL_VSTEEL = EnumHelper.addToolMaterial("VOID_STEEL", 3, 1864, 9.0F, 4.0F, 24);
	
	
	// Armor Materials
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("COPPER", Reference.MODID + ":copper", 11, new int[] {1, 3, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_SILVER = EnumHelper.addArmorMaterial("SILVER", Reference.MODID + ":silver", 8, new int[] {2, 3, 5, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1);
	
	public static final ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("BRONZE", Reference.MODID + ":bronze", 17, new int[] {2, 4, 5, 2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_STEEL = EnumHelper.addArmorMaterial("STEEL", Reference.MODID + ":steel", 21, new int[] {3, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F);
	
	public static final ArmorMaterial ARMOR_ASILVER = EnumHelper.addArmorMaterial("ASTRAL_SILVER", Reference.MODID + ":astral_silver", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial ARMOR_CBRONZE = EnumHelper.addArmorMaterial("CELESTIAL_BRONZE", Reference.MODID + ":celestial_bronze", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial ARMOR_IGOLD = EnumHelper.addArmorMaterial("IMPERIAL_GOLD", Reference.MODID + ":imperial_gold", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial ARMOR_SIRON = EnumHelper.addArmorMaterial("STYGIAN_IRON", Reference.MODID + ":stygian_iron", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial ARMOR_VSTEEL = EnumHelper.addArmorMaterial("VOID_STEEL", Reference.MODID + ":void_steel", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);

	// Alloy Catalysts and Items
//	public static final Item LOW_CATALYST = new MamboItem("low_catalyst", true);
//	public static final Item MED_CATALYST = new MamboItem("med_catalyst", true);
//	public static final Item HIGH_CATALYST = new MamboItem("high_catalyst", true);
	
	// Metal Base Items
//	public static final MamboMetal ZINC = new MamboMetal("zinc", true);
	public static final MamboMetal COPPER = new MamboMetal("copper", TOOL_COPPER, ARMOR_COPPER, ConfigHandler.COPPER);
	public static final MamboMetal TIN = new MamboMetal("tin", null, null, ConfigHandler.TIN);
//	public static final MamboMetal SILVER = new MamboMetal("silver", TOOL_SILVER, ARMOR_SILVER, true);
//	public static final MamboMetal ETHERIUM = new MamboMetal("etherium", true);
//	
//	public static final MamboMetal BRASS = new MamboMetal("brass", true);	
	public static final MamboMetal BRONZE = new MamboMetal("bronze", TOOL_BRONZE, ARMOR_BRONZE, ConfigHandler.BRONZE);
	public static final MamboMetal STEEL = new MamboMetal("steel", TOOL_STEEL, ARMOR_STEEL, ConfigHandler.STEEL);
	
//	public static final MamboMetal ASTRAL_SILVER = new MamboMetal("astral_silver", TOOL_ASILVER, ARMOR_ASILVER, true);
//	public static final MamboMetal CELESTIAL_BRONZE = new MamboMetal("celestial_bronze", TOOL_CBRONZE, ARMOR_CBRONZE true);
//	public static final MamboMetal IMPERIAL_GOLD = new MamboMetal("imperial_gold", TOOL_IGOLD, ARMOR_IGOLD, true);
//	public static final MamboMetal STYGIAN_IRON = new MamboMetal("stygian_iron", TOOL_SIRON, ARMOR_SIRON, true);
//	public static final MamboMetal VOID_STEEL = new MamboMetal("void_steel", TOOL_VSTEEL, ARMOR_VSTEEL, true);

}
