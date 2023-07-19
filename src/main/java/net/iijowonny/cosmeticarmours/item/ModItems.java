package net.iijowonny.cosmeticarmours.item;

import net.iijowonny.cosmeticarmours.item.custom.PlainSkirtArmourItem;
import net.iijowonny.cosmeticarmours.item.custom.SteampunkerFArmourItem;
import net.iijowonny.cosmeticarmours.CosmeticArmours;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.DyeableArmorItem;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CosmeticArmours.MOD_ID);

    // DUPLICATE FOR MORE ITEMS
    public static final RegistryObject<Item> testitem = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));

    // SteampunkerF
    public static final RegistryObject<Item> STEAMPUNKERF_HELMET = ITEMS.register("steampunkerf_helmet",
            () -> new SteampunkerFArmourItem(ModArmorMaterials.STEAMPUNKERF, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEAMPUNKERF_CHESTPLATE = ITEMS.register("steampunkerf_chestplate",
            () -> new SteampunkerFArmourItem(ModArmorMaterials.STEAMPUNKERF, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEAMPUNKERF_LEGGINGS = ITEMS.register("steampunkerf_leggings",
            () -> new SteampunkerFArmourItem(ModArmorMaterials.STEAMPUNKERF, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEAMPUNKERF_BOOTS = ITEMS.register("steampunkerf_boots",
            () -> new SteampunkerFArmourItem(ModArmorMaterials.STEAMPUNKERF, ArmorItem.Type.BOOTS, new Item.Properties()));

    // PlainSkirt
    public static final RegistryObject<Item> PLAINSKIRT_CHESTPLATE = ITEMS.register("plainskirt_chestplate",
            () -> new PlainSkirtArmourItem(ModArmorMaterials.PLAINSKIRT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLAINSKIRT_LEGGINGS = ITEMS.register("plainskirt_leggings",
            () -> new PlainSkirtArmourItem(ModArmorMaterials.PLAINSKIRT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLAINSKIRT_BOOTS = ITEMS.register("plainskirt_boots",
            () -> new PlainSkirtArmourItem(ModArmorMaterials.PLAINSKIRT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> KAKA_BOOTS = ITEMS.register("kaka_boots",
            () -> new DyeableArmorItem(ModArmorMaterials.PLAINSKIRT, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
