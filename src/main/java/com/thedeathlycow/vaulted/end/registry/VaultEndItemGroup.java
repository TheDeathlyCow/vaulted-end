package com.thedeathlycow.vaulted.end.registry;

import com.thedeathlycow.vaulted.end.VaultedEnd;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class VaultEndItemGroup {

    public static final ItemGroup VAULTED_END = PolymerItemGroupUtils.builder()
            .icon(() -> new ItemStack(VaultEndItems.OMINOUS_ELYTRA_KEY))
            .displayName(Text.translatable("itemGroup.vaulted.end"))
            .entries((context, entries) -> {
                entries.add(new ItemStack(VaultEndItems.ELYTRA_KEY));
                entries.add(new ItemStack(VaultEndItems.OMINOUS_ELYTRA_KEY));
            })
            .build();

    public static void initialize() {
        register("vaulted_end", VAULTED_END);
    }

    private static void register(String name, ItemGroup item) {
        Registry.register(Registries.ITEM_GROUP, VaultedEnd.id(name), item);
    }

    private VaultEndItemGroup() {

    }
}
