package com.ankulamod.dataEntryPoint;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RefDataGenerator implements DataGeneratorEntrypoint 
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) 
	{
		//pack.addProvider(FabricDocsReferenceNetworkingBasicModelProvider::new);
	}

}