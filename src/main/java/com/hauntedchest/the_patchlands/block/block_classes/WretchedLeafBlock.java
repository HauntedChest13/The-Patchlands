package com.hauntedchest.the_patchlands.block.block_classes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.function.ToIntFunction;

public class WretchedLeafBlock extends MultifaceBlock implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape EAST_AABB = Block.box(1D, 2D, 6D, 6D, 11D, 11D);
    protected static final VoxelShape WEST_AABB = Block.box(10D, 2D, 6D, 15D, 11D, 11D);
    protected static final VoxelShape SOUTH_AABB = Block.box(6D, 2D, 1D, 11D, 11D, 6D);
    protected static final VoxelShape NORTH_AABB = Block.box(6D, 2D, 10D, 11D, 11D, 15D);

    public WretchedLeafBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.FALSE));
    }

    public static ToIntFunction<BlockState> emission(int p_181223_) {
        return (p_181221_) -> {
            return MultifaceBlock.hasAnyFace(p_181221_) ? p_181223_ : 0;
        };
    }

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch((Direction)pState.getValue(FACING)) {
            case NORTH:
                return NORTH_AABB;
            case SOUTH:
                return SOUTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
            default:
                return EAST_AABB;
        }
    }

    private boolean canAttachTo(BlockGetter pBlockReader, BlockPos pPos, Direction pDirection) {
        BlockState blockstate = pBlockReader.getBlockState(pPos);
        return blockstate.isFaceSturdy(pBlockReader, pPos, pDirection);
    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        Direction direction = pState.getValue(FACING);
        return this.canAttachTo(pLevel, pPos.relative(direction.getOpposite()), direction);
    }

    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pFacing.getOpposite() == pState.getValue(FACING) && !pState.canSurvive(pLevel, pCurrentPos)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            if (pState.getValue(WATERLOGGED)) {
                pLevel.getLiquidTicks().scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
            }

            return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        if (!pContext.replacingClickedOnBlock()) {
            BlockState blockstate = pContext.getLevel().getBlockState(pContext.getClickedPos().relative(pContext.getClickedFace().getOpposite()));
            if (blockstate.is(this) && blockstate.getValue(FACING) == pContext.getClickedFace()) {
                return null;
            }
        }

        BlockState blockstate1 = this.defaultBlockState();
        LevelReader levelreader = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());

        for(Direction direction : pContext.getNearestLookingDirections()) {
            if (direction.getAxis().isHorizontal()) {
                blockstate1 = blockstate1.setValue(FACING, direction.getOpposite());
                if (blockstate1.canSurvive(levelreader, blockpos)) {
                    return blockstate1.setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
                }
            }
        }

        return null;
    }

    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, WATERLOGGED);
    }

    public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }
}
