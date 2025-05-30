package com.ankulamod.additions.registries;

import java.util.function.Function;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

public class RegisterItems {
	
	public static final ToolMaterial GUIDITE_TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 455, 5.0F, 1.5F, 22, null);

	public static final Item SILVER_INGOT = register("silver_ingot", Item::new, new Item.Settings());
	 
	  public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings)
	  {
	    final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("ankulamod", path));
	    return Items.register(registryKey, factory, settings);
	  }
	 
	  public static void register() 
	  {
	  }
	  
}
