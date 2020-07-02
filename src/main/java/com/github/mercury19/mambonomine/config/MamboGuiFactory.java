package com.github.mercury19.mambonomine.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

public class MamboGuiFactory implements IModGuiFactory
{
	@Override
	public void initialize(Minecraft minecraftInstance)
	{
		
	}
	
	public GuiScreen createConfigGui(GuiScreen parentScreen)
	{
		return new MamboConfigGui(parentScreen);
	}
	
	public boolean hasConfigGui()
	{
		return true;
	}
	
	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
	{
		return null;
	}
	
	public static class MamboConfigGui extends GuiConfig
	{
		public MamboConfigGui(GuiScreen parentScreen)
		{
			super(parentScreen, getConfigElements(), MamboNoMine.MODID, false, false, I18n.format("gui.config.mainTitle"));
		}
		
		private static List<IConfigElement> getConfigElements()
		{
			List<IConfigElement> list = new ArrayList<IConfigElement>();
			list.add(new DummyCategoryElement("Metals", "gui.config.ctgy.metals", CategoryEntryMetals.class));
			list.add(new DummyCategoryElement("Stats", "gui.config.ctgy.stats", CategoryEntryStats.class));
			return list;
		}
		
		public static class CategoryEntryMetals extends CategoryEntry
		{
			public CategoryEntryMetals(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
			{
				super(owningScreen, owningEntryList, prop);
			}
			
			@Override
			protected GuiScreen buildChildScreen()
			{
				Configuration configuration = Config.getConfig();
				ConfigElement cat_metals = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_METALS));
				List<IConfigElement> propertiesOnThisScreen = cat_metals.getChildElements();
				String windowTitle = configuration.toString();
				
				return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
						this.owningScreen.modID,
						Config.CATEGORY_NAME_METALS,
						this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
						this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, 
						windowTitle);
			}
		}
		
		public static class CategoryEntryStats extends CategoryEntry
		{
			public CategoryEntryStats(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
			{
				super(owningScreen, owningEntryList, prop);
			}
			
			@Override
			protected GuiScreen buildChildScreen()
			{
				Configuration configuration = Config.getConfig();
				ConfigElement cat_metals = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_STATS));
				List<IConfigElement> propertiesOnThisScreen = cat_metals.getChildElements();
				String windowTitle = configuration.toString();
				
				return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
						this.owningScreen.modID,
						Config.CATEGORY_NAME_STATS,
						this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
						this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, 
						windowTitle);
			}
		}
		
		public static class CategoryEntryWorld extends CategoryEntry
		{
			public CategoryEntryWorld(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
			{
				super(owningScreen, owningEntryList, prop);
			}
			
			@Override
			protected GuiScreen buildChildScreen()
			{
				Configuration configuration = Config.getConfig();
				ConfigElement cat_metals = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_WORLG_GEN));
				List<IConfigElement> propertiesOnThisScreen = cat_metals.getChildElements();
				String windowTitle = configuration.toString();
				
				return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
						this.owningScreen.modID,
						Config.CATEGORY_NAME_WORLG_GEN,
						this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
						this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, 
						windowTitle);
			}
		}
	}
}
