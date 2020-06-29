package com.github.mercury19.mambonomine.init;

import com.github.mercury19.mambonomine.blocks.MamboMetalBlock;
import com.github.mercury19.mambonomine.blocks.MamboOre;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder("mambonomine")
public class BlockInit 
{
	// Ores
	public static MamboOre ZINC_ORE = new MamboOre("zinc_ore", "oreZince", 0);
//	public static MamboOre COPPER_ORE;
//	public static MamboOre TIN_ORE;
//	public static final Block SILVER_ORE = new MamboOre("silver_ore", "oreSilver", 2);
	public static MamboOre ETHERIUM_ORE = new MamboOre("etherium_ore", "oreEtherium", 3);
	
	
	// Storage Block
	public static MamboMetalBlock ZINC_BLOCK = new MamboMetalBlock("zinc_block", "blockZinc", 0);
//	public static MamboMetalBlock COPPER_BLOCK;
//	public static MamboMetalBlock TIN_BLOCK;
//	public static final Block SILVER_BLOCK = new MamboMetalBlock("silver_block", "blockSilver", 2, true);
//	public static final Block ETHERIUM_BLOCK = new MamboMetalBlock("etherium_block", "blockEtherium", 3, true);
	
//	public static MamboMetalBlock BRASS_BLOCK;
//	public static MamboMetalBlock BRONZE_BLOCK;
//	public static MamboMetalBlock STEEL_BLOCK;
	
//	public static final Block ASTRAL_SILVER_BLOCK = new MamboMetalBlock("astral_silver_block", "blockAstralSilver", 3, true);
//	public static final Block CELESTIAL_BRONZE_BLOCK = new MamboMetalBlock("celestial_bronze_block", "blockCelestialBronze", 3, true);
//	public static final Block IMPERIAL_GOLD_BLOCK = new MamboMetalBlock("imperial_gold_block", "blockImperialGold", 3, true);
//	public static final Block STYGIAN_IRON_BLOCK = new MamboMetalBlock("stygian_iron_block", "blockStygianIron", 3, true);
//	public static final Block VOID_STEEL_BLOCK = new MamboMetalBlock("void_steel_steel", "blockVoidSteel", 3, true);
	
	public static void register(IForgeRegistry<Block> registry)
	{
		registry.registerAll(
				ZINC_ORE,
				ETHERIUM_ORE,
				
				ZINC_BLOCK
				);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry)
	{
		registry.registerAll(
				ZINC_ORE.createItemBlock(),
				ETHERIUM_ORE.createItemBlock(),
				
				ZINC_BLOCK.createItemBlock()
				);
	}
	
	public static void registerModels()
	{
		ZINC_ORE.registerItemModel(Item.getItemFromBlock(ZINC_ORE));
		ETHERIUM_ORE.registerItemModel(Item.getItemFromBlock(ETHERIUM_ORE));
		
		ZINC_BLOCK.registerItemModel(Item.getItemFromBlock(ZINC_BLOCK));
	}

}
