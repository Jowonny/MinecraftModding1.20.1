package net.iijowonny.cosmeticarmours.item;

import net.iijowonny.cosmeticarmours.CosmeticArmours;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CosmeticArmours.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COSMETICARMOURS_TAB = CREATIVE_MODE_TABS.register("cosmeticarmours_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.testitem.get()))
                    .title(Component.translatable("creativetab.cosmeticarmours_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        // Add to Creative Tab Here
                        pOutput.accept(ModItems.testitem.get());
                        
                        pOutput.accept(ModItems.STEAMPUNKERF_HELMET.get());
                        pOutput.accept(ModItems.STEAMPUNKERF_CHESTPLATE.get());
                        pOutput.accept(ModItems.STEAMPUNKERF_LEGGINGS.get());
                        pOutput.accept(ModItems.STEAMPUNKERF_BOOTS.get());

                        pOutput.accept(ModItems.PLAINSKIRT_CHESTPLATE.get());
                        pOutput.accept(ModItems.PLAINSKIRT_LEGGINGS.get());
                        pOutput.accept(ModItems.PLAINSKIRT_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
