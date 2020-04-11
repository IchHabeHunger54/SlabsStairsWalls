package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.RecipeGen;
import java.util.function.Consumer;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;

public final class MinecraftRecipes extends RecipeGen {
    public MinecraftRecipes(DataGenerator g) {
        super(g);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> c) {
        fenceGateRecipe(MinecraftItems.NETHER_BRICK_FENCE_GATE, () -> Items.NETHER_BRICKS, Tags.Items.INGOTS_NETHER_BRICK, c);
        stairsRecipe(MinecraftItems.CUT_RED_SANDSTONE_STAIRS, () -> Items.CUT_RED_SANDSTONE, true, c);
        stairsRecipe(MinecraftItems.CUT_SANDSTONE_STAIRS, () -> Items.CUT_SANDSTONE, true, c);
        stairsRecipe(MinecraftItems.SMOOTH_STONE_STAIRS, () -> Items.SMOOTH_STONE, true, c);
        wallRecipe(MinecraftItems.CUT_RED_SANDSTONE_WALL, () -> Items.CUT_RED_SANDSTONE, true, c);
        wallRecipe(MinecraftItems.CUT_SANDSTONE_WALL, () -> Items.CUT_SANDSTONE, true, c);
        wallRecipe(MinecraftItems.DARK_PRISMARINE_WALL, () -> Items.DARK_PRISMARINE, true, c);
        wallRecipe(MinecraftItems.PRISMARINE_BRICK_WALL, () -> Items.PRISMARINE_BRICKS, true, c);
        wallRecipe(MinecraftItems.POLISHED_ANDESITE_WALL, () -> Items.POLISHED_ANDESITE, true, c);
        wallRecipe(MinecraftItems.POLISHED_DIORITE_WALL, () -> Items.POLISHED_DIORITE, true, c);
        wallRecipe(MinecraftItems.POLISHED_GRANITE_WALL, () -> Items.POLISHED_GRANITE, true, c);
        wallRecipe(MinecraftItems.PURPUR_WALL, () -> Items.PURPUR_BLOCK, true, c);
        wallRecipe(MinecraftItems.QUARTZ_WALL, () -> Items.QUARTZ_BLOCK, true, c);
        wallRecipe(MinecraftItems.SMOOTH_QUARTZ_WALL, () -> Items.SMOOTH_QUARTZ, true, c);
        wallRecipe(MinecraftItems.SMOOTH_RED_SANDSTONE_WALL, () -> Items.SMOOTH_RED_SANDSTONE, true, c);
        wallRecipe(MinecraftItems.SMOOTH_SANDSTONE_WALL, () -> Items.SMOOTH_SANDSTONE, true, c);
        wallRecipe(MinecraftItems.SMOOTH_STONE_WALL, () -> Items.SMOOTH_STONE, true, c);
        wallRecipe(MinecraftItems.STONE_WALL, () -> Items.STONE, true, c);
        wallRecipe(MinecraftItems.OAK_WALL, () -> Items.OAK_WOOD, false, c);
        wallRecipe(MinecraftItems.SPRUCE_WALL, () -> Items.SPRUCE_WOOD, false, c);
        wallRecipe(MinecraftItems.BIRCH_WALL, () -> Items.BIRCH_WOOD, false, c);
        wallRecipe(MinecraftItems.JUNGLE_WALL, () -> Items.JUNGLE_WOOD, false, c);
        wallRecipe(MinecraftItems.ACACIA_WALL, () -> Items.ACACIA_WOOD, false, c);
        wallRecipe(MinecraftItems.DARK_OAK_WALL, () -> Items.DARK_OAK_WOOD, false, c);
        wallRecipe(MinecraftItems.STRIPPED_OAK_WALL, () -> Items.STRIPPED_OAK_WOOD, false, c);
        wallRecipe(MinecraftItems.STRIPPED_SPRUCE_WALL, () -> Items.STRIPPED_SPRUCE_WOOD, false, c);
        wallRecipe(MinecraftItems.STRIPPED_BIRCH_WALL, () -> Items.STRIPPED_BIRCH_WOOD, false, c);
        wallRecipe(MinecraftItems.STRIPPED_JUNGLE_WALL, () -> Items.STRIPPED_JUNGLE_WOOD, false, c);
        wallRecipe(MinecraftItems.STRIPPED_ACACIA_WALL, () -> Items.STRIPPED_ACACIA_WOOD, false, c);
        wallRecipe(MinecraftItems.STRIPPED_DARK_OAK_WALL, () -> Items.STRIPPED_DARK_OAK_WOOD, false, c);
        stairsRecipe(MinecraftItems.OAK_STAIRS, () -> Items.OAK_WOOD, false, c);
        stairsRecipe(MinecraftItems.SPRUCE_STAIRS, () -> Items.SPRUCE_WOOD, false, c);
        stairsRecipe(MinecraftItems.BIRCH_STAIRS, () -> Items.BIRCH_WOOD, false, c);
        stairsRecipe(MinecraftItems.JUNGLE_STAIRS, () -> Items.JUNGLE_WOOD, false, c);
        stairsRecipe(MinecraftItems.ACACIA_STAIRS, () -> Items.ACACIA_WOOD, false, c);
        stairsRecipe(MinecraftItems.DARK_OAK_STAIRS, () -> Items.DARK_OAK_WOOD, false, c);
        stairsRecipe(MinecraftItems.STRIPPED_OAK_STAIRS, () -> Items.STRIPPED_OAK_WOOD, false, c);
        stairsRecipe(MinecraftItems.STRIPPED_SPRUCE_STAIRS, () -> Items.STRIPPED_SPRUCE_WOOD, false, c);
        stairsRecipe(MinecraftItems.STRIPPED_BIRCH_STAIRS, () -> Items.STRIPPED_BIRCH_WOOD, false, c);
        stairsRecipe(MinecraftItems.STRIPPED_JUNGLE_STAIRS, () -> Items.STRIPPED_JUNGLE_WOOD, false, c);
        stairsRecipe(MinecraftItems.STRIPPED_ACACIA_STAIRS, () -> Items.STRIPPED_ACACIA_WOOD, false, c);
        stairsRecipe(MinecraftItems.STRIPPED_DARK_OAK_STAIRS, () -> Items.STRIPPED_DARK_OAK_WOOD, false, c);
        slabRecipe(MinecraftItems.OAK_SLAB, () -> Items.OAK_WOOD, false, c);
        slabRecipe(MinecraftItems.SPRUCE_SLAB, () -> Items.SPRUCE_WOOD, false, c);
        slabRecipe(MinecraftItems.BIRCH_SLAB, () -> Items.BIRCH_WOOD, false, c);
        slabRecipe(MinecraftItems.JUNGLE_SLAB, () -> Items.JUNGLE_WOOD, false, c);
        slabRecipe(MinecraftItems.ACACIA_SLAB, () -> Items.ACACIA_WOOD, false, c);
        slabRecipe(MinecraftItems.DARK_OAK_SLAB, () -> Items.DARK_OAK_WOOD, false, c);
        slabRecipe(MinecraftItems.STRIPPED_OAK_SLAB, () -> Items.STRIPPED_OAK_WOOD, false, c);
        slabRecipe(MinecraftItems.STRIPPED_SPRUCE_SLAB, () -> Items.STRIPPED_SPRUCE_WOOD, false, c);
        slabRecipe(MinecraftItems.STRIPPED_BIRCH_SLAB, () -> Items.STRIPPED_BIRCH_WOOD, false, c);
        slabRecipe(MinecraftItems.STRIPPED_JUNGLE_SLAB, () -> Items.STRIPPED_JUNGLE_WOOD, false, c);
        slabRecipe(MinecraftItems.STRIPPED_ACACIA_SLAB, () -> Items.STRIPPED_ACACIA_WOOD, false, c);
        slabRecipe(MinecraftItems.STRIPPED_DARK_OAK_SLAB, () -> Items.STRIPPED_DARK_OAK_WOOD, false, c);
    }
}
