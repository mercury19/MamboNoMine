package com.github.mercury19.mambonomine.objects.blocks;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{
	public BlockBase(String name, Material material, float hardness, float resistance, float lightlevel, String toolclass, int harvestlevel, SoundType soundtype, boolean enabled)
	{
		super(material);
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		setHardness(hardness);
		setResistance(resistance);
		setLightLevel(lightlevel);
		setHarvestLevel(toolclass, harvestlevel);
		setSoundType(soundtype);
		
		
		if (enabled) 
		{
			BlockInit.BLOCKS.add(this);
			ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		}
		
	}
	
}
