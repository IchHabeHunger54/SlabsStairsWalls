package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.BlockTagGen;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;

public final class MinecraftBlockTags extends BlockTagGen {
    public MinecraftBlockTags(DataGenerator g) {
        super(g);
    }

    @Override
    protected void registerTags() {
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.CUT_RED_SANDSTONE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.CUT_SANDSTONE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.DARK_PRISMARINE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.PRISMARINE_BRICK_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.POLISHED_ANDESITE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.POLISHED_DIORITE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.POLISHED_GRANITE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.PURPUR_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.QUARTZ_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.SMOOTH_QUARTZ_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.SMOOTH_RED_SANDSTONE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.SMOOTH_SANDSTONE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.SMOOTH_STONE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.STONE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.OAK_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.SPRUCE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.BIRCH_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.JUNGLE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.ACACIA_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.DARK_OAK_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.STRIPPED_OAK_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.STRIPPED_SPRUCE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.STRIPPED_BIRCH_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.STRIPPED_JUNGLE_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.STRIPPED_ACACIA_WALL.get());
        getBuilder(BlockTags.WALLS).add(MinecraftBlocks.STRIPPED_DARK_OAK_WALL.get());
    }
}
