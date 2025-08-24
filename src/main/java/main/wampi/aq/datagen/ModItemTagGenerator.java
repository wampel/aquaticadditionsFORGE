package main.wampi.aq.datagen;

import main.wampi.aq.AquaticAdditions;
import main.wampi.aq.item.AQItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, AquaticAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(AQItems.TURTLE_MASTER_HELMET.get(),
                        AQItems.TURTLE_MASTER_CHESTPLATE.get(),
                        AQItems.TURTLE_LEGGINGS.get(),
                        AQItems.TURTLE_MASTER_BOOTS.get(),
                        AQItems.TURTLE_CHESTPLATE.get(),
                        AQItems.TURTLE_LEGGINGS.get(),
                        AQItems.TURTLE_BOOTS.get());
    }
}