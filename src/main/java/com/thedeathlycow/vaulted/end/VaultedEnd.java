package com.thedeathlycow.vaulted.end;

import com.thedeathlycow.vaulted.end.registry.VaultEndItemGroup;
import com.thedeathlycow.vaulted.end.registry.VaultEndItems;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaultedEnd implements ModInitializer {
	public static final String MOD_ID = "vaulted-end";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		if (!PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			LOGGER.error("Unable to construct Polymer mod assets for {}", MOD_ID);
		}
		VaultEndItems.initialize();
		VaultEndItemGroup.initialize();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}