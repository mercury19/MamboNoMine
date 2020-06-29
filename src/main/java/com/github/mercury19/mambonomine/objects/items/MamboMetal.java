package com.github.mercury19.mambonomine.objects.items;

import com.github.mercury19.mambonomine.init.OreDictInit;
import com.github.mercury19.mambonomine.objects.items.tools.MamboAxe;
import com.github.mercury19.mambonomine.objects.items.tools.MamboHoe;
import com.github.mercury19.mambonomine.objects.items.tools.MamboPickaxe;
import com.github.mercury19.mambonomine.objects.items.tools.MamboShovel;
import com.github.mercury19.mambonomine.objects.items.tools.MamboSword;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class MamboMetal
{
	public Item INGOT;
	public Item NUGGET;
	
	public Item AXE;
	public Item HOE;
	public Item PICKAXE;
	public Item SHOVEL;
	public Item SWORD;

	public Item HELMET;
	public Item CHESTPLATE;
	public Item LEGS;
	public Item BOOTS;


	public MamboMetal(String name, ToolMaterial toolMaterial, ArmorMaterial armorMaterial, boolean enabled) 
	{			
		this.INGOT = new MamboItem(name + "_ingot", enabled);
		this.NUGGET = new MamboItem(name + "_nugget", enabled);
		if (toolMaterial != null)
		{
			this.AXE = new MamboAxe(name + "_axe", toolMaterial, -3.2F, enabled);
			this.HOE = new MamboHoe(name + "_hoe", toolMaterial, enabled);
			this.PICKAXE = new MamboPickaxe(name + "_pickaxe", toolMaterial, enabled);
			this.SHOVEL = new MamboShovel(name + "_shovel", toolMaterial, enabled);
			this.SWORD = new MamboSword(name + "_sword", toolMaterial, enabled);
		}
		if (armorMaterial != null)
		{
//			this.HELMET = new MamboArmor(name + "_helmet", armorMaterial, 1, EntityEquipmentSlot.HEAD, enabled);
//			this.CHESTPLATE = new MamboArmor(name + "_chestplate", armorMaterial, 1, EntityEquipmentSlot.CHEST, enabled);
//			this.LEGS = new MamboArmor(name + "_legs", armorMaterial, 2, EntityEquipmentSlot.LEGS, enabled);
//			this.BOOTS = new MamboArmor(name + "_boots", armorMaterial, 1, EntityEquipmentSlot.FEET, enabled);
		}
		
		if (enabled)
		{
			OreDictInit.ORES.add("ingot" + name.substring(0,1).toUpperCase() + name.substring(1));
			OreDictInit.ORE_NAMES.add(this.INGOT);
			OreDictInit.ORES.add("nugget" + name.substring(0,1).toUpperCase() + name.substring(1));
			OreDictInit.ORE_NAMES.add(this.NUGGET);
		}
		
	}

}
