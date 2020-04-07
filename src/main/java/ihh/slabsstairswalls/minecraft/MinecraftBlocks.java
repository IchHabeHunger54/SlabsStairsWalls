package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.IInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraftforge.fml.RegistryObject;

public final class MinecraftBlocks implements IInit {
    public static final RegistryObject<FenceGateBlock> NETHER_BRICK_FENCE_GATE = IInit.registerFenceGate("nether_brick", () -> Blocks.NETHER_BRICKS);
    public static final RegistryObject<StairsBlock> CUT_RED_SANDSTONE_STAIRS = IInit.registerStairs(() -> Blocks.CUT_RED_SANDSTONE);
    public static final RegistryObject<StairsBlock> CUT_SANDSTONE_STAIRS = IInit.registerStairs(() -> Blocks.CUT_SANDSTONE);
    public static final RegistryObject<StairsBlock> SMOOTH_STONE_STAIRS = IInit.registerStairs(() -> Blocks.SMOOTH_STONE);
    public static final RegistryObject<WallBlock> CUT_RED_SANDSTONE_WALL = IInit.registerWall(() -> Blocks.CUT_RED_SANDSTONE);
    public static final RegistryObject<WallBlock> CUT_SANDSTONE_WALL = IInit.registerWall(() -> Blocks.CUT_SANDSTONE);
    public static final RegistryObject<WallBlock> DARK_PRISMARINE_WALL = IInit.registerWall(() -> Blocks.DARK_PRISMARINE);
    public static final RegistryObject<WallBlock> PRISMARINE_BRICK_WALL = IInit.registerWall(() -> Blocks.PRISMARINE_BRICKS);
    public static final RegistryObject<WallBlock> POLISHED_ANDESITE_WALL = IInit.registerWall(() -> Blocks.POLISHED_ANDESITE);
    public static final RegistryObject<WallBlock> POLISHED_DIORITE_WALL = IInit.registerWall(() -> Blocks.POLISHED_DIORITE);
    public static final RegistryObject<WallBlock> POLISHED_GRANITE_WALL = IInit.registerWall(() -> Blocks.POLISHED_GRANITE);
    public static final RegistryObject<WallBlock> PURPUR_WALL = IInit.registerWall("purpur", () -> Blocks.PURPUR_BLOCK);
    public static final RegistryObject<WallBlock> QUARTZ_WALL = IInit.registerWall("quartz", () -> Blocks.QUARTZ_BLOCK);
    public static final RegistryObject<WallBlock> SMOOTH_QUARTZ_WALL = IInit.registerWall("smooth_quartz", () -> Blocks.SMOOTH_QUARTZ);
    public static final RegistryObject<WallBlock> SMOOTH_RED_SANDSTONE_WALL = IInit.registerWall(() -> Blocks.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<WallBlock> SMOOTH_SANDSTONE_WALL = IInit.registerWall(() -> Blocks.SMOOTH_SANDSTONE);
    public static final RegistryObject<WallBlock> SMOOTH_STONE_WALL = IInit.registerWall(() -> Blocks.SMOOTH_STONE);
    public static final RegistryObject<WallBlock> STONE_WALL = IInit.registerWall(() -> Blocks.STONE);
    public static final RegistryObject<WallBlock> OAK_WALL = IInit.registerWall("oak", () -> Blocks.OAK_WOOD);
    public static final RegistryObject<WallBlock> SPRUCE_WALL = IInit.registerWall("spruce", () -> Blocks.SPRUCE_WOOD);
    public static final RegistryObject<WallBlock> BIRCH_WALL = IInit.registerWall("birch", () -> Blocks.BIRCH_WOOD);
    public static final RegistryObject<WallBlock> JUNGLE_WALL = IInit.registerWall("jungle", () -> Blocks.JUNGLE_WOOD);
    public static final RegistryObject<WallBlock> ACACIA_WALL = IInit.registerWall("acacia", () -> Blocks.ACACIA_WOOD);
    public static final RegistryObject<WallBlock> DARK_OAK_WALL = IInit.registerWall("dark_oak", () -> Blocks.DARK_OAK_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_OAK_WALL = IInit.registerWall("stripped_oak", () -> Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_SPRUCE_WALL = IInit.registerWall("stripped_spruce", () -> Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_BIRCH_WALL = IInit.registerWall("stripped_birch", () -> Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_JUNGLE_WALL = IInit.registerWall("stripped_jungle", () -> Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_ACACIA_WALL = IInit.registerWall("stripped_acacia", () -> Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_DARK_OAK_WALL = IInit.registerWall("stripped_dark_oak", () -> Blocks.STRIPPED_DARK_OAK_WOOD);

    public static void register() {
    }
}
