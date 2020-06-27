package com.github.mercury19.mambonomine.objects.items;

import com.github.mercury19.mambonomine.objects.items.tools.MamboHoe;
import com.github.mercury19.mambonomine.objects.items.tools.MamboPickaxe;
import com.github.mercury19.mambonomine.objects.items.tools.MamboShovel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.oredict.OreDictionary;

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


	
	private String name;

	public MamboMetal(String name, ToolMaterial toolMaterial, ArmorMaterial armorMaterial, boolean enabled) 
	{			
		this.INGOT = new MamboItem(name + "_ingot", enabled);
		this.NUGGET = new MamboItem(name + "_nugget", enabled);
		if (toolMaterial != null)
		{
//			this.AXE = new MamboAxe(name + "_axe", toolMaterial, enabled);
//			this.HOE = new MamboHoe(name + "_hoe", toolMaterial, enabled);
//			this.PICKAXE = new MamboPickaxe(name + "_pickaxe", toolMaterial, enabled);
//			this.SHOVEL = new MamboShovel(name + "_shovel", toolMaterial, enabled);
//			this.SWORD = new MamboSword(name + "_sword", material, enabled);
		}
		if (armorMaterial != null)
		{
//			this.HELMET = new MamboArmor(name + "_helmet", armorMaterial, 1, EntityEquipmentSlot.HEAD, enabled);
//			this.CHESTPLATE = new MamboArmor(name + "_chestplate", armorMaterial, 1, EntityEquipmentSlot.CHEST, enabled);
//			this.LEGS = new MamboArmor(name + "_legs", armorMaterial, 2, EntityEquipmentSlot.LEGS, enabled);
//			this.BOOTS = new MamboArmor(name + "_boots", armorMaterial, 1, EntityEquipmentSlot.FEET, enabled);
		}
		
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre("ingot" + name.substring(0,1).toUpperCase() + name.substring(1), this.INGOT);
		OreDictionary.registerOre("nugget" + name.substring(0,1).toUpperCase() + name.substring(1), this.NUGGET);
	}
}
