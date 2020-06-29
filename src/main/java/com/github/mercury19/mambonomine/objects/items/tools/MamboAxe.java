package com.github.mercury19.mambonomine.objects.items.tools;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraft.item.ItemAxe;

public class MamboAxe extends ItemAxe
{
	
	public MamboAxe(String name, ToolMaterial material, float speed, boolean enabled) 
	{
		super(material, 7.0F + material.getAttackDamage(), speed);
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		
		if (enabled)
		{
			ItemInit.ITEMS.add(this);
		}
	}
	
}
