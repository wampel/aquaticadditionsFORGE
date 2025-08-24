package main.wampi.aq.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class AQFoodProperties {
    public static final FoodProperties GOLDEN_FISH = new FoodProperties.Builder().nutrition(6).saturationMod(1.2F)
            .build();
    public static final FoodProperties TURTLE_APPLE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 60*30, 1), 1)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 60*30, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 60*30, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER, 60*30, 0), 1)
            .build();
}
