package com.thedeathlycow.vaulted.end.registry;

import com.thedeathlycow.vaulted.end.VaultedEnd;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public final class VEItemGroup {

    public static final ItemGroup VAULTED_END = register(
            "vaulted_end",
            PolymerItemGroupUtils.builder()
                    .icon(() -> new ItemStack(VEItems.OMINOUS_ELYTRA_KEY))
                    .displayName(Text.translatable("itemGroup.vaulted.end"))
                    .entries((context, entries) -> {
                        entries.add(new ItemStack(VEItems.ELYTRA_KEY));
                        entries.add(new ItemStack(VEItems.OMINOUS_ELYTRA_KEY));
                    })
                    .build()
    );

    public static void initialize() {
        VaultedEnd.LOGGER.debug("Initialized Vaulted End item groups");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> {
                    entries.add(new ItemStack(VEItems.ELYTRA_KEY));
                    entries.add(new ItemStack(VEItems.OMINOUS_ELYTRA_KEY));
                });
    }

    private static ItemGroup register(String name, ItemGroup item) {
        return Registry.register(Registries.ITEM_GROUP, VaultedEnd.id(name), item);
    }

    private VEItemGroup() {

    }
}
