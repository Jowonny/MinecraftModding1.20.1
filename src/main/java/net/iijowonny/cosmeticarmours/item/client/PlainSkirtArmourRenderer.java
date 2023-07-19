package net.iijowonny.cosmeticarmours.item.client;

import net.iijowonny.cosmeticarmours.item.custom.PlainSkirtArmourItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PlainSkirtArmourRenderer extends GeoArmorRenderer<PlainSkirtArmourItem> {
    public PlainSkirtArmourRenderer() {
        super(new PlainSkirtArmourModel());
    }
}
