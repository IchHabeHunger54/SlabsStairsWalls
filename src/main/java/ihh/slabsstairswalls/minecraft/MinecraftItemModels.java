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
        parentFenceGate(MinecraftBlocks.NETHER_BRICK_FENCE_GATE, "nether_brick");
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
        parentWall(MinecraftBlocks.OAK_WALL, "oak");
        parentWall(MinecraftBlocks.SPRUCE_WALL, "spruce");
        parentWall(MinecraftBlocks.BIRCH_WALL, "birch");
        parentWall(MinecraftBlocks.JUNGLE_WALL, "jungle");
        parentWall(MinecraftBlocks.ACACIA_WALL, "acacia");
        parentWall(MinecraftBlocks.DARK_OAK_WALL, "dark_oak");
        parentWall(MinecraftBlocks.STRIPPED_OAK_WALL, "stripped_oak");
        parentWall(MinecraftBlocks.STRIPPED_SPRUCE_WALL, "stripped_spruce");
        parentWall(MinecraftBlocks.STRIPPED_BIRCH_WALL, "stripped_birch");
        parentWall(MinecraftBlocks.STRIPPED_JUNGLE_WALL, "stripped_jungle");
        parentWall(MinecraftBlocks.STRIPPED_ACACIA_WALL, "stripped_acacia");
        parentWall(MinecraftBlocks.STRIPPED_DARK_OAK_WALL, "stripped_dark_oak");
        parentStairs(MinecraftBlocks.OAK_STAIRS, "oak");
        parentStairs(MinecraftBlocks.SPRUCE_STAIRS, "spruce");
        parentStairs(MinecraftBlocks.BIRCH_STAIRS, "birch");
        parentStairs(MinecraftBlocks.JUNGLE_STAIRS, "jungle");
        parentStairs(MinecraftBlocks.ACACIA_STAIRS, "acacia");
        parentStairs(MinecraftBlocks.DARK_OAK_STAIRS, "dark_oak");
        parentStairs(MinecraftBlocks.STRIPPED_OAK_STAIRS, "stripped_oak");
        parentStairs(MinecraftBlocks.STRIPPED_SPRUCE_STAIRS, "stripped_spruce");
        parentStairs(MinecraftBlocks.STRIPPED_BIRCH_STAIRS, "stripped_birch");
        parentStairs(MinecraftBlocks.STRIPPED_JUNGLE_STAIRS, "stripped_jungle");
        parentStairs(MinecraftBlocks.STRIPPED_ACACIA_STAIRS, "stripped_acacia");
        parentStairs(MinecraftBlocks.STRIPPED_DARK_OAK_STAIRS, "stripped_dark_oak");
        parentSlab(MinecraftBlocks.OAK_SLAB, "oak");
        parentSlab(MinecraftBlocks.SPRUCE_SLAB, "spruce");
        parentSlab(MinecraftBlocks.BIRCH_SLAB, "birch");
        parentSlab(MinecraftBlocks.JUNGLE_SLAB, "jungle");
        parentSlab(MinecraftBlocks.ACACIA_SLAB, "acacia");
        parentSlab(MinecraftBlocks.DARK_OAK_SLAB, "dark_oak");
        parentSlab(MinecraftBlocks.STRIPPED_OAK_SLAB, "stripped_oak");
        parentSlab(MinecraftBlocks.STRIPPED_SPRUCE_SLAB, "stripped_spruce");
        parentSlab(MinecraftBlocks.STRIPPED_BIRCH_SLAB, "stripped_birch");
        parentSlab(MinecraftBlocks.STRIPPED_JUNGLE_SLAB, "stripped_jungle");
        parentSlab(MinecraftBlocks.STRIPPED_ACACIA_SLAB, "stripped_acacia");
        parentSlab(MinecraftBlocks.STRIPPED_DARK_OAK_SLAB, "stripped_dark_oak");
    }
}
