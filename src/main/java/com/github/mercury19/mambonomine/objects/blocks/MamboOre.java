package com.github.mercury19.mambonomine.objects.blocks;

import com.github.mercury19.mambonomine.init.OreDictInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class MamboOre extends MamboBlock
{
	public MamboOre(String name, String ore, int level, boolean enabled)
	{
		
		super(name, Material.ROCK, enabled);
		setHardness(3.0F);
		setResistance(5.0F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", level);
		
		if (enabled)
		{
			OreDictInit.ORES.add(ore);
			OreDictInit.ORE_NAMES.add(new ItemBlock(this));
		}
	}
}
