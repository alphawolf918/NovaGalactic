/**
 * Zollern Galaxy by @author Zollern Wolf
 * Copyright 2016 - 2025
 * You may use this code to learn from, but do not
 * claim it as your own, and do not
 * redistribute it.
 */
package zollerngalaxy.biomes.metztli;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zollerngalaxy.core.enums.EnumBiomeTypeZG;

public class BiomeHarran extends BiomeMetztliBase {
	
	public BiomeHarran(BiomeProperties props) {
		super("harran", props);
		this.setupBiome(props);
	}
	
	public BiomeHarran(String singleName, BiomeProperties props) {
		super(singleName, props);
		this.setupBiome(props);
	}
	
	private void setupBiome(BiomeProperties props) {
		this.setTempCategory(TempCategory.MEDIUM);
		props.setBaseHeight(1.2F);
		props.setHeightVariation(0.5F);
		props.setTemperature(4.0F);
		this.setTemp(4F);
		this.setBiomeHeight(52);
		this.setBiomeType(EnumBiomeTypeZG.LUSH);
		this.enableSnow = false;
		this.decorator.generateFalls = true;
		this.biomeDecor.waterLakesPerChunk = 2;
		this.biomeDecor.lavaLakesPerChunk = 0;
		this.biomeDecor.grassPerChunk = 14;
		this.biomeDecor.flowersPerChunk = 8;
		this.biomeDecor.treesPerChunk = 1;
		this.grassFoliageColor = 0x00008b;
		this.waterColor = 0x8b008b;
		this.topBlock = Blocks.GRASS.getDefaultState();
		this.fillerBlock = Blocks.DIRT.getDefaultState();
		this.stoneBlock = Blocks.STONE;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float p_76731_1_) {
		return 0x003a4b;
	}
}