package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.BlockStates;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public final class MinecraftBlockStates extends BlockStates {
    public MinecraftBlockStates(DataGenerator g, ExistingFileHelper e) {
        super(g, e);
    }

    @Override
    protected void registerStatesAndModels() {
        fenceGate(MinecraftBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);
        stairs(MinecraftBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);
        stairs(MinecraftBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);
        stairs(MinecraftBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
        wall(MinecraftBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);
        wall(MinecraftBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);
        wall(MinecraftBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
        wall(MinecraftBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
        wall(MinecraftBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        wall(MinecraftBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        wall(MinecraftBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        wall(MinecraftBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);
//        wall(MinecraftBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
//        wall(MinecraftBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
//        wall(MinecraftBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
//        wall(MinecraftBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
        wall(MinecraftBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        wall(MinecraftBlocks.STONE_WALL, Blocks.STONE);
    }
}
