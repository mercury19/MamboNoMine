package com.github.mercury19.mambonomine.init;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.config.Config;
import com.github.mercury19.mambonomine.items.MamboArmor;
import com.github.mercury19.mambonomine.items.MamboItem;
import com.github.mercury19.mambonomine.items.MamboMetal;
import com.github.mercury19.mambonomine.items.tools.MamboAxe;
import com.github.mercury19.mambonomine.items.tools.MamboHoe;
import com.github.mercury19.mambonomine.items.tools.MamboPickaxe;
import com.github.mercury19.mambonomine.items.tools.MamboShovel;
import com.github.mercury19.mambonomine.items.tools.MamboSword;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder("mambonomine")
public class ItemInit 
{	
	// Alloy Catalysts and Items
//	public static final Item LOW_CATALYST = new MamboItem("low_catalyst", true);
//	public static final Item MED_CATALYST = new MamboItem("med_catalyst", true);
//	public static final Item HIGH_CATALYST = new MamboItem("high_catalyst", true);
	public static MamboItem ETHERIUM = new MamboItem("etherium");
	
	// Metal Base Items
	public static MamboMetal ZINC_INGOT = new MamboMetal("zinc_ingot", "ingotZinc");
	public static MamboMetal ZINC_NUGGET = new MamboMetal("zinc_nugget", "nuggetZinc");
	public static MamboMetal COPPER_INGOT = new MamboMetal("copper_ingot", "ingotCopper");
	public static MamboMetal COPPER_NUGGET = new MamboMetal("copper_nugget", "nuggetCopper");
	public static MamboMetal TIN_INGOT = new MamboMetal("tin_ingot", "ingotTin");
	public static MamboMetal TIN_NUGGET = new MamboMetal("tin_nugget", "nuggetTin");
//	public static MamboMetal SILVER = new MamboMetal("silver", TOOL_SILVER, ARMOR_SILVER, true);
	
	public static MamboMetal BRASS_INGOT = new MamboMetal("brass_ingot", "ingotBrass");
	public static MamboMetal BRASS_NUGGET = new MamboMetal("brass_nugget", "nuggetBrass");
	public static MamboMetal BRONZE_INGOT = new MamboMetal("bronze_ingot", "ingotBronze");
	public static MamboMetal BRONZE_NUGGET = new MamboMetal("bronze_nugget", "nuggetBronze");
	public static MamboMetal STEEL_INGOT = new MamboMetal("steel_ingot", "ingotSteel");
	public static MamboMetal STEEL_NUGGET = new MamboMetal("steel_nugget", "nuggetSteel");
	
//	public static MamboMetal ASTRAL_SILVER = new MamboMetal("astral_silver", TOOL_ASILVER, ARMOR_ASILVER, true);
//	public static MamboMetal CELESTIAL_BRONZE = new MamboMetal("celestial_bronze", TOOL_CBRONZE, ARMOR_CBRONZE true);
//	public static MamboMetal IMPERIAL_GOLD = new MamboMetal("imperial_gold", TOOL_IGOLD, ARMOR_IGOLD, true);
//	public static MamboMetal STYGIAN_IRON = new MamboMetal("stygian_iron", TOOL_SIRON, ARMOR_SIRON, true);
//	public static MamboMetal FULGURITE_INGOT = new MamboMetal("fulgurite_ingot" "ingotFulgurite");
	
	
	// Tool Sets
	public static MamboAxe COPPER_AXE = new MamboAxe("copper_axe", MamboNoMine.TOOL_COPPER, -3.1f);
	public static MamboHoe COPPER_HOE = new MamboHoe("copper_hoe", MamboNoMine.TOOL_COPPER);
	public static MamboPickaxe COPPER_PICKAXE = new MamboPickaxe("copper_pickaxe", MamboNoMine.TOOL_COPPER);
	public static MamboShovel COPPER_SHOVEL = new MamboShovel("copper_shovel", MamboNoMine.TOOL_COPPER);
	public static MamboSword COPPER_SWORD = new MamboSword("copper_sword", MamboNoMine.TOOL_COPPER);
	
