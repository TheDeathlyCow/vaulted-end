package com.thedeathlycow.vaulted.end;

import com.thedeathlycow.vaulted.end.registry.VaultEndItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaultedEnd implements ModInitializer {
	public static final String MOD_ID = "vaulted-end";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		VaultEndItems.initialize();


	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}