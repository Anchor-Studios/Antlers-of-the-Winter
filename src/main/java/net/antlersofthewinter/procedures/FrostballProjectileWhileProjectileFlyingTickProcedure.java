package net.antlersofthewinter.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.antlersofthewinter.init.AntlersOfTheWinterModBlocks;

public class FrostballProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		double o = 0;
		if (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() || Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock()) {
				i = x;
				while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(i, y, z))).getBlock()) {
					world.setBlock(BlockPos.containing(i, y, z), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(i, 1 + o, z))).getBlock()) {
						world.setBlock(BlockPos.containing(i, 1 + o, z), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = 1 + o;
					}
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(i, o - 1, z))).getBlock()) {
						world.setBlock(BlockPos.containing(i, o - 1, z), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = o - 1;
					}
					i = 1 + i;
				}
				i = x;
				while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(i - 1, y, z))).getBlock()) {
					world.setBlock(BlockPos.containing(i - 1, y, z), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(i - 1, 1 + o, z))).getBlock()) {
						world.setBlock(BlockPos.containing(i - 1, 1 + o, z), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = 1 + o;
					}
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(i - 1, o - 1, z))).getBlock()) {
						world.setBlock(BlockPos.containing(i - 1, o - 1, z), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = o - 1;
					}
					i = i - 1;
				}
			} else if (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() || Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock()) {
				i = z;
				while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, y, i))).getBlock()) {
					world.setBlock(BlockPos.containing(x, y, i), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, 1 + o, i))).getBlock()) {
						world.setBlock(BlockPos.containing(x, 1 + o, i), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = 1 + o;
					}
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, o - 1, i))).getBlock()) {
						world.setBlock(BlockPos.containing(x, o - 1, i), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = o - 1;
					}
					i = 1 + i;
				}
				i = z;
				while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, y, i - 1))).getBlock()) {
					world.setBlock(BlockPos.containing(x, y, i - 1), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, 1 + o, i - 1))).getBlock()) {
						world.setBlock(BlockPos.containing(x, 1 + o, i - 1), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = 1 + o;
					}
					o = y;
					while (Blocks.NETHER_PORTAL == (world.getBlockState(BlockPos.containing(x, o - 1, i - 1))).getBlock()) {
						world.setBlock(BlockPos.containing(x, o - 1, i - 1), AntlersOfTheWinterModBlocks.HOTH_PORTAL.get().defaultBlockState(), 3);
						o = o - 1;
					}
					i = i - 1;
				}
			}
		} else if (Blocks.SOUL_FIRE == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() || Blocks.FIRE == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| Blocks.LAVA == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() || Blocks.LAVA == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
