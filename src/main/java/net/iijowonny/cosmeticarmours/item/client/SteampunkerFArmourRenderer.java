package net.iijowonny.cosmeticarmours.item.client;

import net.iijowonny.cosmeticarmours.item.custom.SteampunkerFArmourItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SteampunkerFArmourRenderer extends GeoArmorRenderer<SteampunkerFArmourItem> {
    public SteampunkerFArmourRenderer() {
        super(new SteampunkerFArmourModel());
    }
}
