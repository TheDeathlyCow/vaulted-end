package com.thedeathlycow.vaulted.end.item;

import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.fabric.api.networking.v1.context.PacketContext;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.Nullable;

public class ElytraKeyItem extends SimplePolymerItem {

    private final Component fallbackName;

    public ElytraKeyItem(Properties settings, Item polymerItem, String fallbackName) {
        super(settings, polymerItem, true);
        this.fallbackName = Component.translatableWithFallback(this.descriptionId, fallbackName);
    }

    @Override
    public ItemStack getPolymerItemStack(ItemStack itemStack, TooltipFlag tooltipType, PacketContext context, HolderLookup.Provider lookup) {
        ItemStack out = super.getPolymerItemStack(itemStack, tooltipType, context, lookup);
        if (!PolymerResourcePackUtils.hasMainPack(context)) {
            out.set(DataComponents.ITEM_NAME, fallbackName);
        }
        return out;
    }

    @Override
    public @Nullable Identifier getPolymerItemModel(ItemStack stack, PacketContext context, HolderLookup.Provider lookup) {
        return PolymerResourcePackUtils.hasMainPack(context) ? super.getPolymerItemModel(stack, context, lookup) : null;
    }
}