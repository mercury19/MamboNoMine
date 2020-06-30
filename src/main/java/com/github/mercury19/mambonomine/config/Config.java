package com.github.mercury19.mambonomine.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Config 
{
	public static boolean enableSteel;
	
	public static final String CATEGORY_NAME_METALS = "category_metal";
	public static final String CATEGORY_NAME_STATS = "category_stats";
	
	public static void preInit()
	{
		File configFile = new File(Loader.instance().getConfigDir(), "mambonomine.cfg");
		config =  new Configuration(configFile);
		syncFromFile();
	}
	
	public static void clientPreinit()
	{
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}
	
	public static Configuration getConfig()
	{
		return config;
	}
	
	public static void syncFromFile()
	{
		syncConfig(true, true);
	}
	
	public static void syncFromGUI()
	{
		syncConfig(false, true);
	}
	
	public static void syncFromfields()
	{
		syncConfig(false, false);
	}
	
	private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig)
	{
		if (loadConfigFromFile)
		{
			config.load();
		}
		
		final boolean STEEL_DEFAULT_VALUE = true;
		Property propSteelBool = config.get(CATEGORY_NAME_METALS, "enableSteel", STEEL_DEFAULT_VALUE);
		propSteelBool.setComment("Enable/disable all Steel items and blocks.");
		propSteelBool.setLanguageKey("gui.config.enableSteel").setRequiresMcRestart(true);
		
		List<String> propOrderGeneral = new ArrayList<String>();
		propOrderGeneral.add(propSteelBool.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_METALS, propOrderGeneral);
		
		if (readFieldsFromConfig)
		{
			enableSteel = propSteelBool.getBoolean(STEEL_DEFAULT_VALUE);
		}
		
		propSteelBool.set(enableSteel);
		
		if (config.hasChanged())
		{
			config.save();
		}
		
		
	}
	
	private static Configuration config = null;
	
	public static class ConfigEventHandler
	{
		@SubscribeEvent(priority = EventPriority.NORMAL)
		public void onEvent (ConfigChangedEvent.OnConfigChangedEvent event)
		{
			if (MamboNoMine.MODID.equals(event.getModID()) && !event.isWorldRunning())
			{
				if (event.getConfigID().equals(CATEGORY_NAME_METALS) || event.getConfigID().equals(CATEGORY_NAME_STATS))
				{
					syncFromGUI();
				}
			}
		}
	}
}
