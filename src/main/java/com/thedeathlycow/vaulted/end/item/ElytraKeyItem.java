package com.thedeathlycow.vaulted.end.item;

import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import xyz.nucleoid.packettweaker.PacketContext;

public class ElytraKeyItem extends SimplePolymerItem {

    private final Text fallbackName;

    public ElytraKeyItem(Settings settings, Item polymerItem, String fallbackName) {
        super(settings, polymerItem, true);
        this.fallbackName = Text.translatableWithFallback(this.translationKey, fallbackName);
    }

    @Override
    public ItemStack getPolymerItemStack(ItemStack itemStack, TooltipType tooltipType, PacketContext context) {
        ItemStack out = super.getPolymerItemStack(itemStack, tooltipType, context);
        if (!PolymerResourcePackUtils.hasMainPack(context)) {
            out.set(DataComponentTypes.ITEM_NAME, fallbackName);
        }
        return out;
    }

    @Override
    public @Nullable Identifier getPolymerItemModel(ItemStack stack, PacketContext context) {
        return PolymerResourcePackUtils.hasMainPack(context) ? super.getPolymerItemModel(stack, context) : null;
    }
}