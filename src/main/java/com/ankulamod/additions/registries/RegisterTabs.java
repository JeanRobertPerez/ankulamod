package com.ankulamod.additions.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RegisterTabs
{
	
	public static final ItemGroup ANKULATAB = FabricItemGroup.builder()
	        .icon(() -> new ItemStack(RegisterItems.SILVER_INGOT))
	        .displayName(Text.translatable("itemGroup.ankulamod.ankulatab"))
	        .entries((context, entries) -> {
	            entries.add(RegisterItems.SILVER_INGOT);
	        })
	        .build();
	
	public static void register()
	{
		 Registry.register(Registries.ITEM_GROUP, Identifier.of("tutorial", "ankulatab"), ANKULATAB);
	}
}
