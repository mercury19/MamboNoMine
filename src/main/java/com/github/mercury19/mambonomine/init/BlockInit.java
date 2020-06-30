package com.github.mercury19.mambonomine.init;

import com.github.mercury19.mambonomine.blocks.MamboMetalBlock;
import com.github.mercury19.mambonomine.blocks.MamboOre;
import com.github.mercury19.mambonomine.config.Config;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder("mambonomine")
public class BlockInit 
{
	// Ores
	public static MamboOre ZINC_ORE = new MamboOre("zinc_ore", "oreZince", 1);
	public static MamboOre COPPER_ORE = new MamboOre("copper_ore", "oreCopper", 1);
	public static MamboOre TIN_ORE = new MamboOre("tin_ore", "oreTin", 1);
//	public static MamboOre SILVER_ORE = new MamboOre("silver_ore", "oreSilver", 2);
	public static MamboOre ETHERIUM_ORE = new MamboOre("etherium_ore", "oreEtherium", 3);
	
	
	// Storage Block
	public static MamboMetalBlock ZINC_BLOCK = new MamboMetalBlock("zinc_block", "blockZinc", 1);
	public static MamboMetalBlock COPPER_BLOCK = new MamboMetalBlock("copper_block", "blockCopper", 1);
	public static MamboMetalBlock TIN_BLOCK = new MamboMetalBlock("tin_block", "blockTin", 1);
//	public static MamboMetalBlock SILVER_BLOCK = new MamboMetalBlock("silver_block", "blockSilver", 2);
	
	public static MamboMetalBlock BRASS_BLOCK = new MamboMetalBlock("brass_block", "blockBrass", 1);
	public static MamboMetalBlock BRONZE_BLOCK = new MamboMetalBlock("bronze_block", "blockBronze", 1);
	public static MamboMetalBlock STEEL_BLOCK = new MamboMetalBlock("steel_block", "blockSteel", 2);
	
//	public static MamboMetalBlock ASTRAL_SILVER_BLOCK = new MamboMetalBlock("astral_silver_block", "blockAstralSilver", 3);
//	public static MamboMetalBlock CELESTIAL_BRONZE_BLOCK = new MamboMetalBlock("celestial_bronze_block", "blockCelestialBronze", 3);
//	public static MamboMetalBlock IMPERIAL_GOLD_BLOCK = new MamboMetalBlock("imperial_gold_block", "blockImperialGold", 3);
//	public static MamboMetalBlock STYGIAN_IRON_BLOCK = new MamboMetalBlock("stygian_iron_block", "blockStygianIron", 3);
//	public static MamboMetalBlock VOID_STEEL_BLOCK = new MamboMetalBlock("void_steel_steel", "blockVoidSteel", 3);
	
	public static void register(IForgeRegistry<Block> registry)
	{
		registry.registerAll(
				ZINC_ORE,
				COPPER_ORE,
				TIN_ORE,
				ETHERIUM_ORE,
				
				ZINC_BLOCK,
				COPPER_BLOCK,
				TIN_BLOCK,
				
				BRASS_BLOCK,
				BRONZE_BLOCK
				);
		
		if (Config.enableSteel)
		{
			registry.register(STEEL_BLOCK);
		}
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry)
	{
		registry.registerAll(
				ZINC_ORE.createItemBlock(),
				COPPER_ORE.createItemBlock(),
				TIN_ORE.createItemBlock(),
				ETHERIUM_ORE.createItemBlock(),
				
				ZINC_BLOCK.createItemBlock(),
				COPPER_BLOCK.createItemBlock(),
				TIN_BLOCK.createItemBlock(),
				
				BRASS_BLOCK.createItemBlock(),
				BRONZE_BLOCK.createItemBlock()
				);
		
		if (Config.enableSteel)
		{
			registry.register(STEEL_BLOCK.createItemBlock());
		}
	}
	
	public static void registerModels()
	{
		ZINC_ORE.registerItemModel(Item.getItemFromBlock(ZINC_ORE));
		COPPER_ORE.registerItemModel(Item.getItemFromBlock(COPPER_ORE));
		TIN_ORE.registerItemModel(Item.getItemFromBlock(TIN_ORE));
		ETHERIUM_ORE.registerItemModel(Item.getItemFromBlock(ETHERIUM_ORE));
		
		ZINC_BLOCK.registerItemModel(Item.getItemFromBlock(ZINC_BLOCK));
		COPPER_BLOCK.registerItemModel(Item.getItemFromBlock(COPPER_BLOCK));
		TIN_BLOCK.registerItemModel(Item.getItemFromBlock(TIN_BLOCK));
		
		BRASS_BLOCK.registerItemModel(Item.getItemFromBlock(BRASS_BLOCK));
		BRONZE_BLOCK.registerItemModel(Item.getItemFromBlock(BRONZE_BLOCK));
		
		
		if (Config.enableSteel) 
		{
			STEEL_BLOCK.registerItemModel(Item.getItemFromBlock(STEEL_BLOCK));
		}
	}

}
