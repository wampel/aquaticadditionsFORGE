package main.wampi.aq.item;

import main.wampi.aq.AquaticAdditions;
import main.wampi.aq.block.AQBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AQCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AquaticAdditions.MODID);

    public static final Supplier<CreativeModeTab> AQ_ITEMS_TAB = CREATIVE_MODE_TABS.register("aq_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AQItems.TURTLE_MASTER_CHESTPLATE.get()))
                    .title(Component.translatable("creativetab.aq.aq_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(AQItems.TURTLE_INGOT.get());
                        output.accept(AQBlocks.TURTLE_BLOCK.get());
                        output.accept(AQBlocks.SCUTE_BLOCK.get());
                        output.accept(AQItems.TURTLE_MASTER_HELMET.get());
                        output.accept(AQItems.TURTLE_MASTER_CHESTPLATE.get());
                        output.accept(AQItems.TURTLE_MASTER_LEGGINGS.get());
                        output.accept(AQItems.TURTLE_MASTER_BOOTS.get());
                        output.accept(AQItems.TURTLE_CHESTPLATE.get());
                        output.accept(AQItems.TURTLE_LEGGINGS.get());
                        output.accept(AQItems.TURTLE_BOOTS.get());
                        output.accept(AQItems.GOLDEN_FISH.get());
                        output.accept(AQItems.TURTLE_APPLE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
