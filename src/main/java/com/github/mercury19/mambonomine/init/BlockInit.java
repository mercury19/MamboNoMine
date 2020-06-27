package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.blocks.MamboMetalBlock;
import com.github.mercury19.mambonomine.objects.blocks.MamboOre;
import com.github.mercury19.mambonomine.util.handlers.ConfigHandler;

import net.minecraft.block.Block;

public class BlockInit 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ores
//	public static final Block ZINC_ORE = new MamboOre("zinc_ore", "oreZinc", 0, true);
	public static final Block COPPER_ORE = new MamboOre("copper_ore", "oreCopper", 0, ConfigHandler.COPPER);
	public static final Block TIN_ORE = new MamboOre("tin_ore", "oreTin", 0, ConfigHandler.TIN);
//	public static final Block SILVER_ORE = new MamboOre("silver_ore", "oreSilver", 2, true);
//	public static final Block ETHERIUM_ORE = new MamboOre("etherium_ore", "oreEtherium", 3, true);
	
	
	// Storage Block
//	public static final Block ZINC_BLOCK = new MamboMetalBlock("zinc_block", "blockZinc", 0, true);
	public static final Block COPPER_BLOCK = new MamboMetalBlock("copper_block", "blockCopper", 0, ConfigHandler.COPPER);
	public static final Block TIN_BLOCK = new MamboMetalBlock("tin_block", "blockTin", 0, ConfigHandler.TIN);
//	public static final Block SILVER_BLOCK = new MamboMetalBlock("silver_block", "blockSilver", 2, true);
//	public static final Block ETHERIUM_BLOCK = new MamboMetalBlock("etherium_block", "blockEtherium", 3, true);
//	
//	public static final Block BRASS_BLOCK = new MamboMetalBlock("brass_block", "blockBrass", 0, true);
	public static final Block BRONZE_BLOCK = new MamboMetalBlock("bronze_block", "blockBronze", 1, ConfigHandler.BRONZE);
	public static final Block STEEL_BLOCK = new MamboMetalBlock("steel_block", "blockSteel", 2, ConfigHandler.STEEL);
	
//	public static final Block ASTRAL_SILVER_BLOCK = new MamboMetalBlock("astral_silver_block", "blockAstralSilver", 3, true);
//	public static final Block CELESTIAL_BRONZE_BLOCK = new MamboMetalBlock("celestial_bronze_block", "blockCelestialBronze", 3, true);
//	public static final Block IMPERIAL_GOLD_BLOCK = new MamboMetalBlock("imperial_gold_block", "blockImperialGold", 3, true);
//	public static final Block STYGIAN_IRON_BLOCK = new MamboMetalBlock("stygian_iron_block", "blockStygianIron", 3, true);
//	public static final Block VOID_STEEL_BLOCK = new MamboMetalBlock("void_steel_steel", "blockVoidSteel", 3, true);

}
