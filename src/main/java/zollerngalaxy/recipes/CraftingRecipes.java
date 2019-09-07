package zollerngalaxy.recipes;

import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zollerngalaxy.blocks.ZGBlocks;
import zollerngalaxy.items.ZGItems;
import zollerngalaxy.lib.helpers.ZGHelper;
import zollerngalaxy.lib.helpers.ZGRecipeHelper;

public class CraftingRecipes {
	
	private static int totalCraftRecipes = 0;
	
	public static void init() {
		CraftingRecipes.addRecipes();
		ZGHelper.Log("Loaded a total of " + totalCraftRecipes + " new crafting recipes.");
	}
	
	private static void addRecipes() {
		CraftingRecipes.addRockBricks(ZGBlocks.zolStone, ZGBlocks.zolRockBricks);
		CraftingRecipes.addRockBricks(ZGBlocks.kriffStone, ZGBlocks.kriffRockBricks);
		CraftingRecipes.addRockBricks(ZGBlocks.purgStone, ZGBlocks.purgRockBricks);
		CraftingRecipes.addRockBricks(ZGBlocks.edenStone, ZGBlocks.edenRockBricks);
		CraftingRecipes.addRockBricks(ZGBlocks.edenBloodSand, ZGBlocks.edenBloodStone);
		CraftingRecipes.addRockBricks(ZGBlocks.edenSacredStone, ZGBlocks.edenDungeonBricks);
		CraftingRecipes.addRockBricks(ZGBlocks.xathStone, ZGBlocks.xathRockBricks);
		CraftingRecipes.addRockBricks(ZGBlocks.oasisStone, ZGBlocks.oasisRockBricks);
		
		CraftingRecipes.addIngotMetal(ZGItems.ingotViri, ZGBlocks.blockViri);
		CraftingRecipes.addIngotMetal(ZGItems.ingotCobalt, ZGBlocks.blockCobalt);
		CraftingRecipes.addIngotMetal(ZGItems.ingotEve, ZGBlocks.blockEve);
		CraftingRecipes.addIngotMetal(ZGItems.prometheanCrystal, ZGBlocks.blockPromethean);
		CraftingRecipes.addIngotMetal(ZGItems.superChargedCoal, ZGBlocks.blockSuperChargedCoal);
		CraftingRecipes.addIngotMetal(ZGItems.compressedCobalt, ZGBlocks.blockCompressedCobalt);
		CraftingRecipes.addIngotMetal(ZGItems.compressedEvenium, ZGBlocks.blockCompressedEve);
		CraftingRecipes.addIngotMetal(ZGItems.compressedHeartium, ZGBlocks.blockCompressedHeartium);
		CraftingRecipes.addIngotMetal(ZGItems.compressedPromethean, ZGBlocks.blockCompressedPromethean);
		CraftingRecipes.addIngotMetal(ZGItems.compressedSuperChargedCoal, ZGBlocks.blockCompressedSuperChargedCoal);
		CraftingRecipes.addIngotMetal(ZGItems.compressedVirinium, ZGBlocks.blockCompressedViri);
		
		CraftingRecipes.addBriteStone(ZGItems.dustBrightstone, ZGBlocks.edenBrightStone);
		
		CraftingRecipes.addPlanks(ZGBlocks.edenWoodLog, ZGBlocks.edenWoodPlanks);
		
		// HUD
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.hud, 1), new Object[] { "RXR", "SDS", "RXR", 'R', Items.REDSTONE,
				'X', new ItemStack(GCItems.basicItem, 1, 3), 'S', new ItemStack(GCItems.basicItem, 1, 5), 'D',
				new ItemStack(MarsItems.marsItemBasic, 1, 3) });
		totalCraftRecipes++;
		
		// Kriffon Crystal
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.kriffCrystal, 1), new Object[] { "FZF", "CVC", "ERE", 'F',
				ZGItems.compressedKriffonium, 'Z', ZGItems.zolCrystal, 'C', ZGItems.compressedCobalt, 'V',
				new ItemStack(MarsItems.marsItemBasic, 1, 3), 'E', ZGItems.compressedHeartium, 'R',
				ZGItems.compressedEmerald });
		totalCraftRecipes++;
		
		// Purgot Crystal
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.purgCrystal, 1), new Object[] { "E E", " R ", "E E", 'E',
				ZGItems.compressedEvenium, 'R', Items.REDSTONE });
		totalCraftRecipes++;
		
		// Eden Crystal
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.edenCrystal, 1), new Object[] { "EXE", "HRH", "EXE", 'E',
				ZGItems.compressedEmerald, 'R', ZGItems.kriffCrystal, 'X', ZGItems.purgCrystal, 'H', ZGItems.zolCrystal });
		totalCraftRecipes++;
		
		// Alien Stone
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.alienStone, 1), new Object[] { "CVC", "ZBZ", "CIC", 'C',
				ZGItems.edenCrystal, 'V', ZGItems.compressedVyrex, 'Z', ZGBlocks.blockCompressedCobalt, 'B',
				ZGBlocks.blockViri, 'I', ZGBlocks.edenBrightStone });
		totalCraftRecipes++;
		
		// Pickaxes
		CraftingRecipes.addToolSet(new ItemStack(ZGItems.pickaxeCobalt), ZGItems.ingotCobalt, "pickaxe");
		CraftingRecipes.addToolSet(new ItemStack(ZGItems.pickaxeEvenium), ZGItems.ingotEve, "pickaxe");
		CraftingRecipes.addToolSet(new ItemStack(ZGItems.pickaxeVirinium), ZGItems.ingotViri, "pickaxe");
		
		// Star Gate (Tier 1)
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.starGateTier1, 1),
				new Object[] { "VCV", "HYH", "YCY", 'V', ZGItems.compressedDiamond, 'C', ZGItems.compressedHeartium, 'H',
						ZGItems.heartOfZol, 'Y', ZGItems.zolCrystal });
		totalCraftRecipes++;
		
		// Star Gate (Tier 2)
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.starGateTier2, 1), new Object[] { "VCV", "HYH", "YCY", 'V',
				ZGItems.compressedCobalt, 'C', ZGItems.kriffCrystal, 'H', ZGItems.heartOfZol, 'Y', ZGBlocks.blockCobalt });
		totalCraftRecipes++;
		
		// Star Gate (Tier 3)
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.starGateTier3, 1), new Object[] { "VCV", "HYH", "YCY", 'V',
				ZGItems.compressedEvenium, 'C', ZGItems.compressedHeartium, 'H', ZGItems.compressedCobalt, 'Y',
				ZGItems.purgCrystal });
		totalCraftRecipes++;
		
		// Star Gate (Tier 4)
		ZGRecipeHelper.addRecipe(new ItemStack(ZGItems.starGateTier4, 1), new Object[] { "VCV", "HYH", "YCY", 'V',
				ZGBlocks.blockCompressedViri, 'C', ZGItems.compressedVyrex, 'H', ZGBlocks.blockCompressedCobalt, 'Y',
				ZGItems.alienStone });
		totalCraftRecipes++;
		
		// Star Gate (Tier 5)
		// TODO: Next release..
	}
	
	private static void addRockBricks(Block stoneIn, Block bricksOut) {
		ZGRecipeHelper.addRecipe(new ItemStack(bricksOut, 4), new Object[] { "SS", "SS", 'S', stoneIn });
		totalCraftRecipes++;
	}
	
	private static void addIngotMetal(Item ingotIn, Block blockOut) {
		ZGRecipeHelper.addRecipe(new ItemStack(blockOut, 1), new Object[] { "III", "III", "III", 'I', ingotIn });
		ZGRecipeHelper.addShapelessRecipe(new ItemStack(ingotIn, 9), new ItemStack(blockOut));
		totalCraftRecipes += 2;
	}
	
	private static void addBriteStone(Item dustIn, Block blockOut) {
		ZGRecipeHelper.addRecipe(new ItemStack(blockOut, 1), new Object[] { "DD", "DD", 'D', dustIn });
		totalCraftRecipes++;
	}
	
	private static void addPlanks(Block logIn, Block planksOut) {
		ZGRecipeHelper.addShapelessRecipe(new ItemStack(planksOut, 4), new ItemStack(logIn));
		totalCraftRecipes++;
	}
	
	private static void addToolSet(ItemStack itemOutput, Item itemIngot, String toolType) {
		ZGRecipeHelper.addSimpleToolSet(itemOutput, itemIngot, toolType);
		totalCraftRecipes++;
	}
}