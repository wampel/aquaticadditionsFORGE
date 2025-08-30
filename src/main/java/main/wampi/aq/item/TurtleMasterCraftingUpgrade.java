package main.wampi.aq.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class TurtleMasterCraftingUpgrade {
    private static final List<ResourceLocation> TURTLE_BASE_ICONS = List.of(
            ResourceLocation.parse("item/empty_slot_helmet"),
            ResourceLocation.parse("item/empty_slot_chestplate"),
            ResourceLocation.parse("item/empty_slot_leggings"),
            ResourceLocation.parse("item/empty_slot_boots")
    );

    private static final List<ResourceLocation> TURTLE_ADDITION_ICONS =
            List.of(ResourceLocation.parse("item/empty_slot_ingot"));

    public static SmithingTemplateItem createTurtleMasterTemplate(String keyBase) {
        return new SmithingTemplateItem(
                Component.translatable(keyBase + ".applies_to"),
                Component.translatable(keyBase + ".ingredients"),
                Component.translatable(keyBase + ".title"),
                Component.translatable(keyBase + ".base_slot_description"),
                Component.translatable(keyBase + ".additions_slot_description"),
                TURTLE_BASE_ICONS,
                TURTLE_ADDITION_ICONS
        );
    }
}
