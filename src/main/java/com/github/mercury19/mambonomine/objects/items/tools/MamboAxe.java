package com.github.mercury19.mambonomine.objects.items.tools;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraft.item.ItemAxe;

public class MamboAxe extends ItemAxe
{

	private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F, -3.2F, -3.0F};
	
	public MamboAxe(String name, ToolMaterial material, boolean enabled) 
	{
		super(material, 6.0F + material.getAttackDamage(), ATTACK_SPEEDS[material.ordinal()]);
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		
		if (enabled)
		{
			ItemInit.ITEMS.add(this);
		}
	}
	
}
