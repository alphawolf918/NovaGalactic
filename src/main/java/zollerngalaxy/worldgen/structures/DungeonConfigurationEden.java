/**
 * Zollern Galaxy by @author Zollern Wolf
 * Copyright 2016 - 2025
 * You may use this code to learn from, but do not
 * claim it as your own, and do not
 * redistribute it.
 */
package zollerngalaxy.worldgen.structures;

import micdoodle8.mods.galacticraft.core.world.gen.dungeon.DungeonConfiguration;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;

public class DungeonConfigurationEden extends DungeonConfiguration {
	
	private IBlockState brickBlockFloor;
	
	public DungeonConfigurationEden() {
	}
	
	public DungeonConfigurationEden(IBlockState brickBlock, IBlockState brickBlockFloor, int yPosition, int hallwayLengthMin,
			int hallwayLengthMax, int hallwayHeight, int roomHeight, Class<?> bossRoom, Class<?> treasureRoom) {
		super(brickBlock, yPosition, hallwayLengthMin, hallwayLengthMax, hallwayHeight, roomHeight, bossRoom, treasureRoom);
		this.brickBlockFloor = brickBlockFloor;
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound tagCompound) {
		tagCompound.setString("brickBlock", Block.REGISTRY.getNameForObject(this.brickBlockFloor.getBlock()).toString());
		return super.writeToNBT(tagCompound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tagCompound) {
		try {
			this.brickBlockFloor = Block.getBlockFromName(tagCompound.getString("brickBlock")).getStateFromMeta(
					tagCompound.getInteger("brickBlockMeta"));
		} catch (Exception e) {
			System.err.println("Failed to read dungeon configuration from NBT");
			e.printStackTrace();
		}
		
		super.readFromNBT(tagCompound);
	}
	
	public IBlockState getBrickBlockFloor() {
		return brickBlockFloor;
	}
}
