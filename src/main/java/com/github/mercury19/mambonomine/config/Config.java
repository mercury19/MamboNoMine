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
	public static boolean enableEtherium;
	
	public static boolean enableZinc;
	public static boolean enableCopper;
	public static boolean enableTin;
	public static boolean enableSilver;
	
	public static boolean enableBrass;
	public static boolean enableBronze;
	public static boolean enableSteel;
	
	public static boolean enableFulgurite;
	
	public static final String CATEGORY_NAME_METALS = "category_metals";
	public static final String CATEGORY_NAME_STATS = "category_stats";
	public static final String CATEGORY_NAME_WORLG_GEN = "category_world_gen";
	
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
		
		final boolean ZINC_DEFAULT_VALUE = true;
		Property propZincBool = config.get(CATEGORY_NAME_METALS, "enableZinc", ZINC_DEFAULT_VALUE);
		propZincBool.setComment("Enable/disable Zinc world generation and all items and blocks.");
		propZincBool.setLanguageKey("gui.config.enableZinc").setRequiresMcRestart(true);
		
		final boolean COPPER_DEFAULT_VALUE = true;
		Property propCopperBool = config.get(CATEGORY_NAME_METALS, "enableCopper", COPPER_DEFAULT_VALUE);
		propCopperBool.setComment("Enable/disable Copper world generation and all items and blocks.");
		propCopperBool.setLanguageKey("gui.config.enableCopper").setRequiresMcRestart(true);
		
		final boolean TIN_DEFAULT_VALUE = true;
		Property propTinBool = config.get(CATEGORY_NAME_METALS, "enableTin", TIN_DEFAULT_VALUE);
		propTinBool.setComment("Enable/disable Tin world generation and all items and blocks.");
		propTinBool.setLanguageKey("gui.config.enableTin").setRequiresMcRestart(true);
		
		final boolean BRASS_DEFAULT_VALUE = true;
		Property propBrassBool = config.get(CATEGORY_NAME_METALS, "enableBrass", BRASS_DEFAULT_VALUE);
		propBrassBool.setComment("Enable/disable Brass world generation and all items and blocks.");
		propBrassBool.setLanguageKey("gui.config.enableBrass").setRequiresMcRestart(true);
		
		final boolean BRONZE_DEFAULT_VALUE = true;
		Property propBronzeBool = config.get(CATEGORY_NAME_METALS, "enableBronze", BRONZE_DEFAULT_VALUE);
		propBronzeBool.setComment("Enable/disable Bronze world generation and all items and blocks.");
		propBronzeBool.setLanguageKey("gui.config.enableBronze").setRequiresMcRestart(true);
		
		final boolean STEEL_DEFAULT_VALUE = true;
		Property propSteelBool = config.get(CATEGORY_NAME_METALS, "enableSteel", STEEL_DEFAULT_VALUE);
		propSteelBool.setComment("Enable/disable all Steel items and blocks.");
		propSteelBool.setLanguageKey("gui.config.enableSteel").setRequiresMcRestart(true);
		
		List<String> propOrderGeneral = new ArrayList<String>();
		propOrderGeneral.add(propZincBool.getName());
		propOrderGeneral.add(propCopperBool.getName());
		propOrderGeneral.add(propTinBool.getName());
		propOrderGeneral.add(propBrassBool.getName());
		propOrderGeneral.add(propBronzeBool.getName());
		propOrderGeneral.add(propSteelBool.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_METALS, propOrderGeneral);
		
		if (readFieldsFromConfig)
		{
			enableZinc = propZincBool.getBoolean(ZINC_DEFAULT_VALUE);
			enableCopper = propCopperBool.getBoolean(COPPER_DEFAULT_VALUE);
			enableTin = propTinBool.getBoolean(TIN_DEFAULT_VALUE);
			enableBrass = propBrassBool.getBoolean(BRASS_DEFAULT_VALUE);
			enableBronze = propBronzeBool.getBoolean(BRONZE_DEFAULT_VALUE);
			enableSteel = propSteelBool.getBoolean(STEEL_DEFAULT_VALUE);
		}
		
		propZincBool.set(enableZinc);
		propCopperBool.set(enableCopper);
		propTinBool.set(enableTin);
		propBrassBool.set(enableBrass);
		propBronzeBool.set(enableBronze);
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
