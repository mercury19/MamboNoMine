package com.github.mercury19.mambonomine.blocks;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MamboBlock extends Block
{
	protected String name;
	
	public MamboBlock(String name, Material material)
	{
		super(material);
		
		this.name = name;
		
		setTranslationKey(MamboNoMine.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.creativeTab);
	}
	
	public void registerItemModel(Item itemBlock)
	{
		MamboNoMine.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock()
	{
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public MamboBlock setCreativeTab(CreativeTabs tab)
	{
		super.setCreativeTab(tab);
		return this;
	}
	
}
