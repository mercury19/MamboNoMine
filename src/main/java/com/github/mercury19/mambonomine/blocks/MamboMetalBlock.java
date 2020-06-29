package com.github.mercury19.mambonomine.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class MamboMetalBlock extends MamboBlock
{
	private String oreName;
	
	public MamboMetalBlock(String name, String oreName, int level) 
	{
		super(name, Material.IRON);
		
		this.oreName = oreName;
		
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", level);
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public MamboMetalBlock setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}

}
