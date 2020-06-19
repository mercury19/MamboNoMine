package com.github.mercury19.mambonomine;

import com.github.mercury19.mambonomine.proxy.CommonProxy;
import com.github.mercury19.mambonomine.recipes.SmeltingRecipes;
import com.github.mercury19.mambonomine.tabs.MamboNoMineTab;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class MamboNoMine 
{
	
	@Instance
	public static MamboNoMine instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final MamboNoMineTab MAMBO_TAB = new  MamboNoMineTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		SmeltingRecipes.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		
	}



}
