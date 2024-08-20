package com.thedeathlycow.vaulted.end.registry;

import com.thedeathlycow.vaulted.end.VaultedEnd;
import com.thedeathlycow.vaulted.end.item.TexturedPolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public final class VaultEndItems {

    public static final Item ELYTRA_KEY = new TexturedPolymerItem(
            new Item.Settings().rarity(Rarity.UNCOMMON),
            Items.TRIAL_KEY,
            VaultedEnd.id("item/elytra_key")
    );

    public static void initialize() {
        register("elytra_key", ELYTRA_KEY);
    }

    private static void register(String name, Item item) {
        Registry.register(Registries.ITEM, VaultedEnd.id(name), item);
    }

    private VaultEndItems() {

    }
}
