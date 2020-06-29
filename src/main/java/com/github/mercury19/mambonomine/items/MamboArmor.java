package com.github.mercury19.mambonomine.items;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class MamboArmor extends ItemArmor
{

	public MamboArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setTranslationKey(MamboNoMine.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.creativeTab);
	}

}
