package com.github.mercury19.mambonomine.util.handlers;

import java.io.File;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ConfigHandler 
{
	public static Configuration config;
	
	public static boolean COPPER = true;
	public static boolean TIN = true;
	public static boolean BRONZE = true;
	public static boolean STEEL = true;
		
   public static void init(File file)
	{
		config = new Configuration(file);
		String category;
		
		category = "METALS";
		config.addCustomCategoryComment(category, "Enable/Disable the various metals added by this mod [default: true]");
		COPPER = config.getBoolean("Copper", category, true, null);
		TIN = config.getBoolean("Tin", category, true, null);
		BRONZE = config.getBoolean("Bronze", category, true, null);
		STEEL = config.getBoolean("Steel", category, true, null);
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		MamboNoMine.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		MamboNoMine.config.mkdirs();
		init(new File(MamboNoMine.config.getPath(), Reference.MODID + ".cfg"));
	}

} 

