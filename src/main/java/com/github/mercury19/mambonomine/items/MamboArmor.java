package com.github.mercury19.mambonomine.items;

import com.github.mercury19.mambonomine.MamboNoMine;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class MamboArmor extends ItemArmor
{
	
	private String name;

	public MamboArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		this.name = name;
		
		setTranslationKey(MamboNoMine.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(MamboNoMine.creativeTab);
	}
	
	public void registerItemModel()
	{
		MamboNoMine.proxy.registerItemRenderer(this, 0, name);
	}
}
