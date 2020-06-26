package com.github.mercury19.mambonomine.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class MamboOre extends MamboBlock
{
	private String ore;
	
	public MamboOre(String name, String ore, int level, boolean enabled)
	{
		
		super(name, Material.ROCK, enabled);
		setHardness(3.0F);
		setResistance(5.0F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", level);
		
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre(ore, this);
	}

}