	public static MamboAxe BRONZE_AXE = new MamboAxe("bronze_axe", MamboNoMine.TOOL_BRONZE, -3.1f);
	public static MamboHoe BRONZE_HOE = new MamboHoe("bronze_hoe", MamboNoMine.TOOL_BRONZE);
	public static MamboPickaxe BRONZE_PICKAXE = new MamboPickaxe("bronze_pickaxe", MamboNoMine.TOOL_BRONZE);
	public static MamboShovel BRONZE_SHOVEL = new MamboShovel("bronze_shovel", MamboNoMine.TOOL_BRONZE);
	public static MamboSword BRONZE_SWORD = new MamboSword("bronze_sword", MamboNoMine.TOOL_BRONZE);
	
	public static MamboAxe STEEL_AXE = new MamboAxe("steel_axe", MamboNoMine.TOOL_STEEL, -3.1f);
	public static MamboHoe STEEL_HOE = new MamboHoe("steel_hoe", MamboNoMine.TOOL_STEEL);
	public static MamboPickaxe STEEL_PICKAXE = new MamboPickaxe("steel_pickaxe", MamboNoMine.TOOL_STEEL);
	public static MamboShovel STEEL_SHOVEL = new MamboShovel("steel_shovel", MamboNoMine.TOOL_STEEL);
	public static MamboSword STEEL_SWORD = new MamboSword("steel_sword", MamboNoMine.TOOL_STEEL);
	
