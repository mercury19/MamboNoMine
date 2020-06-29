package com.github.mercury19.mambonomine.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class MamboOre extends MamboBlock
{
	private String oreName;
	
	public MamboOre(String name, String oreName, int level)
	{
		super(name, Material.ROCK);
		
		this.oreName = oreName;
		
		setHardness(3.0F);
		setResistance(5.0F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", level);
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public MamboOre setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}
}
