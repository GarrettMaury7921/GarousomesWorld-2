package com.garousome.garousomesworld2.common.material;

import java.util.function.Supplier;

import com.garousome.garousomesworld2.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum UltimateArmorMaterial implements IArmorMaterial {
	
	ULTIMATEARMOR("garousomesworld2" + ":ultimate", 35, new int[]{4, 7, 9, 4}, 50, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.2F, () -> { 
        return Ingredient.of(ItemInit.ultimatehelmet.get()); 
    }),
	ULTIMATEARMOR2("garousomesworld2" + ":ultimate", 35, new int[]{4, 7, 9, 4}, 50, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.2F, () -> { 
        return Ingredient.of(ItemInit.ultimatechestplate.get()); 
    }),
	ULTIMATEARMOR3("garousomesworld2" + ":ultimate", 35, new int[]{4, 7, 9, 4}, 50, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.2F, () -> { 
        return Ingredient.of(ItemInit.ultimateleggings.get()); 
    }),
	ULTIMATEARMOR4("garousomesworld2" + ":ultimate", 35, new int[]{4, 7, 9, 4}, 50, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.2F, () -> { 
        return Ingredient.of(ItemInit.ultimateboots.get()); 
    });
	
	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;
	
    UltimateArmorMaterial(String name, int durability, int[] protection, int enchantability, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
    	this.name = name;
        this.durabilityMultiplier = durability;
        this.slotProtections = protection;
        this.enchantmentValue = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }
    
	public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.slotProtections[slot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
	
}
