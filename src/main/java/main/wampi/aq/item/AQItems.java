package main.wampi.aq.item;

import main.wampi.aq.AquaticAdditions;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static main.wampi.aq.item.TurtleMasterCraftingUpgrade.createTurtleMasterTemplate;

public class AQItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AquaticAdditions.MODID);

    public static final RegistryObject<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_MASTER_CRAFTING_UPGRADE = ITEMS.register("turtle_master_crafting_upgrade",
                    () -> TurtleMasterCraftingUpgrade.createTurtleMasterTemplate("item." + AquaticAdditions.MODID + ".turtle_master_upgrade"));

    //Turtle master armor
    public static final RegistryObject<Item> TURTLE_MASTER_HELMET = ITEMS.register("turtle_master_helmet",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(407)));

    public static final RegistryObject<Item> TURTLE_MASTER_CHESTPLATE = ITEMS.register("turtle_master_chestplate",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(592)));

    public static final RegistryObject<Item> TURTLE_MASTER_LEGGINGS = ITEMS.register("turtle_master_leggings",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(555)));

    public static final RegistryObject<Item> TURTLE_MASTER_BOOTS = ITEMS.register("turtle_master_boots",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(481)));
//-----------------------
// Turtle armor

    public static final RegistryObject<Item> TURTLE_CHESTPLATE = ITEMS.register("turtle_chestplate",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(285)));

    public static final RegistryObject<Item> TURTLE_LEGGINGS = ITEMS.register("turtle_leggings",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(240)));

    public static final RegistryObject<Item> TURTLE_BOOTS = ITEMS.register("turtle_boots",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(210)));
//--------------------
    public static final RegistryObject<Item> GOLDEN_FISH = ITEMS.register("golden_fish",
            ()-> new Item(new Item.Properties().food(AQFoodProperties.GOLDEN_FISH)));

    public static final RegistryObject<Item> TURTLE_APPLE = ITEMS.register("turtle_apple",
            ()-> new Item(new Item.Properties().food(AQFoodProperties.TURTLE_APPLE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
