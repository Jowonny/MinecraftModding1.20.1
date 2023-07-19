package net.iijowonny.cosmeticarmours.item;

import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;

public class DyeableHelper {

    public boolean hasCustomColor(ItemStack stack) {
        CompoundTag compoundtag = stack.getTagElement("display");
        return compoundtag != null && compoundtag.contains("color", 99);
    }

    public int getColor(ItemStack stack) {
        CompoundTag compoundtag = stack.getTagElement("display");
        return compoundtag != null && compoundtag.contains("color", 99) ? compoundtag.getInt("color") : 10511680;
    }

    public void clearColor(ItemStack stack) {
        CompoundTag compoundtag = stack.getTagElement("display");
        if (compoundtag != null && compoundtag.contains("color")) {
            compoundtag.remove("color");
        }
    }

    public void setColor(ItemStack stack, int color) {
        stack.getOrCreateTagElement("display").putInt("color", color);
    }
}
