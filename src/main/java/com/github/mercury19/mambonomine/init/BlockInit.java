package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK);
	public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON);
	public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK);
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON);

}
