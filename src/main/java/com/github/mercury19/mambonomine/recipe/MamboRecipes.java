package com.github.mercury19.mambonomine.recipe;

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
		BlockInit.ETHERIUM_ORE.initOreDict();
		
		// Ore Dict Init Storage Blocks
		BlockInit.ZINC_BLOCK.initOreDict();
		
		// Ore Dict Init Ingots
		ItemInit.ZINC_INGOT.initOreDict();
		
		// Ore Dict Init Nuggets
		ItemInit.ZINC_NUGGET.initOreDict();
		
		// Smelting Recipes
		GameRegistry.addSmelting(BlockInit.ZINC_ORE, new ItemStack(ItemInit.ZINC_INGOT), 0.3f);
		GameRegistry.addSmelting(BlockInit.ETHERIUM_ORE, new ItemStack(ItemInit.ETHERIUM), 1.5f);
	}
}
