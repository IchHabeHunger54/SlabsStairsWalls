package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.RecipeGen;
import java.util.function.Consumer;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Items;

public final class MinecraftRecipes extends RecipeGen {
    public MinecraftRecipes(DataGenerator g) {
        super(g);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> c) {
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
        fenceGateRecipe(MinecraftItems.NETHER_BRICK_FENCE_GATE, () -> Items.NETHER_BRICKS, () -> Items.NETHER_BRICK, c);
    }
}