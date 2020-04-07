package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.LangGenDEDE;
import ihh.slabsstairswalls.SlabsStairsWalls;
import net.minecraft.data.DataGenerator;

public final class MinecraftLangGenDEDE extends LangGenDEDE {
    public MinecraftLangGenDEDE(DataGenerator g) {
        super(g);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + SlabsStairsWalls.MODID, SlabsStairsWalls.MODNAME);
        stairs(MinecraftItems.CUT_RED_SANDSTONE_STAIRS, "Geschnittene rote Sandstein");
        stairs(MinecraftItems.CUT_SANDSTONE_STAIRS, "Geschnittene Sandstein");
        stairs(MinecraftItems.SMOOTH_STONE_STAIRS, "Glatte Stein");
        wall(MinecraftItems.CUT_RED_SANDSTONE_WALL, "Geschnittene rote Sandstein");
        wall(MinecraftItems.CUT_SANDSTONE_WALL, "Geschnittene Sandstein");
        wall(MinecraftItems.DARK_PRISMARINE_WALL, "Dunkle Prismarin");
        wall(MinecraftItems.PRISMARINE_BRICK_WALL, "Prismarinziegel");
        wall(MinecraftItems.POLISHED_ANDESITE_WALL, "Polierte Andesit");
        wall(MinecraftItems.POLISHED_DIORITE_WALL, "Polierte Diorit");
        wall(MinecraftItems.POLISHED_GRANITE_WALL, "Polierte Granit");
        wall(MinecraftItems.PURPUR_WALL, "Purpur");
        wall(MinecraftItems.QUARTZ_WALL, "Quarz");
        wall(MinecraftItems.SMOOTH_QUARTZ_WALL, "Glatte Quarz");
        wall(MinecraftItems.SMOOTH_RED_SANDSTONE_WALL, "Glatte rote Sandstein");
        wall(MinecraftItems.SMOOTH_SANDSTONE_WALL, "Glatte Sandstein");
        wall(MinecraftItems.SMOOTH_STONE_WALL, "Glatte Stein");
        wall(MinecraftItems.STONE_WALL, "Stein");
        fenceGate(MinecraftItems.NETHER_BRICK_FENCE_GATE, "Netherziegel");
    }
}
