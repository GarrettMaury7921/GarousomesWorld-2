package com.garousome.garousomesworld2.core.init;

import com.garousome.garousomesworld2.GarousomesWorld2;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInIt {
	
	//strength = hardness and resistance as of 1.16.
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GarousomesWorld2.MOD_ID);
	
	//DC Block
	public static final RegistryObject<Block> dc_block = BLOCKS.register("dc_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_WHITE)
					.strength(4f, 15f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()));
	//Isbetterthanblock
	public static final RegistryObject<Block> isbetterthanblock = BLOCKS.register("isbetterthanblock", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_WHITE)
					.strength(6f, 20f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()));
	//Marvel Block
	public static final RegistryObject<Block> marvel_block = BLOCKS.register("marvel_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_RED)
					.strength(8f, 30f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(3)
					.sound(SoundType.ANVIL)
					.requiresCorrectToolForDrops()));
	
	//Ultimate Block
	public static final RegistryObject<Block> ultimateblock = BLOCKS.register("ultimateblock", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_ORANGE)
					.strength(10f, 45f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.ANCIENT_DEBRIS)
					.requiresCorrectToolForDrops()));
	//MineNFool Block
	public static final RegistryObject<Block> minenfool_block = BLOCKS.register("minenfool_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_BLUE)
					.strength(4f, 10f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()));
	//Garrett Block
	public static final RegistryObject<Block> garrett_block = BLOCKS.register("garrett_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_RED)
					.strength(8f, 40f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(5)
					.sound(SoundType.GILDED_BLACKSTONE)
					.requiresCorrectToolForDrops()));
	//Emu Block
	public static final RegistryObject<Block> emu_block = BLOCKS.register("emu_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_GREEN)
					.strength(0.2f, 2f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()));
	//Matthew Block
	public static final RegistryObject<Block> matthew_block = BLOCKS.register("matthew_block", 
			() -> new Block(AbstractBlock.Properties.copy(Blocks.COAL_ORE)
					.strength(3f, 5f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(3)
					.sound(SoundType.BASALT)
					.requiresCorrectToolForDrops()));

	//Essences
	public static final RegistryObject<Block> essence_of_ethan = BLOCKS.register("essence_of_ethan", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_BLUE)
					.strength(1f, 8f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(0)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> essence_of_danny = BLOCKS.register("essence_of_danny", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_GRAY)
					.strength(0.2f, 2f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> essence_of_garrett = BLOCKS.register("essence_of_garrett", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_RED)
					.strength(40f, 20f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(5)
					.sound(SoundType.ANCIENT_DEBRIS)
					.requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> essence_of_matthew = BLOCKS.register("essence_of_matthew", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_PURPLE)
					.strength(15f, 20f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(4)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> essence_of_minenfool = BLOCKS.register("essence_of_minenfool", 
			() -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_PURPLE)
					.strength(4f, 25f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()));
	
}//BlockInIt