	// Armor Sets
	public static MamboArmor COPPER_HELMET = new MamboArmor("copper_helmet", MamboNoMine.ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static MamboArmor COPPER_CHESTPLATE = new MamboArmor("copper_chestplate", MamboNoMine.ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static MamboArmor COPPER_LEGGINGS = new MamboArmor("copper_leggings", MamboNoMine.ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static MamboArmor COPPER_BOOTS = new MamboArmor("copper_boots", MamboNoMine.ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
	
	public static MamboArmor BRONZE_HELMET = new MamboArmor("bronze_helmet", MamboNoMine.ARMOR_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static MamboArmor BRONZE_CHESTPLATE = new MamboArmor("bronze_chestplate", MamboNoMine.ARMOR_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static MamboArmor BRONZE_LEGGINGS = new MamboArmor("bronze_leggings", MamboNoMine.ARMOR_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static MamboArmor BRONZE_BOOTS = new MamboArmor("bronze_boots", MamboNoMine.ARMOR_BRONZE, 1, EntityEquipmentSlot.FEET);
	
	public static MamboArmor STEEL_HELMET = new MamboArmor("steel_helmet", MamboNoMine.ARMOR_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static MamboArmor STEEL_CHESTPLATE = new MamboArmor("steel_chestplate", MamboNoMine.ARMOR_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static MamboArmor STEEL_LEGGINGS = new MamboArmor("steel_leggings", MamboNoMine.ARMOR_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static MamboArmor STEEL_BOOTS = new MamboArmor("steel_boots", MamboNoMine.ARMOR_STEEL, 1, EntityEquipmentSlot.FEET);
	
	public static void register(IForgeRegistry<Item> registry)
	{
		registry.register(ETHERIUM);
		
		if (Config.enableZinc)
		{
			registry.registerAll(
					ZINC_INGOT,
					ZINC_NUGGET
					);
		}
		
		if (Config.enableCopper)
		{
			registry.registerAll(
					COPPER_INGOT,
					COPPER_NUGGET,
					COPPER_AXE,
					COPPER_HOE,
					COPPER_PICKAXE,
					COPPER_SHOVEL,
					COPPER_SWORD,
					COPPER_HELMET,
					COPPER_CHESTPLATE,
					COPPER_LEGGINGS,
					COPPER_BOOTS
					);
		}
		
		if (Config.enableTin)
		{
			registry.registerAll(
					TIN_INGOT,
					TIN_NUGGET
					);
		}
		
		if (Config.enableBrass)
		{
			registry.registerAll(		
					BRASS_INGOT,
					BRASS_NUGGET
					);
		}
		
		if (Config.enableBronze)
		{
			registry.registerAll(
					BRONZE_INGOT,
					BRONZE_NUGGET,
					BRONZE_AXE,
					BRONZE_HOE,
					BRONZE_PICKAXE,
					BRONZE_SHOVEL,
					BRONZE_SWORD,
					BRONZE_HELMET,
					BRONZE_CHESTPLATE,
					BRONZE_LEGGINGS,
					BRONZE_BOOTS
					);
		}
		
		if (Config.enableSteel)
		{
			registry.registerAll(
					STEEL_INGOT,
					STEEL_NUGGET,
					STEEL_AXE,
					STEEL_HOE,
					STEEL_PICKAXE,
					STEEL_SHOVEL,
					STEEL_SWORD,
					STEEL_HELMET,
					STEEL_CHESTPLATE,
					STEEL_LEGGINGS,
					STEEL_BOOTS
					);
		}
	}
	
	public static void registerModels()
	{
		// Alloy Items
		ETHERIUM.registerItemModel();
		
		// Metal Base Items
		if (Config.enableZinc)
		{
			ZINC_INGOT.registerItemModel();
			ZINC_NUGGET.registerItemModel();
		}
		
		if (Config.enableCopper)
		{
			COPPER_INGOT.registerItemModel();
			COPPER_NUGGET.registerItemModel();
		}
		
		if (Config.enableTin) 
		{
			TIN_INGOT.registerItemModel();
			TIN_NUGGET.registerItemModel();
		}
		
		if (Config.enableBrass) 
		{
			BRASS_INGOT.registerItemModel();
			BRASS_NUGGET.registerItemModel();
		}
		
		if (Config.enableBronze) 
		{
			BRONZE_INGOT.registerItemModel();
			BRONZE_NUGGET.registerItemModel();
		}
		
		if (Config.enableSteel) 
		{
			STEEL_INGOT.registerItemModel();
			STEEL_NUGGET.registerItemModel();
		}
		
		
		// Tool Sets
		
		if (Config.enableCopper) 
		{
			COPPER_AXE.registerItemModel();
			COPPER_HOE.registerItemModel();
			COPPER_PICKAXE.registerItemModel();
			COPPER_SHOVEL.registerItemModel();
			COPPER_SWORD.registerItemModel();
		}
		
		if (Config.enableBronze) 
		{
			BRONZE_AXE.registerItemModel();
			BRONZE_HOE.registerItemModel();
			BRONZE_PICKAXE.registerItemModel();
			BRONZE_SHOVEL.registerItemModel();
			BRONZE_SWORD.registerItemModel();
		}
		
		if (Config.enableSteel) 
		{
			STEEL_AXE.registerItemModel();
			STEEL_HOE.registerItemModel();
			STEEL_PICKAXE.registerItemModel();
			STEEL_SHOVEL.registerItemModel();
			STEEL_SWORD.registerItemModel();
		}
		
		
		// Armor Sets
		
		if (Config.enableCopper)
		{
			COPPER_HELMET.registerItemModel();
			COPPER_CHESTPLATE.registerItemModel();
			COPPER_LEGGINGS.registerItemModel();
			COPPER_BOOTS.registerItemModel();
		}
		
		if (Config.enableBronze)
		{
			BRONZE_HELMET.registerItemModel();
			BRONZE_CHESTPLATE.registerItemModel();
			BRONZE_LEGGINGS.registerItemModel();
			BRONZE_BOOTS.registerItemModel();
		}
		
		if (Config.enableSteel)
		{
			STEEL_HELMET.registerItemModel();
			STEEL_CHESTPLATE.registerItemModel();
			STEEL_LEGGINGS.registerItemModel();
			STEEL_BOOTS.registerItemModel();
		}
	}

}
