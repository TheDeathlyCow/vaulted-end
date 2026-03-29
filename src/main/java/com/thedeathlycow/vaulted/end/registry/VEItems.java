package com.thedeathlycow.vaulted.end.registry;

import com.thedeathlycow.vaulted.end.VaultedEnd;
import com.thedeathlycow.vaulted.end.item.ElytraKeyItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;

public final class VEItems {

    public static final Item ELYTRA_KEY = register(
            "elytra_key",
            settings ->
                    new ElytraKeyItem(
                            settings.rarity(Rarity.UNCOMMON),
                            Items.TRIAL_KEY,
                            "Elytra Key"
                    )
    );

    public static final Item OMINOUS_ELYTRA_KEY = register(
            "ominous_elytra_key",
            settings ->
                    new ElytraKeyItem(
                            settings.rarity(Rarity.UNCOMMON),
                            Items.OMINOUS_TRIAL_KEY,
                            "Ominous Elytra Key"
                    )
    );

    public static void initialize() {
        VaultedEnd.LOGGER.debug("Initialized Vaulted End items");
    }

    private static Item register(String name, Function<Item.Properties, Item> itemProvider) {
        Identifier id = VaultedEnd.id(name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Item item = itemProvider.apply(new Item.Properties().setId(key));

        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    private VEItems() {

    }
}
