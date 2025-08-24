package main.wampi.aq.item;

import main.wampi.aq.AquaticAdditions;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AQItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AquaticAdditions.MODID);

    public static final RegistryObject<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot",
            () -> new Item(new Item.Properties()));

    //Turtle master armor
    public static final RegistryObject<Item> TURTLE_MASTER_HELMET = ITEMS.register("turtle_master_helmet",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .durability(20)));

    public static final RegistryObject<Item> TURTLE_MASTER_CHESTPLATE = ITEMS.register("turtle_master_chestplate",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(20)));

    public static final RegistryObject<Item> TURTLE_MASTER_LEGGINGS = ITEMS.register("turtle_master_leggings",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(20)));

    public static final RegistryObject<Item> TURTLE_MASTER_BOOTS = ITEMS.register("turtle_master_boots",
            () -> new TurtleMasterArmorItem(AQArmorMaterials.TURTLE_MASTER_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(20)));
//-----------------------
// Turtle armor

    public static final RegistryObject<Item> TURTLE_CHESTPLATE = ITEMS.register("turtle_chestplate",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .durability(20)));

    public static final RegistryObject<Item> TURTLE_LEGGINGS = ITEMS.register("turtle_leggings",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .durability(20)));

    public static final RegistryObject<Item> TURTLE_BOOTS = ITEMS.register("turtle_boots",
            () -> new TurtleArmorItem(AQArmorMaterials.TURTLE_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .durability(20)));
//--------------------
    public static final RegistryObject<Item> GOLDEN_FISH = ITEMS.register("golden_fish",
            ()-> new Item(new Item.Properties().food(AQFoodProperties.GOLDEN_FISH)));

    public static final RegistryObject<Item> TURTLE_APPLE = ITEMS.register("turtle_apple",
            ()-> new Item(new Item.Properties().food(AQFoodProperties.TURTLE_APPLE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
