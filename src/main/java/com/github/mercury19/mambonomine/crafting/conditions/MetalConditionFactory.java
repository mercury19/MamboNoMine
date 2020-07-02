package com.github.mercury19.mambonomine.crafting.conditions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

import com.github.mercury19.mambonomine.config.Config;
import com.google.gson.JsonObject;

import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class MetalConditionFactory implements IConditionFactory
{
	
	private Map<String, Boolean> METALS = new HashMap<String, Boolean>()
			{{
				put ("zinc", Config.enableZinc);
				put ("copper", Config.enableCopper);
				put ("tin", Config.enableTin);
				put ("brass", Config.enableBrass);
				put ("bronze", Config.enableBronze);
				put ("steel", Config.enableSteel);
			}};

	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{
		String value = JsonUtils.getString(json, "value");
		return () -> METALS.get(value) == true;
	}

}
