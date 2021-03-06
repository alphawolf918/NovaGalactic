/**
 * Zollern Galaxy by @author Zollern Wolf
 * Copyright 2016 - 2025
 * You may use this code to learn from,
 * but do not claim it as your own, and
 * do not redistribute it.
 */
package zollerngalaxy.biomes.kriffon;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zollerngalaxy.blocks.ZGBlocks;
import zollerngalaxy.core.enums.EnumBiomeTypeZG;

public class BiomeKriffonLavaOcean extends BiomeKriffonBase {
	
	public BiomeKriffonLavaOcean(BiomeProperties props) {
		super("krifflavaocean", props);
		props.setRainDisabled();
		props.setBaseHeight(0.0F);
		props.setHeightVariation(0.0F);
		props.setTemperature(9.0F);
		this.setTempCategory(TempCategory.OCEAN);
		this.setTemp(97.0F);
		this.setBiomeHeight(5);
		this.setBlocks(Blocks.AIR);
		this.setBiomeType(EnumBiomeTypeZG.OCEAN);
		this.clearAllNonMonsterSpawning();
		this.biomeDecor.generateFalls = true;
		this.enableSnow = false;
		this.grassFoliageColor = 0xff0000;
		this.waterColor = 0xff0000;
		this.stoneBlock = ZGBlocks.kriffStone;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float p_76731_1_) {
		return 0xffd0000;
	}
}