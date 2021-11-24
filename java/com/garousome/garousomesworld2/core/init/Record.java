package com.garousome.garousomesworld2.core.init;

import com.garousome.garousomesworld2.GarousomesWorld2;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class Record {
	
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GarousomesWorld2.MOD_ID);
	public static final RegistryObject<SoundEvent> sound1 = SOUNDS.register("item.sound1", () -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.sound1")));
	
	//CD1
	public static final Lazy<SoundEvent> cd_1Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_1")));
	public static final RegistryObject<SoundEvent> cd_1 = SOUNDS.register("item.cd_1.disc", cd_1Lazy);
	//CD2
	public static final Lazy<SoundEvent> cd_2Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_2")));
	public static final RegistryObject<SoundEvent> cd_2 = SOUNDS.register("item.cd_2.disc", cd_2Lazy);
	//CD3
	public static final Lazy<SoundEvent> cd_3Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_3")));
	public static final RegistryObject<SoundEvent> cd_3 = SOUNDS.register("item.cd_3.disc", cd_3Lazy);
	//CD4
	public static final Lazy<SoundEvent> cd_4Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_4")));
	public static final RegistryObject<SoundEvent> cd_4 = SOUNDS.register("item.cd_4.disc", cd_4Lazy);
	//CD5
	public static final Lazy<SoundEvent> cd_5Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_5")));
	public static final RegistryObject<SoundEvent> cd_5 = SOUNDS.register("item.cd_5.disc", cd_5Lazy);
	//CD6
	public static final Lazy<SoundEvent> cd_6Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_6")));
	public static final RegistryObject<SoundEvent> cd_6 = SOUNDS.register("item.cd_6.disc", cd_6Lazy);
	//CD7
	public static final Lazy<SoundEvent> cd_7Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_7")));
	public static final RegistryObject<SoundEvent> cd_7 = SOUNDS.register("item.cd_7.disc", cd_7Lazy);
	//CD8
	public static final Lazy<SoundEvent> cd_8Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_8")));
	public static final RegistryObject<SoundEvent> cd_8 = SOUNDS.register("item.cd_8.disc", cd_8Lazy);
	//CD9
	public static final Lazy<SoundEvent> cd_9Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_9")));
	public static final RegistryObject<SoundEvent> cd_9 = SOUNDS.register("item.cd_9.disc", cd_9Lazy);
	//CD10
	public static final Lazy<SoundEvent> cd_10Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_10")));
	public static final RegistryObject<SoundEvent> cd_10 = SOUNDS.register("item.cd_10.disc", cd_10Lazy);
	//CD11
	public static final Lazy<SoundEvent> cd_11Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_11")));
	public static final RegistryObject<SoundEvent> cd_11 = SOUNDS.register("item.cd_11.disc", cd_11Lazy);
	//CD12
	public static final Lazy<SoundEvent> cd_12Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_12")));
	public static final RegistryObject<SoundEvent> cd_12 = SOUNDS.register("item.cd_12.disc", cd_12Lazy);
	//CD13
	public static final Lazy<SoundEvent> cd_13Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_13")));
	public static final RegistryObject<SoundEvent> cd_13 = SOUNDS.register("item.cd_13.disc", cd_13Lazy);
	//CD14
	public static final Lazy<SoundEvent> cd_14Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_14")));
	public static final RegistryObject<SoundEvent> cd_14 = SOUNDS.register("item.cd_14.disc", cd_14Lazy);
	//CD15
	public static final Lazy<SoundEvent> cd_15Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_15")));
	public static final RegistryObject<SoundEvent> cd_15 = SOUNDS.register("item.cd_15.disc", cd_15Lazy);
	//CD16
	public static final Lazy<SoundEvent> cd_16Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_16")));
	public static final RegistryObject<SoundEvent> cd_16 = SOUNDS.register("item.cd_16.disc", cd_16Lazy);
	//CD17
	public static final Lazy<SoundEvent> cd_17Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_17")));
	public static final RegistryObject<SoundEvent> cd_17 = SOUNDS.register("item.cd_17.disc", cd_17Lazy);
	//CD18
	public static final Lazy<SoundEvent> cd_18Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_18")));
	public static final RegistryObject<SoundEvent> cd_18 = SOUNDS.register("item.cd_18.disc", cd_18Lazy);
	//CD19
	public static final Lazy<SoundEvent> cd_19Lazy = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(GarousomesWorld2.MOD_ID, "item.cd_19")));
	public static final RegistryObject<SoundEvent> cd_19 = SOUNDS.register("item.cd_19.disc", cd_19Lazy);
} //Record
