package com.github.mercury19.mambonomine.objects.blocks;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;
import com.github.mercury19.mambonomine.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel 
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
	@Override
	public void registerModels()
	{
		MamboNoMine.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
