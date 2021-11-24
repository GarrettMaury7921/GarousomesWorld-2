package com.garousome.garousomesworld2.core.init;

import com.garousome.garousomesworld2.GarousomesWorld2;
import com.garousome.garousomesworld2.common.items.MusicDiscs;
import com.garousome.garousomesworld2.common.material.UltimateArmorMaterial;
import com.garousome.garousomesworld2.common.material.UltimateToolMaterial;
import com.garousome.garousomesworld2.core.init.itemgroup.garousomesworld2ItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GarousomesWorld2.MOD_ID);
	
	//TODO: essence of jack, essence of martin, essence of aidan, essence of chann, essence of Pierson
	//chann: green
	//jack: yellow
	//aidan: deep blue
	//pierson: blue
	//TODO: At the end, look at all the pics and make sure every item is in
	
	//Tools
	public static final RegistryObject<Item> ultimatepickaxe = ITEMS.register("ultimatepickaxe", 
			() -> new PickaxeItem(UltimateToolMaterial.ULTIMATE_TOOL, 4, -3.0f, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ultimatesword = ITEMS.register("ultimatesword", 
			() -> new SwordItem(UltimateToolMaterial.ULTIMATE_TOOL2, 7, -2.1f, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ultimateaxe = ITEMS.register("ultimateaxe", 
			() -> new AxeItem(UltimateToolMaterial.ULTIMATE_TOOL3, 9, -3.4f, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ultimateshovel = ITEMS.register("ultimateshovel", 
			() -> new ShovelItem(UltimateToolMaterial.ULTIMATE_TOOL4, 2, -3.0f, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ultimatehoe = ITEMS.register("ultimatehoe", 
			() -> new HoeItem(UltimateToolMaterial.ULTIMATE_TOOL5, 4, -3.0f, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	
	//Armor
	public static final RegistryObject<Item> ultimatehelmet = ITEMS.register("ultimatehelmet",
            () -> new ArmorItem(UltimateArmorMaterial.ULTIMATEARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ultimatechestplate = ITEMS.register("ultimatechestplate",
            () -> new ArmorItem(UltimateArmorMaterial.ULTIMATEARMOR2, EquipmentSlotType.CHEST, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ultimateleggings = ITEMS.register("ultimateleggings",
            () -> new ArmorItem(UltimateArmorMaterial.ULTIMATEARMOR3, EquipmentSlotType.LEGS, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ultimateboots = ITEMS.register("ultimateboots",
            () -> new ArmorItem(UltimateArmorMaterial.ULTIMATEARMOR4, EquipmentSlotType.FEET, new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	
	//Items
	public static final RegistryObject<Item> ethanscrap = ITEMS.register("ethan_scrap", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> ethaningot = ITEMS.register("ethaningot", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> dannyingot = ITEMS.register("dannyingot", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> garrettingot = ITEMS.register("garrettingot", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> matthewingot = ITEMS.register("matthewingot", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> minenfooldrop = ITEMS.register("minenfooldrop", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	
	// Block Items
	public static final RegistryObject<BlockItem> essence_of_ethan = ITEMS.register("essence_of_ethan", 
			() -> new BlockItem(BlockInIt.essence_of_ethan.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> dc_block = ITEMS.register("dc_block", 
			() -> new BlockItem(BlockInIt.dc_block.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> isbetterthanblock = ITEMS.register("isbetterthanblock", 
			() -> new BlockItem(BlockInIt.isbetterthanblock.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> marvel_block = ITEMS.register("marvel_block", 
			() -> new BlockItem(BlockInIt.marvel_block.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> ultimateblock = ITEMS.register("ultimateblock", 
			() -> new BlockItem(BlockInIt.ultimateblock.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> minenfool_block = ITEMS.register("minenfool_block", 
			() -> new BlockItem(BlockInIt.minenfool_block.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> garrett_block = ITEMS.register("garrett_block", 
			() -> new BlockItem(BlockInIt.garrett_block.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> emu_block = ITEMS.register("emu_block", 
			() -> new BlockItem(BlockInIt.emu_block.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> matthew_block = ITEMS.register("matthew_block", 
			() -> new BlockItem(BlockInIt.matthew_block.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> essence_of_danny = ITEMS.register("essence_of_danny", 
			() -> new BlockItem(BlockInIt.essence_of_danny.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> essence_of_garrett = ITEMS.register("essence_of_garrett", 
			() -> new BlockItem(BlockInIt.essence_of_garrett.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> essence_of_matthew = ITEMS.register("essence_of_matthew", 
			() -> new BlockItem(BlockInIt.essence_of_matthew.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<BlockItem> essence_of_minenfool = ITEMS.register("essence_of_minenfool", 
			() -> new BlockItem(BlockInIt.essence_of_minenfool.get(), new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	
	//Food
	public static final RegistryObject<Item> chocolatemilk = ITEMS.register("chocolatemilk", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2).food(new Food.Builder().nutrition(6).saturationMod(0.3f).alwaysEat().build())));
	public static final RegistryObject<Item> superchocolatemilk = ITEMS.register("superchocolatemilk", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2).food(new Food.Builder().nutrition(10).saturationMod(0.7f).alwaysEat().build())));
	public static final RegistryObject<Item> ultimatechocolatemilk = ITEMS.register("ultimatechocolatemilk", 
			() -> new Item(new Item.Properties().tab(garousomesworld2ItemGroup.GarousomesWorld2).food(new Food.Builder().nutrition(16).saturationMod(1.0f).alwaysEat().build())));
	
	//Music Discs
	public static final RegistryObject<Item> cd_1 = ITEMS.register("cd_1", 
			() -> new MusicDiscs(1, Record.cd_1Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_2 = ITEMS.register("cd_2", 
			() -> new MusicDiscs(1, Record.cd_2Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_3 = ITEMS.register("cd_3", 
			() -> new MusicDiscs(1, Record.cd_3Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_4 = ITEMS.register("cd_4", 
			() -> new MusicDiscs(1, Record.cd_4Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_5 = ITEMS.register("cd_5", 
			() -> new MusicDiscs(1, Record.cd_5Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_6 = ITEMS.register("cd_6", 
			() -> new MusicDiscs(1, Record.cd_6Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_7 = ITEMS.register("cd_7", 
			() -> new MusicDiscs(1, Record.cd_7Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_8 = ITEMS.register("cd_8", 
			() -> new MusicDiscs(1, Record.cd_8Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_9 = ITEMS.register("cd_9", 
			() -> new MusicDiscs(1, Record.cd_9Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_10 = ITEMS.register("cd_10", 
			() -> new MusicDiscs(1, Record.cd_10Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_11 = ITEMS.register("cd_11", 
			() -> new MusicDiscs(1, Record.cd_11Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_12 = ITEMS.register("cd_12", 
			() -> new MusicDiscs(1, Record.cd_12Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_13 = ITEMS.register("cd_13", 
			() -> new MusicDiscs(1, Record.cd_13Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_14 = ITEMS.register("cd_14", 
			() -> new MusicDiscs(1, Record.cd_14Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_15 = ITEMS.register("cd_15", 
			() -> new MusicDiscs(1, Record.cd_15Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_16 = ITEMS.register("cd_16", 
			() -> new MusicDiscs(1, Record.cd_16Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_17 = ITEMS.register("cd_17", 
			() -> new MusicDiscs(1, Record.cd_17Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_18 = ITEMS.register("cd_18", 
			() -> new MusicDiscs(1, Record.cd_18Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	public static final RegistryObject<Item> cd_19 = ITEMS.register("cd_19", 
			() -> new MusicDiscs(1, Record.cd_19Lazy.get(), new Item.Properties().stacksTo(1).tab(garousomesworld2ItemGroup.GarousomesWorld2)));
	
} //ItemInit
