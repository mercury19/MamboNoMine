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
	}

}
