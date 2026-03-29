package com.thedeathlycow.vaulted.end.registry;

import com.thedeathlycow.vaulted.end.VaultedEnd;
import eu.pb4.polymer.core.api.item.PolymerCreativeModeTabUtils;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public final class VEItemGroup {

    public static final CreativeModeTab VAULTED_END = register(
            "vaulted_end",
            PolymerCreativeModeTabUtils.builder()
                    .icon(() -> new ItemStack(VEItems.OMINOUS_ELYTRA_KEY))
                    .title(Component.translatable("itemGroup.vaulted.end"))
                    .displayItems((context, entries) -> {
                        entries.accept(new ItemStack(VEItems.ELYTRA_KEY));
                        entries.accept(new ItemStack(VEItems.OMINOUS_ELYTRA_KEY));
                    })
                    .build()
    );

    public static void initialize() {
        VaultedEnd.LOGGER.debug("Initialized Vaulted End item groups");
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register(entries -> {
                    entries.accept(new ItemStack(VEItems.ELYTRA_KEY));
                    entries.accept(new ItemStack(VEItems.OMINOUS_ELYTRA_KEY));
                });
    }

    private static CreativeModeTab register(String name, CreativeModeTab item) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, VaultedEnd.id(name), item);
    }

    private VEItemGroup() {

    }
}
