package com.thedeathlycow.vaulted.end.registry;

import com.thedeathlycow.vaulted.end.VaultedEnd;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public final class VEItems {

    public static final Item ELYTRA_KEY = register(
            "elytra_key",
            settings ->
                    new SimplePolymerItem(
                            settings
                                    .rarity(Rarity.UNCOMMON)
                                    .modelId(VaultedEnd.id("elytra_key")),
                            Items.TRIAL_KEY,
                            true
                    )
    );

    public static final Item OMINOUS_ELYTRA_KEY = register(
            "ominous_elytra_key",
            settings ->
                    new SimplePolymerItem(
                            settings
                                    .rarity(Rarity.UNCOMMON)
                                    .modelId(VaultedEnd.id("ominous_elytra_key")),
                            Items.OMINOUS_TRIAL_KEY,
                            true
                    )
    );

    public static void initialize() {
        VaultedEnd.LOGGER.debug("Initialized Vaulted End items");
    }

    private static Item register(String name, Function<Item.Settings, Item> itemProvider) {
        Identifier id = VaultedEnd.id(name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item item = itemProvider.apply(new Item.Settings().registryKey(key));

        return Registry.register(Registries.ITEM, key, item);
    }

    private VEItems() {

    }
}
