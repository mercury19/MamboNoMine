package com.github.mercury19.mambonomine.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class MamboMetalBlock extends MamboBlock
{
	private String ore;

	public MamboMetalBlock(String name, String ore, int level, boolean enabled) {
		super(name, Material.IRON, enabled);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", level);
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre(ore, this);
	}

}
