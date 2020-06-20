package com.github.mercury19.mambonomine.recipes;

import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
	
	public static void init()
	{
		GameRegistry.addSmelting(new ItemStack(BlockInit.COPPER_ORE), new ItemStack(ItemInit.COPPER_INGOT), 0.5f);
		GameRegistry.addSmelting(new ItemStack(BlockInit.TIN_ORE), new ItemStack(ItemInit.TIN_INGOT), 0.5f);
		GameRegistry.addSmelting(new ItemStack(ItemInit.RAW_STEEL_INGOT), new ItemStack(ItemInit.STEEL_INGOT), 0.5f);
	}

}
