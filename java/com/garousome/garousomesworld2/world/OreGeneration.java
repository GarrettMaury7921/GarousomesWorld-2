package com.garousome.garousomesworld2.world;

import com.garousome.garousomesworld2.core.init.BlockInIt;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
	
	public static void generateOres(final BiomeLoadingEvent event) {
		if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
			
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInIt.essence_of_ethan.get().defaultBlockState(), 14, 4, 200, 26); //vein size, min y, max y
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInIt.essence_of_garrett.get().defaultBlockState(), 3, 0, 8, 2); //vein size, min y, max y
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInIt.essence_of_danny.get().defaultBlockState(), 5, 13, 60, 7); //vein size, min y, max y
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInIt.essence_of_minenfool.get().defaultBlockState(), 4, 20, 200, 15); //vein size, min y, max y
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInIt.essence_of_matthew.get().defaultBlockState(), 4, 0, 10, 5); //vein size, min y, max y
		}
	}

	private static void generateOre(BiomeGenerationSettingsBuilder generation, RuleTest naturalStone, BlockState stateDefinition, int veinSize, int minHeight, int maxHeight, int amount) {
		generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(naturalStone, stateDefinition, veinSize))
				.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
				.squared().count(amount));
		
	}
}
