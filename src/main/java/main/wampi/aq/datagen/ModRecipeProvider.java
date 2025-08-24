package main.wampi.aq.datagen;

import main.wampi.aq.AquaticAdditions;
import main.wampi.aq.block.AQBlocks;
import main.wampi.aq.item.AQItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQBlocks.TURTLE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', AQItems.TURTLE_INGOT.get())
                .unlockedBy("has_turtle_ingot", has(AQItems.TURTLE_INGOT.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQBlocks.SCUTE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.SCUTE)
                .unlockedBy("has_scute", has(Items.SCUTE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_CHESTPLATE.get())
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.SCUTE)
                .unlockedBy("has_scute", has(Items.SCUTE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_LEGGINGS.get())
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .define('B', Items.SCUTE)
                .unlockedBy("has_scute", has(Items.SCUTE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_BOOTS.get())
                .pattern("   ")
                .pattern("B B")
                .pattern("B B")
                .define('B', Items.SCUTE)
                .unlockedBy("has_scute", has(Items.SCUTE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_HELMET.get())
                .pattern("III")
                .pattern("IHI")
                .pattern("   ")
                .define('I', AQItems.TURTLE_INGOT.get())
                .define('H', Items.TURTLE_HELMET)
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_CHESTPLATE.get())
                .pattern("IPI")
                .pattern("ICI")
                .pattern("III")
                .define('I', AQItems.TURTLE_INGOT.get())
                .define('C', Items.CONDUIT)
                .define('P', AQItems.TURTLE_CHESTPLATE.get())
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_LEGGINGS.get())
                .pattern("III")
                .pattern("IHI")
                .pattern("I I")
                .define('I', AQItems.TURTLE_INGOT.get())
                .define('H', AQItems.TURTLE_LEGGINGS.get())
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_MASTER_BOOTS.get())
                .pattern("   ")
                .pattern("I I")
                .pattern("IHI")
                .define('I', AQItems.TURTLE_INGOT.get())
                .define('H', AQItems.TURTLE_BOOTS.get())
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.GOLDEN_FISH.get())
                .pattern("GGG")
                .pattern("GCG")
                .pattern("GGG")
                .define('G', Items.GOLD_NUGGET)
                .define('C', Items.COD)
                .unlockedBy("has_carrot", has(Items.CARROT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AQItems.TURTLE_APPLE.get())
                .pattern(" I ")
                .pattern("IAI")
                .pattern(" I ")
                .define('A', Items.APPLE)
                .define('I', AQItems.TURTLE_INGOT.get())
                .unlockedBy("has_turtle_ingot", has(AQItems.TURTLE_INGOT.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AQItems.TURTLE_INGOT.get(), 9)
                .requires(AQBlocks.TURTLE_BLOCK.get())
                .unlockedBy("has_turtle_ingot", has(AQItems.TURTLE_INGOT.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SCUTE, 9)
                .requires(AQBlocks.SCUTE_BLOCK.get())
                .unlockedBy("has_scute", has(Items.SCUTE)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, AQItems.TURTLE_INGOT.get(), 1)
                .requires(Items.PRISMARINE_SHARD)
                .requires(Items.PRISMARINE_CRYSTALS)
                .requires(Items.GOLD_INGOT)
                .requires(Items.DIAMOND)
                .unlockedBy("has_turtle_chestplate", has(AQItems.TURTLE_CHESTPLATE.get())).save(recipeOutput, "aq:turtle_ingot_2");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  AquaticAdditions.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}