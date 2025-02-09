
package net.antlersofthewinter.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.FastColor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class BlockOfCryoriteBlock extends Block {
	public BlockOfCryoriteBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.glass.step")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.place")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.glass.hit")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.fall"))))
				.strength(20f, 100f).requiresCorrectToolForDrops().friction(0.7f).pushReaction(PushReaction.PUSH_ONLY));
	}

	@Override
	public Integer getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return FastColor.ARGB32.opaque(-6832385);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 2;
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
		return 0.3f;
	}
}
