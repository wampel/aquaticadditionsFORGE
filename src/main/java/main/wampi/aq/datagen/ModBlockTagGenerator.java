package main.wampi.aq.datagen;

import main.wampi.aq.AquaticAdditions;
import main.wampi.aq.block.AQBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AquaticAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(AQBlocks.SCUTE_BLOCK.get(),
                        AQBlocks.TURTLE_BLOCK.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(AQBlocks.TURTLE_BLOCK.get());
/*
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add();

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add();

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add();

*/
    }
}
