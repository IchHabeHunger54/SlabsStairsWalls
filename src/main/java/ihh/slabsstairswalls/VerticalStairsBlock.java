package ihh.slabsstairswalls;

import java.util.function.Supplier;
import javax.annotation.Nonnull;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.StairsBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class VerticalStairsBlock extends Block implements IWaterLoggable {
    private static final VoxelShape NORTH_SHAPE = Block.makeCuboidShape(8, 0, 8, 16, 16, 16);
    private static final VoxelShape EAST_SHAPE = Block.makeCuboidShape(8, 0, 0, 16, 16, 8);
    private static final VoxelShape SOUTH_SHAPE = Block.makeCuboidShape(0, 0, 0, 8, 16, 8);
    private static final VoxelShape WEST_SHAPE = Block.makeCuboidShape(0, 0, 8, 8, 16, 16);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<VerticalStairsType> TYPE = EnumProperty.create("type", VerticalStairsType.class);
    public final StairsBlock block;

    public VerticalStairsBlock(Supplier<? extends StairsBlock> block) {
        super(Block.Properties.from(block.get()));
        this.block = block.get();
        setDefaultState(getDefaultState().with(TYPE, VerticalStairsType.north).with(WATERLOGGED, false));
    }

    @Override
    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return IWaterLoggable.super.canContainFluid(worldIn, pos, state, fluidIn);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, TYPE);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Vec3d vec = context.getHitVec().subtract(new Vec3d(context.getPos())).subtract(0.5, 0, 0.5);
        return getDefaultState().with(WATERLOGGED, context.getWorld().getFluidState(context.getPos()).getFluid() == Fluids.WATER).with(TYPE, VerticalStairsType.fromDirection(Direction.fromAngle(Math.atan2(vec.x, vec.z) * -180 / 3.14159265358979 + 45)));
    }

    @Override
    public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, IFluidState fluidStateIn) {
        return IWaterLoggable.super.receiveFluid(worldIn, pos, state, fluidStateIn);
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return type == PathType.WATER && worldIn.getFluidState(pos).isTagged(FluidTags.WATER);
    }

    @Nonnull
    @Override
    public IFluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }

    @Nonnull
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return state.get(TYPE).shape;
    }

    @Override
    public boolean isEmissiveRendering(BlockState state) {
        return block.getBlock().isEmissiveRendering(state);
    }

    @Override
    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
        VerticalStairsType type = state.get(TYPE);
        Direction direction = useContext.getFace();
        if (direction.getAxis() == Direction.Axis.Y) {
            Vec3d vec = useContext.getHitVec().subtract(new Vec3d(useContext.getPos())).subtract(0.5, 0, 0.5);
            direction = Direction.fromAngle(Math.atan2(vec.x, vec.z) * -180 / 3.14159265358979).getOpposite();
        }
        return useContext.getItem().getItem() == asItem() && (useContext.replacingClickedOnBlock() && useContext.getFace() == type.direction && direction == type.direction || !useContext.replacingClickedOnBlock() && useContext.getFace().getAxis() != type.direction.getAxis());
    }

    @Nonnull
    @Override
    public BlockState updatePostPlacement(BlockState state, Direction direction, BlockState facing, IWorld world, BlockPos curPos, BlockPos facingPos) {
        if (state.get(WATERLOGGED)) world.getPendingFluidTicks().scheduleTick(curPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        return super.updatePostPlacement(state, direction, facing, world, curPos, facingPos);
    }

    public enum VerticalStairsType implements IStringSerializable {
        north(Direction.NORTH),
        east(Direction.EAST),
        south(Direction.SOUTH),
        west(Direction.WEST);
        public final Direction direction;
        public final VoxelShape shape;
        VerticalStairsType(Direction direction) {
            this.direction = direction;
            this.shape = direction == Direction.NORTH ? VoxelShapes.or(WEST_SHAPE, SOUTH_SHAPE, EAST_SHAPE) : direction == Direction.EAST ? VoxelShapes.or(NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE) : direction == Direction.SOUTH ? VoxelShapes.or(EAST_SHAPE, NORTH_SHAPE, WEST_SHAPE) : direction == Direction.WEST ? VoxelShapes.or(SOUTH_SHAPE, WEST_SHAPE, NORTH_SHAPE) : null;
        }

        @Nonnull
        @Override
        public String getName() {
            return direction.getName();
        }

        public static VerticalStairsType fromDirection(Direction direction) {
            for (VerticalStairsType type : VerticalStairsType.values())
                if (direction == type.direction) return type;
            return null;
        }
    }
}
