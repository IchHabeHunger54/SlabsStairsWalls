package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.LangGenENUS;
import ihh.slabsstairswalls.SlabsStairsWalls;
import net.minecraft.data.DataGenerator;

public final class MinecraftLangGenENUS extends LangGenENUS {
    public MinecraftLangGenENUS(DataGenerator g) {
        super(g);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + SlabsStairsWalls.MODID, SlabsStairsWalls.MODNAME);
        fenceGate(MinecraftItems.NETHER_BRICK_FENCE_GATE, "Nether Brick");
        stairs(MinecraftItems.CUT_RED_SANDSTONE_STAIRS, "Cut Red Sandstone");
        stairs(MinecraftItems.CUT_SANDSTONE_STAIRS, "Cut Sandstone");
        stairs(MinecraftItems.SMOOTH_STONE_STAIRS, "Smooth Stone");
        wall(MinecraftItems.CUT_RED_SANDSTONE_WALL, "Cut Red Sandstone");
        wall(MinecraftItems.CUT_SANDSTONE_WALL, "Cut Sandstone");
        wall(MinecraftItems.DARK_PRISMARINE_WALL, "Dark Prismarine");
        wall(MinecraftItems.PRISMARINE_BRICK_WALL, "Prismarine Brick");
        wall(MinecraftItems.POLISHED_ANDESITE_WALL, "Polished Andesite");
        wall(MinecraftItems.POLISHED_DIORITE_WALL, "Polished Diorite");
        wall(MinecraftItems.POLISHED_GRANITE_WALL, "Polished Granite");
        wall(MinecraftItems.PURPUR_WALL, "Purpur");
        wall(MinecraftItems.QUARTZ_WALL, "Quartz");
        wall(MinecraftItems.SMOOTH_QUARTZ_WALL, "Smooth Quartz");
        wall(MinecraftItems.SMOOTH_RED_SANDSTONE_WALL, "Smooth Red Sandstone");
        wall(MinecraftItems.SMOOTH_SANDSTONE_WALL, "Smooth Sandstone");
        wall(MinecraftItems.SMOOTH_STONE_WALL, "Smooth Stone");
        wall(MinecraftItems.STONE_WALL, "Stone");
        wall(MinecraftItems.OAK_WALL, "Oak");
        wall(MinecraftItems.SPRUCE_WALL, "Spruce");
        wall(MinecraftItems.BIRCH_WALL, "Birch");
        wall(MinecraftItems.JUNGLE_WALL, "Jungle");
        wall(MinecraftItems.ACACIA_WALL, "Acacia");
        wall(MinecraftItems.DARK_OAK_WALL, "Dark Oak");
        wall(MinecraftItems.STRIPPED_OAK_WALL, "Stripped Oak");
        wall(MinecraftItems.STRIPPED_SPRUCE_WALL, "Stripped Spruce");
        wall(MinecraftItems.STRIPPED_BIRCH_WALL, "Stripped Birch");
        wall(MinecraftItems.STRIPPED_JUNGLE_WALL, "Stripped Jungle");
        wall(MinecraftItems.STRIPPED_ACACIA_WALL, "Stripped Acacia");
        wall(MinecraftItems.STRIPPED_DARK_OAK_WALL, "Stripped Dark Oak");
    }
}
