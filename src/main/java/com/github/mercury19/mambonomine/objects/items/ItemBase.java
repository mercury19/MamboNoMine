package com.github.mercury19.mambonomine.objects.items;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;
import com.github.mercury19.mambonomine.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		
		ItemInit.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() 
	{
		
		MamboNoMine.proxy.registerItemRenderer(this, 0, "inventory");

	}

}
