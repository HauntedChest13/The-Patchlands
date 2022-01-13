package com.hauntedchest.the_patchlands.block.block_classes;

import com.hauntedchest.the_patchlands.registry.TPParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Random;

public class IgnisteelLanternBlock extends LanternBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty FLICKERING = BooleanProperty.create("flickering");
    public static final BooleanProperty HANGING = BlockStateProperties.HANGING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    protected static final VoxelShape AABB = Shapes.or(Block.box(2.0D, 2.0D, 5.5D, 14.0D, 7.0D, 10.5D), Block.box(7.0D, 1.0D, 8.0D, 9.0D, 3.0D, 10.0D));
    protected static final VoxelShape HANGING_AABB = Shapes.or(Block.box(2.0D, 6.0D, 5.5D, 14.0D, 11.0D, 10.5D), Block.box(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));
    protected static final VoxelShape AABB2 = Shapes.or(Block.box(5.5D, 2.0D, 2.0D, 10.5D, 7.0D, 14.0D), Block.box(7.0D, 1.0D, 8.0D, 9.0D, 3.0D, 10.0D));
    protected static final VoxelShape HANGING_AABB2 = Shapes.or(Block.box(5.5D, 6.0D, 2.0D, 10.5D, 11.0D, 14.0D), Block.box(5, 11, 8, 11, 16, 8));
    public static VoxelShape voxelShape = Shapes.or(Block.box(2.0D, 2.0D, 5.5D, 14.0D, 7.0D, 10.5D), Block.box(7.0D, 1.0D, 8.0D, 9.0D, 3.0D, 10.0D));
    public IgnisteelLanternBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HANGING, Boolean.FALSE).setValue(WATERLOGGED, Boolean.FALSE).setValue(FACING, Direction.NORTH));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_153467_) {
        FluidState fluidstate = p_153467_.getLevel().getFluidState(p_153467_.getClickedPos());

        for(Direction direction : p_153467_.getNearestLookingDirections()) {
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockstate = this.defaultBlockState().setValue(HANGING, direction == Direction.UP);
                if (blockstate.canSurvive(p_153467_.getLevel(), p_153467_.getClickedPos())) {
                    return blockstate.setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER).setValue(FACING, p_153467_.getHorizontalDirection());
                }
            }
        }

        return null;
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
       // return blockState.getValue(HANGING) ? HANGING_AABB : AABB;
        if(blockState.getValue(HANGING)){
            if ((Direction) blockState.getValue(FACING) == Direction.NORTH) {
                voxelShape = HANGING_AABB;
            }
            if ((Direction) blockState.getValue(FACING) == Direction.SOUTH) {
                voxelShape = HANGING_AABB;
            }
            if ((Direction) blockState.getValue(FACING) == Direction.EAST) {
                voxelShape = HANGING_AABB2;
            }
            if ((Direction) blockState.getValue(FACING) == Direction.WEST) {
                voxelShape = HANGING_AABB2;
            }
        } else {
            if ((Direction) blockState.getValue(FACING) == Direction.NORTH) {
                voxelShape = AABB;
            }
            if ((Direction) blockState.getValue(FACING) == Direction.SOUTH) {
                voxelShape = AABB;
            }
            if ((Direction) blockState.getValue(FACING) == Direction.EAST) {
                voxelShape = AABB2;
            }
            if ((Direction) blockState.getValue(FACING) == Direction.WEST) {
                voxelShape = AABB2;
            }
        }

        return voxelShape;

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HANGING, WATERLOGGED, FACING);
    }

    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos p_153481_) {
        Direction direction = getConnectedDirection(blockState).getOpposite();
        return Block.canSupportCenter(levelReader, p_153481_.relative(direction), direction.getOpposite());
    }

    protected static Direction getConnectedDirection(BlockState p_153496_) {
        return p_153496_.getValue(HANGING) ? Direction.DOWN : Direction.UP;
    }


    public PushReaction getPistonPushReaction(BlockState blockState) {
        return PushReaction.DESTROY;
    }

    public BlockState updateShape(BlockState p_153483_, Direction direction, BlockState blockState, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        if (p_153483_.getValue(WATERLOGGED)) {
            levelAccessor.getLiquidTicks().scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelAccessor));
        }

        return getConnectedDirection(p_153483_).getOpposite() == direction && !p_153483_.canSurvive(levelAccessor, blockPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_153483_, direction, blockState, levelAccessor, blockPos, blockPos2);
    }

    public FluidState getFluidState(BlockState blockState) {
        return blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    public boolean isPathfindable(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, PathComputationType pathComputationType) {
        return false;
    }

    public BlockState rotate(BlockState pState, Rotation pRot) {
        return pState.setValue(FACING, pRot.rotate(pState.getValue(FACING)));
    }

    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    public void animateTick(BlockState p_154704_, Level p_154705_, BlockPos p_154706_, Random p_154707_) {
        int i = p_154706_.getX();
        int j = p_154706_.getY();
        int k = p_154706_.getZ();
        double d0 = (double)i + p_154707_.nextDouble();
        double d1 = (double)j + 0.7D;
        double d2 = (double)k + p_154707_.nextDouble();
        p_154705_.addParticle(TPParticleTypes.RUST.get(), d0, d1, d2, 0.0D, 0.0D, 0.0D);
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for(int l = 0; l < 14; ++l) {
            blockpos$mutableblockpos.set(i + Mth.nextInt(p_154707_, -10, 10), j - p_154707_.nextInt(10), k + Mth.nextInt(p_154707_, -10, 10));
            BlockState blockstate = p_154705_.getBlockState(blockpos$mutableblockpos);
            if (!blockstate.isCollisionShapeFullBlock(p_154705_, blockpos$mutableblockpos)) {
                p_154705_.addParticle(TPParticleTypes.RUST.get(), (double)blockpos$mutableblockpos.getX() + p_154707_.nextDouble(), (double)blockpos$mutableblockpos.getY() + p_154707_.nextDouble(), (double)blockpos$mutableblockpos.getZ() + p_154707_.nextDouble(), 0.0D, 0.0D, 0.0D);
            }
        }

    }
}
