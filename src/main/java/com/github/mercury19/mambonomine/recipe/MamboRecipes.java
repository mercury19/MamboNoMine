package com.github.mercury19.mambonomine.recipe;

import com.github.mercury19.mambonomine.config.Config;
import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MamboRecipes 
{
	public static void init()
	{
		// Ore Dict Init Ores
		BlockInit.ZINC_ORE.initOreDict();
		BlockInit.COPPER_ORE.initOreDict();
		BlockInit.TIN_ORE.initOreDict();
		BlockInit.ETHERIUM_ORE.initOreDict();
		
		// Ore Dict Init Storage Blocks
		BlockInit.ZINC_BLOCK.initOreDict();
		BlockInit.COPPER_BLOCK.initOreDict();
		BlockInit.TIN_BLOCK.initOreDict();
		BlockInit.BRASS_BLOCK.initOreDict();
		BlockInit.BRONZE_BLOCK.initOreDict();
		
		// Ore Dict Init Ingots
		ItemInit.ZINC_INGOT.initOreDict();
		ItemInit.COPPER_INGOT.initOreDict();
		ItemInit.TIN_INGOT.initOreDict();
		ItemInit.BRASS_INGOT.initOreDict();
		ItemInit.BRONZE_INGOT.initOreDict();
		
		// Ore Dict Init Nuggets
		ItemInit.ZINC_NUGGET.initOreDict();
		ItemInit.COPPER_NUGGET.initOreDict();
		ItemInit.TIN_NUGGET.initOreDict();
		ItemInit.BRASS_NUGGET.initOreDict();
		ItemInit.BRONZE_NUGGET.initOreDict();
		
		// Ore Dict Init Steel
		if (Config.enableSteel)
		{
			BlockInit.STEEL_BLOCK.initOreDict();
			ItemInit.STEEL_INGOT.initOreDict();
			ItemInit.STEEL_NUGGET.initOreDict();
		}
		
		// Smelting Recipes
		GameRegistry.addSmelting(BlockInit.ZINC_ORE, new ItemStack(ItemInit.ZINC_INGOT), 0.3f);
		GameRegistry.addSmelting(BlockInit.COPPER_ORE, new ItemStack(ItemInit.COPPER_INGOT), 0.4f);
		GameRegistry.addSmelting(BlockInit.TIN_ORE, new ItemStack(ItemInit.TIN_INGOT), 0.4f);
		GameRegistry.addSmelting(BlockInit.ETHERIUM_ORE, new ItemStack(ItemInit.ETHERIUM), 1.5f);
	}
}
