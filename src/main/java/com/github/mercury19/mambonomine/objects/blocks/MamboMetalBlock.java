package com.github.mercury19.mambonomine.objects.blocks;

import com.github.mercury19.mambonomine.init.OreDictInit;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MamboMetalBlock extends MamboBlock
{
	public MamboMetalBlock(String name, String ore, int level, boolean enabled) {
		super(name, Material.IRON, enabled);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", level);
		
		if (enabled)
		{
			OreDictInit.ORES.add(ore);
			OreDictInit.ORE_NAMES.add(new ItemBlock(this));
		}
		
	}

}
