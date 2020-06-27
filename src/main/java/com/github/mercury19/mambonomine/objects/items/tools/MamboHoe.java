package com.github.mercury19.mambonomine.objects.items.tools;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraft.item.ItemHoe;

public class MamboHoe extends ItemHoe
{

	public MamboHoe(String name, ToolMaterial material, boolean enabled) 
	{
		super(material);
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		
		if (enabled)
		{
			ItemInit.ITEMS.add(this);
		}
	}

}
