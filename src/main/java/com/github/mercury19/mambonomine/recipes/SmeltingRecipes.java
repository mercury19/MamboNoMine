package com.github.mercury19.mambonomine.recipes;

import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
	
	public static void init()
	{
		GameRegistry.addSmelting(new ItemStack(BlockInit.COPPER_ORE), new ItemStack(ItemInit.COPPER.INGOT), 0.5f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.TIN_ORE), new ItemStack(ItemInit.TIN.INGOT), 0.5f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ZINC_ORE), new ItemStack(ItemInit.ZINC.INGOT), 0.5f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ETHERIUM_ORE), new ItemStack(ItemInit.ETHERIUM), 1.5f);
	}

}
