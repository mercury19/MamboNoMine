package com.github.mercury19.mambonomine.objects.items;

import com.github.mercury19.mambonomine.MamboNoMine;
import com.github.mercury19.mambonomine.init.ItemInit;
import com.github.mercury19.mambonomine.util.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class MamboArmor extends ItemArmor
{

	public MamboArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, boolean enabled) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setTranslationKey(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.MAMBO_TAB);
		
		if (enabled)
		{
			ItemInit.ITEMS.add(this);
		}
	}

}
