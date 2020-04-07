package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.ItemModels;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public final class MinecraftItemModels extends ItemModels {
    public MinecraftItemModels(DataGenerator g, ExistingFileHelper e) {
        super(g, e);
    }

    @Override
    protected void registerModels() {
        parentStairs(MinecraftBlocks.CUT_RED_SANDSTONE_STAIRS, "cut_red_sandstone");
        parentStairs(MinecraftBlocks.CUT_SANDSTONE_STAIRS, "cut_sandstone");
        parentStairs(MinecraftBlocks.SMOOTH_STONE_STAIRS, "smooth_stone");
        parentWall(MinecraftBlocks.CUT_RED_SANDSTONE_WALL, "cut_red_sandstone");
        parentWall(MinecraftBlocks.CUT_SANDSTONE_WALL, "cut_sandstone");
        parentWall(MinecraftBlocks.DARK_PRISMARINE_WALL, "dark_prismarine");
        parentWall(MinecraftBlocks.PRISMARINE_BRICK_WALL, "prismarine_bricks");
        parentWall(MinecraftBlocks.POLISHED_ANDESITE_WALL, "polished_andesite");
        parentWall(MinecraftBlocks.POLISHED_DIORITE_WALL, "polished_diorite");
        parentWall(MinecraftBlocks.POLISHED_GRANITE_WALL, "polished_granite");
        parentWall(MinecraftBlocks.PURPUR_WALL, "purpur_block");
        parentWall(MinecraftBlocks.QUARTZ_WALL, "quartz_block");
        parentWall(MinecraftBlocks.SMOOTH_QUARTZ_WALL, "smooth_quartz_block");
        parentWall(MinecraftBlocks.SMOOTH_RED_SANDSTONE_WALL, "smooth_red_sandstone");
        parentWall(MinecraftBlocks.SMOOTH_SANDSTONE_WALL, "smooth_sandstone");
        parentWall(MinecraftBlocks.SMOOTH_STONE_WALL, "smooth_stone");
        parentWall(MinecraftBlocks.STONE_WALL, "stone");
        parentFenceGate(MinecraftBlocks.NETHER_BRICK_FENCE_GATE, "nether_brick");
    }
}
