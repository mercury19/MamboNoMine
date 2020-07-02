package com.github.mercury19.mambonomine.crafting;

import com.github.mercury19.mambonomine.config.Config;
import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MamboRecipes 
{
	public static void init()
	{
		if (Config.enableEtherium) 
		{
			BlockInit.ETHERIUM_ORE.initOreDict();
		}
		// Ore Dict Init Zinc
		if (Config.enableZinc)
		{
			BlockInit.ZINC_ORE.initOreDict();
			BlockInit.ZINC_BLOCK.initOreDict();
			ItemInit.ZINC_INGOT.initOreDict();
			ItemInit.ZINC_NUGGET.initOreDict();	
		}
		
		// Ore Dict Init Copper
		if (Config.enableCopper)
		{
			BlockInit.COPPER_ORE.initOreDict();	
			BlockInit.COPPER_BLOCK.initOreDict();
			ItemInit.COPPER_INGOT.initOreDict();
			ItemInit.COPPER_NUGGET.initOreDict();		
		}
		
		// Ore Dict Init Tin
		if (Config.enableTin)
		{
			BlockInit.TIN_ORE.initOreDict();
			BlockInit.TIN_BLOCK.initOreDict();
			ItemInit.TIN_INGOT.initOreDict();
			ItemInit.TIN_NUGGET.initOreDict();			
		}
		
		
		// Ore Dict Init Brass
		if (Config.enableBrass)
		{
			BlockInit.BRASS_BLOCK.initOreDict();
			ItemInit.BRASS_INGOT.initOreDict();
			ItemInit.BRASS_NUGGET.initOreDict();			
		}
		
		// Ore Dict Init Bronze
		if (Config.enableBronze)
		{
			BlockInit.BRONZE_BLOCK.initOreDict();
			ItemInit.BRONZE_INGOT.initOreDict();
			ItemInit.BRONZE_NUGGET.initOreDict();			
		}
		
		// Ore Dict Init Steel
		if (Config.enableSteel)
		{
			BlockInit.STEEL_BLOCK.initOreDict();
			ItemInit.STEEL_INGOT.initOreDict();
			ItemInit.STEEL_NUGGET.initOreDict();
		}
		
		
		// Smelting Recipes
		if (Config.enableZinc) 
		{
			GameRegistry.addSmelting(BlockInit.ZINC_ORE, new ItemStack(ItemInit.ZINC_INGOT), 0.3f);
		}
		if (Config.enableCopper) 
		{
			GameRegistry.addSmelting(BlockInit.COPPER_ORE, new ItemStack(ItemInit.COPPER_INGOT), 0.4f);
		}
		if (Config.enableTin) 
		{
			GameRegistry.addSmelting(BlockInit.TIN_ORE, new ItemStack(ItemInit.TIN_INGOT), 0.4f);
		}
		if (Config.enableEtherium) 
		{
			GameRegistry.addSmelting(BlockInit.ETHERIUM_ORE, new ItemStack(ItemInit.ETHERIUM), 1.5f);
		}
	}
}
