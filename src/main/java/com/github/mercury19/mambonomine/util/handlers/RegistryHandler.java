package com.github.mercury19.mambonomine.util.handlers;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.BlockInit;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.recipes.SmeltingRecipes;
import com.github.mercury19.mambonomine.world.gen.WorldGenOre;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
   
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            	MamboNoMine.proxy.registerItemRenderer(item, 0, "inventory");
        }
        
        for(Block block : BlockInit.BLOCKS)
        {
        		MamboNoMine.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }
    
    
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
    	event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }
    
    
    public static void preInitRegistries(FMLPreInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new WorldGenOre(), 4);
    	ConfigHandler.registerConfig(event);
    }
   
    public static void initRegistries()
    {
    	SmeltingRecipes.init();
    }
   
    public static void postInitRegistries()
    {
       
    }
   
    public static void serverRegistries(FMLServerStartingEvent event)
    {
       
    }
}
