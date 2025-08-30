package main.wampi.aq.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class AQLanguageProvider extends LanguageProvider {
    public AQLanguageProvider(PackOutput output, String modid) {
        super(output, modid, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("item.aq.turtle_master_upgrade.title", "Turtle Master Upgrade");
        add("item.aq.turtle_master_upgrade.applies_to", "Applies to Turtle Armor");
        add("item.aq.turtle_master_upgrade.ingredients", "Requires Turtle Ingot");
        add("item.aq.turtle_master_upgrade.base_slot_description", "Place a piece of Turtle Armor here");
        add("item.aq.turtle_master_upgrade.additions_slot_description", "Place a Turtle Ingot here");

        add("item.aq.turtle_ingot", "Turtle Ingot");

        add("item.aq.turtle_master_helmet", "Turtle Master Helmet");
        add("item.aq.turtle_master_chestplate", "Turtle Master Chestplate");
        add("item.aq.turtle_master_leggings", "Turtle Master Leggings");
        add("item.aq.turtle_master_boots", "Turtle Master Boots");

        add("item.aq.golden_fish", "Golden Fish");
        add("item.aq.turtle_apple", "Turtle Apple");

        add("item.aq.turtle_chestplate", "Turtle Chestplate");
        add("item.aq.turtle_leggings", "Turtle Leggings");
        add("item.aq.turtle_boots", "Turtle Boots");

        add("creativetab.aq.aq_items", "Aquatic Additions");
    }
}
