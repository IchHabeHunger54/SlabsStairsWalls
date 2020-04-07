package ihh.slabsstairswalls.minecraft;

import ihh.slabsstairswalls.IInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraftforge.fml.RegistryObject;

public final class MinecraftBlocks implements IInit {
    public static final RegistryObject<FenceGateBlock> NETHER_BRICK_FENCE_GATE = IInit.registerFenceGate("nether_brick_fence_gate", () -> Blocks.NETHER_BRICKS);
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
    public static final RegistryObject<WallBlock> PURPUR_WALL = IInit.registerWall(() -> Blocks.PURPUR_BLOCK);
    public static final RegistryObject<WallBlock> QUARTZ_WALL = IInit.registerWall(() -> Blocks.QUARTZ_BLOCK);
    public static final RegistryObject<WallBlock> SMOOTH_QUARTZ_WALL = IInit.registerWall(() -> Blocks.SMOOTH_QUARTZ);
    public static final RegistryObject<WallBlock> SMOOTH_RED_SANDSTONE_WALL = IInit.registerWall(() -> Blocks.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<WallBlock> SMOOTH_SANDSTONE_WALL = IInit.registerWall(() -> Blocks.SMOOTH_SANDSTONE);
    public static final RegistryObject<WallBlock> SMOOTH_STONE_WALL = IInit.registerWall(() -> Blocks.SMOOTH_STONE);
    public static final RegistryObject<WallBlock> STONE_WALL = IInit.registerWall(() -> Blocks.STONE);
    public static final RegistryObject<WallBlock> OAK_WALL = IInit.registerWall(() -> Blocks.OAK_WOOD);

    public static void register() {
    }
}
