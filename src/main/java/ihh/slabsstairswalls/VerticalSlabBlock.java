package ihh.slabsstairswalls;

import java.util.function.Supplier;
import javax.annotation.Nonnull;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SlabBlock;
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

public class VerticalSlabBlock extends Block implements IWaterLoggable {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<VerticalSlabType> TYPE = EnumProperty.create("type", VerticalSlabType.class);
    public final SlabBlock block;

    public VerticalSlabBlock(Supplier<? extends SlabBlock> block) {
        super(Block.Properties.from(block.get()));
        this.block = block.get();
        setDefaultState(getDefaultState().with(TYPE, VerticalSlabType.north).with(WATERLOGGED, false));
    }

    @Override
    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE && IWaterLoggable.super.canContainFluid(worldIn, pos, state, fluidIn);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, TYPE);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState state = context.getWorld().getBlockState(context.getPos());
        if (state.getBlock() == this) return state.with(TYPE, VerticalSlabType.DOUBLE).with(WATERLOGGED, false);
        Direction direction = context.getFace();
        if (direction.getAxis() == Direction.Axis.Y) {
            Vec3d vec = context.getHitVec().subtract(new Vec3d(context.getPos())).subtract(0.5, 0, 0.5);
            direction = Direction.fromAngle(Math.atan2(vec.x, vec.z) * -180 / 3.14159265358979).getOpposite();
        }
        return getDefaultState().with(WATERLOGGED, context.getWorld().getFluidState(context.getPos()).getFluid() == Fluids.WATER).with(TYPE, VerticalSlabType.fromDirection(direction));
    }

    @Override
    public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, IFluidState fluidStateIn) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE && IWaterLoggable.super.receiveFluid(worldIn, pos, state, fluidStateIn);
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return type == PathType.WATER && worldIn.getFluidState(pos).isTagged(FluidTags.WATER);
    }

    @Override
    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
        VerticalSlabType type = state.get(TYPE);
        Direction direction = useContext.getFace();
        if (direction.getAxis() == Direction.Axis.Y) {
            Vec3d vec = useContext.getHitVec().subtract(new Vec3d(useContext.getPos())).subtract(0.5, 0, 0.5);
            direction = Direction.fromAngle(Math.atan2(vec.x, vec.z) * -180 / 3.14159265358979).getOpposite();
        }
        return type != VerticalSlabType.DOUBLE && useContext.getItem().getItem() == this.asItem() && (useContext.replacingClickedOnBlock() && (useContext.getFace() == type.direction && direction == type.direction) || (!useContext.replacingClickedOnBlock() && useContext.getFace().getAxis() != type.direction.getAxis()));
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

    @Nonnull
    @Override
    public BlockState updatePostPlacement(BlockState state, Direction direction, BlockState facing, IWorld world, BlockPos curPos, BlockPos facingPos) {
        if (state.get(WATERLOGGED)) world.getPendingFluidTicks().scheduleTick(curPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        return super.updatePostPlacement(state, direction, facing, world, curPos, facingPos);
    }

    public enum VerticalSlabType implements IStringSerializable {
        north(Direction.NORTH),
        east(Direction.EAST),
        south(Direction.SOUTH),
        west(Direction.WEST),
        DOUBLE(null);
        public final Direction direction;
        public final VoxelShape shape;

        VerticalSlabType(Direction direction) {
            this.direction = direction;
            shape = direction == null ? VoxelShapes.fullCube() : makeCuboidShape(direction.getAxis() == Direction.Axis.X ? direction.getAxisDirection() == Direction.AxisDirection.NEGATIVE ? 8 : 0 : 0, 0, direction.getAxis() == Direction.Axis.Z ? direction.getAxisDirection() == Direction.AxisDirection.NEGATIVE ? 8 : 0 : 0, direction.getAxis() == Direction.Axis.X ? direction.getAxisDirection() == Direction.AxisDirection.NEGATIVE ? 16 : 8 : 16, 16, direction.getAxis() == Direction.Axis.Z ? direction.getAxisDirection() == Direction.AxisDirection.NEGATIVE ? 16 : 8 : 16);
        }

        @Nonnull
        @Override
        public String getName() {
            return direction == null ? "double" : direction.getName();
        }

        public static VerticalSlabType fromDirection(Direction direction) {
            for (VerticalSlabType type : VerticalSlabType.values())
                if (type.direction != null && direction == type.direction) return type;
            return null;
        }
    }
}
