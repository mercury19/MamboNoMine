package com.github.mercury19.mambonomine.items;

import net.minecraftforge.oredict.OreDictionary;

public class MamboMetal extends MamboItem
{

	private String oreName;
	
	public MamboMetal(String name, String oreName) 
	{
		super(name);
		
		this.oreName = oreName;
	}
	
	public void initOreDict()
	{
		OreDictionary.registerOre(oreName, this);
	}

}
