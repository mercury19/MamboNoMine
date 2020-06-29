package com.github.mercury19.mambonomine;

import java.io.File;

import org.apache.logging.log4j.Logger;

import com.github.mercury19.mambonomine.client.MamboTab;
import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.proxy.CommonProxy;
import com.github.mercury19.mambonomine.recipe.MamboRecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;;

@Mod(modid = MamboNoMine.MODID, name = MamboNoMine.MODNAME, version = MamboNoMine.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class MamboNoMine 
{
	public static final String MODID = "mambonomine";
	public static final String MODNAME = "Mambo No. Mine";
	public static final String MODVERSION = "0.1.0";
	
	
	public static File config;
	
	@Instance(MODID)
	public static MamboNoMine instance;
	
	public static Logger logger;
	
	@SidedProxy(clientSide = "com.github.mercury19.mambonomine.proxy.ClientProxy", serverSide = "com.github.mercury19.mambonomine.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final MamboTab creativeTab = new  MamboTab();
	
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler
	{
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) 
		{
			ItemInit.register(event.getRegistry());
			BlockInit.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event)
		{
			ItemInit.registerModels();
			BlockInit.registerModels();
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			BlockInit.register(event.getRegistry());
		}
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MamboRecipes.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
