package com.thedeathlycow.vaulted.end.item;

import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

public class TexturedPolymerItem extends SimplePolymerItem {

    private final int customModelData;

    public TexturedPolymerItem(Settings settings, Item polymerItem, int customModelData) {
        super(settings, polymerItem);
        this.customModelData = customModelData;
    }

    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return this.customModelData;
    }
}
