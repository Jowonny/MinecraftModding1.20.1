package net.iijowonny.cosmeticarmours.item.client;

import net.iijowonny.cosmeticarmours.item.custom.PlainSkirtArmourItem;
import net.iijowonny.cosmeticarmours.CosmeticArmours;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PlainSkirtArmourModel extends GeoModel<PlainSkirtArmourItem> {
    @Override
    public ResourceLocation getModelResource(PlainSkirtArmourItem animatable) {
        return new ResourceLocation(CosmeticArmours.MOD_ID, "geo/plainskirt_armour.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PlainSkirtArmourItem animatable) {
        return new ResourceLocation(CosmeticArmours.MOD_ID, "textures/armour/plainskirt_armour.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PlainSkirtArmourItem animatable) {
        return new ResourceLocation(CosmeticArmours.MOD_ID, "animations/plainskirt_armour.animation.json");
    }
}
