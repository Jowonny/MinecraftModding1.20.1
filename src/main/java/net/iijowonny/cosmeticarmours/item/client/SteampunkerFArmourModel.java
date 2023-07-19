package net.iijowonny.cosmeticarmours.item.client;

import net.iijowonny.cosmeticarmours.item.custom.SteampunkerFArmourItem;
import net.iijowonny.cosmeticarmours.CosmeticArmours;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SteampunkerFArmourModel extends GeoModel<SteampunkerFArmourItem> {
    @Override
    public ResourceLocation getModelResource(SteampunkerFArmourItem animatable) {
        return new ResourceLocation(CosmeticArmours.MOD_ID, "geo/steampunkerf_armour.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SteampunkerFArmourItem animatable) {
        return new ResourceLocation(CosmeticArmours.MOD_ID, "textures/armour/steampunkerf_armour.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SteampunkerFArmourItem animatable) {
        return new ResourceLocation(CosmeticArmours.MOD_ID, "animations/steampunkerf_armour.animation.json");
    }
}
