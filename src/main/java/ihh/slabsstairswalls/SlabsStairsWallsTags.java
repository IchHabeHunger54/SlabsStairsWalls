package ihh.slabsstairswalls;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public final class SlabsStairsWallsTags {
    public static final class Blocks {
        public static final Tag<Block> VERTICAL_SLABS = new BlockTags.Wrapper(new ResourceLocation(SlabsStairsWalls.MODID, "vertical_slabs"));
        public static final Tag<Block> VERTICAL_STAIRS = new BlockTags.Wrapper(new ResourceLocation(SlabsStairsWalls.MODID, "vertical_stairs"));
    }
    public static final class Items {
        public static final Tag<Item> VERTICAL_SLABS = new ItemTags.Wrapper(new ResourceLocation(SlabsStairsWalls.MODID, "vertical_slabs"));
        public static final Tag<Item> VERTICAL_STAIRS = new ItemTags.Wrapper(new ResourceLocation(SlabsStairsWalls.MODID, "vertical_stairs"));
    }
}
