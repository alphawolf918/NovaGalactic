/*******************************************************************************
 * Copyright 2015 Zollern Wolf
 * - Project Nova / Nova Galactic Final Frontier
 * Galacticraft Add-On Mod
 * You CAN:
 * - Learn from it
 * - Use it to get ideas and concepts
 * You CAN'T:
 * - Redistribute it
 * - Claim it as your own
 *******************************************************************************/

package galaxymod.worldgen.dungeon;

import java.util.Random;
import micdoodle8.mods.galacticraft.core.world.gen.dungeon.DungeonBoundingBox;
import micdoodle8.mods.galacticraft.core.world.gen.dungeon.DungeonRoom;
import micdoodle8.mods.galacticraft.core.world.gen.dungeon.MapGenDungeon;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.util.ForgeDirection;

public class RoomEmptyNG extends DungeonRoom {
	
	int sizeX;
	int sizeY;
	int sizeZ;
	
	public RoomEmptyNG(MapGenDungeon dungeon, int posX, int posY, int posZ,
			ForgeDirection entranceDir) {
		super(dungeon, posX, posY, posZ, entranceDir);
		if (this.worldObj != null) {
			final Random rand = new Random(this.worldObj.getSeed() * posX
					* posY * 57 * posZ);
			this.sizeX = rand.nextInt(4) + 5;
			this.sizeY = rand.nextInt(2) + 4;
			this.sizeZ = rand.nextInt(4) + 5;
		}
	}
	
	@Override
	public void generate(Block[] chunk, byte[] meta, int cx, int cz) {
		for (int i = this.posX - 1; i <= this.posX + this.sizeX; i++) {
			for (int j = this.posY - 1; j <= this.posY + this.sizeY; j++) {
				for (int k = this.posZ - 1; k <= this.posZ + this.sizeZ; k++) {
					if (i == this.posX - 1 || i == this.posX + this.sizeX
							|| j == this.posY - 1
							|| j == this.posY + this.sizeY
							|| k == this.posZ - 1
							|| k == this.posZ + this.sizeZ) {
						this.placeBlock(chunk, meta, i, j, k, cx, cz,
								this.dungeonInstance.DUNGEON_WALL_ID,
								this.dungeonInstance.DUNGEON_WALL_META);
					} else {
						this.placeBlock(chunk, meta, i, j, k, cx, cz,
								Blocks.air, 0);
					}
				}
			}
		}
	}
	
	@Override
	public DungeonBoundingBox getBoundingBox() {
		return new DungeonBoundingBox(this.posX, this.posZ, this.posX
				+ this.sizeX, this.posZ + this.sizeZ);
	}
	
	@Override
	protected DungeonRoom makeRoom(MapGenDungeon dungeon, int x, int y, int z,
			ForgeDirection dir) {
		return new RoomEmptyNG(dungeon, x, y, z, dir);
	}
	
	@Override
	protected void handleTileEntities(Random rand) {
	}
}