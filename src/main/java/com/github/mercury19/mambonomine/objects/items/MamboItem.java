package com.github.mercury19.mambonomine.objects.items;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraft.item.Item;

public class MamboItem extends Item
{

	public MamboItem(String name, boolean enabled)
	{
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		
		if (enabled)
		{
			ItemInit.ITEMS.add(this);
		}
	}


}
