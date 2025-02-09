
package net.antlersofthewinter.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class HothstoneDiamondOreBlock extends Block {
	public HothstoneDiamondOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6.5f, 13f).requiresCorrectToolForDrops().friction(0.7f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
