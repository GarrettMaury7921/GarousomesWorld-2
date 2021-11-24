package com.garousome.garousomesworld2.common.material;

import java.util.function.Supplier;

import com.garousome.garousomesworld2.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;


public enum UltimateToolMaterial implements IItemTier {
	
	//(5, 3000, 18f, 2f, 17, );
	
	//pickaxe
	ULTIMATE_TOOL(5, 3500, 18.0F, 2.0F, 25, () -> {
        return Ingredient.of(ItemInit.ultimatepickaxe.get());
    }),
	//sword
	ULTIMATE_TOOL2(1, 3800, 5.0F, 1.0F, 25, () -> {
        return Ingredient.of(ItemInit.ultimatesword.get());
    }),
	//axe
	ULTIMATE_TOOL3(1, 3800, 18.0F, 3.0F, 25, () -> {
        return Ingredient.of(ItemInit.ultimateaxe.get());
    }),
	//shovel
	ULTIMATE_TOOL4(5, 3500, 18.0F, 4.0F, 25, () -> {
        return Ingredient.of(ItemInit.ultimateshovel.get());
    }),
	//hoe
	ULTIMATE_TOOL5(1, 4000, 18.0F, 1.0F, 25, () -> {
        return Ingredient.of(ItemInit.ultimatehoe.get());
    });
	
	
	
	
	private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

	UltimateToolMaterial(int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
