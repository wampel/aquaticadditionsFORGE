package main.wampi.aq.block;

import main.wampi.aq.AquaticAdditions;
import main.wampi.aq.item.AQItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class AQBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AquaticAdditions.MODID);


    //Hier blöcke registrieren
    public static final RegistryObject<Block> SCUTE_BLOCK = registerBlock("scute_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).sound(SoundType.BAMBOO)
                    ));

    public static final RegistryObject<Block> TURTLE_BLOCK = registerBlock("turtle_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f).requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)
                    ));
    //---------------------------


    //Helpermethods
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        AQItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    //Registrieren
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
