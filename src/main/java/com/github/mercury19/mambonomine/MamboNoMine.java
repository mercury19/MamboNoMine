package com.github.mercury19.mambonomine;

import com.github.mercury19.mambonomine.client.MamboTab;
import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.proxy.CommonProxy;
import com.github.mercury19.mambonomine.recipe.MamboRecipes;
import com.github.mercury19.mambonomine.world.gen.WorldGenOre;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;;

@Mod(modid = MamboNoMine.MODID, name = MamboNoMine.MODNAME, version = MamboNoMine.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class MamboNoMine 
{
	public static final String MODID = "mambonomine";
	public static final String MODNAME = "Mambo No. Mine";
	public static final String MODVERSION = "0.1.0";
	
	@Mod.Instance(MODID)
	public static MamboNoMine instance;
	
	@SidedProxy(clientSide = "com.github.mercury19.mambonomine.proxy.ClientProxy", serverSide = "com.github.mercury19.mambonomine.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final MamboTab creativeTab = new  MamboTab();
	
	// Tool Materials
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("COPPER", 1, 175, 5.0F, 1.0F, 12);
//	public static final ToolMaterial TOOL_SILVER = EnumHelper.addToolMaterial("SILVER", 1, 32, 10.0F, 1.0F, 20);
//	
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 360, 6.0F, 2.0F, 16);
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("STEEL", 2, 500, 7.0F, 2.0F, 10);
//	
//	public static final ToolMaterial TOOL_ASILVER = EnumHelper.addToolMaterial("ASTRAL_SILVER", 3, 1864, 9.0F, 4.0F, 24);
//	public static final ToolMaterial TOOL_CBRONZE = EnumHelper.addToolMaterial("CELESTIAL_BRONZE", 3, 1864, 9.0F, 4.0F, 24);
//	public static final ToolMaterial TOOL_IGOLD = EnumHelper.addToolMaterial("IMPERIAL_GOLD", 3, 1864, 9.0F, 4.0F, 24);
//	public static final ToolMaterial TOOL_SIRON = EnumHelper.addToolMaterial("STYGIAN_IRON", 3, 1864, 9.0F, 4.0F, 24);
//	public static final ToolMaterial TOOL_VSTEEL = EnumHelper.addToolMaterial("VOID_STEEL", 3, 1864, 9.0F, 4.0F, 24);
//	
//	
//	// Armor Materials
//	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("COPPER", MamboNoMine.MODID + ":copper", 11, new int[] {1, 3, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
//	public static final ArmorMaterial ARMOR_SILVER = EnumHelper.addArmorMaterial("SILVER", MamboNoMine.MODID + ":silver", 8, new int[] {2, 3, 5, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1);
//	
//	public static final ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("BRONZE", MamboNoMine.MODID + ":bronze", 17, new int[] {2, 4, 5, 2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
//	public static final ArmorMaterial ARMOR_STEEL = EnumHelper.addArmorMaterial("STEEL", MamboNoMine.MODID + ":steel", 21, new int[] {3, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F);
//	
//	public static final ArmorMaterial ARMOR_ASILVER = EnumHelper.addArmorMaterial("ASTRAL_SILVER", MamboNoMine.MODID + ":astral_silver", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
//	public static final ArmorMaterial ARMOR_CBRONZE = EnumHelper.addArmorMaterial("CELESTIAL_BRONZE", MamboNoMine.MODID + ":celestial_bronze", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
//	public static final ArmorMaterial ARMOR_IGOLD = EnumHelper.addArmorMaterial("IMPERIAL_GOLD", MamboNoMine.MODID + ":imperial_gold", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
//	public static final ArmorMaterial ARMOR_SIRON = EnumHelper.addArmorMaterial("STYGIAN_IRON", MamboNoMine.MODID + ":stygian_iron", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
//	public static final ArmorMaterial ARMOR_VSTEEL = EnumHelper.addArmorMaterial("VOID_STEEL", MamboNoMine.MODID + ":void_steel", 37, new int[] {3,  6,  8,  3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
//
	
	
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
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 3);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		MamboRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
