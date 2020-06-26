package com.github.mercury19.mambonomine.world.gen;

import java.util.Random;

import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.util.handlers.ConfigHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if(world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(true)
		{
			generateOre(BlockInit.ZINC_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 2 + random.nextInt(4), 20);
		}
		
		if(ConfigHandler.COPPER)
		{
			generateOre(BlockInit.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 72, 4 + random.nextInt(4), 20);
		}
		
		if(ConfigHandler.TIN)
		{
			generateOre(BlockInit.TIN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 56, 3 + random.nextInt(4), 20);
		}
		
		if(true)
		{
			generateOre(BlockInit.SILVER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ *16, 0, 31, 1 + random.nextInt(10), 20);
		}
		
		if(true)
		{
			generateOre(BlockInit.ETHERIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 15, 1 + random.nextInt(4), 2);
		}
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	

}
