package com.github.mercury19.mambonomine.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictInit 
{
	
	public static void registerOres()
	{
		OreDictionary.registerOre("oreCopper", BlockInit.COPPER_ORE);
		OreDictionary.registerOre("blockCopper", BlockInit.COPPER_BLOCK);
		OreDictionary.registerOre("ingotCopper", ItemInit.COPPER_INGOT);
		OreDictionary.registerOre("nuggetCopper", ItemInit.COPPER_NUGGET);
		
		OreDictionary.registerOre("oreTin", BlockInit.TIN_ORE);
		OreDictionary.registerOre("blockTin", BlockInit.TIN_BLOCK);
		OreDictionary.registerOre("ingotTin", ItemInit.TIN_INGOT);
		OreDictionary.registerOre("nuggetTin", ItemInit.TIN_NUGGET);
		
		OreDictionary.registerOre("blockBronze", BlockInit.BRONZE_BLOCK);
		OreDictionary.registerOre("ingotBronze", ItemInit.BRONZE_INGOT);
		OreDictionary.registerOre("nuggetBronze", ItemInit.BRONZE_NUGGET);
		
		OreDictionary.registerOre("blockSteel", BlockInit.STEEL_BLOCK);
		OreDictionary.registerOre("ingotSteel", ItemInit.STEEL_INGOT);
		OreDictionary.registerOre("nuggetSteel", ItemInit.STEEL_NUGGET);
	}

}
