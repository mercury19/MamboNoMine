package com.github.mercury19.mambonomine.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.objects.blocks.BlockBase;
import com.github.mercury19.mambonomine.util.handlers.ConfigHandler;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	// Metals
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, 5.0F, 10.0F, 0, "pickaxe", 1, SoundType.METAL, ConfigHandler.COPPER);
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK, 3.0F, 5.0F, 0, "pickaxe", 1, SoundType.STONE, ConfigHandler.COPPER);
	
	public static final Block TIN_BLOCK = new BlockBase("tin_block", Material.IRON, 5.0F, 10.0F, 0, "pickaxe", 1, SoundType.METAL, ConfigHandler.TIN);
	public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK, 3.0F, 5.0F, 0, "pickaxe", 1, SoundType.STONE, ConfigHandler.TIN);
	
	public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON, 5.0F, 10.0F, 0, "pickaxe", 1, SoundType.METAL, ConfigHandler.BRONZE);
	
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON, 5.0F, 10.0F, 0, "pickaxe", 1, SoundType.METAL, ConfigHandler.STEEL);
	
	// Stone

}
