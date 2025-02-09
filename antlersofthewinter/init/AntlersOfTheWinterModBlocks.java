
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.antlersofthewinter.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.antlersofthewinter.block.HothstoneDiamondOreBlock;
import net.antlersofthewinter.block.HothstoneBlock;
import net.antlersofthewinter.block.HothPortalBlock;
import net.antlersofthewinter.block.BlockOfCryoriteBlock;
import net.antlersofthewinter.AntlersOfTheWinterMod;

public class AntlersOfTheWinterModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AntlersOfTheWinterMod.MODID);
	public static final DeferredBlock<Block> BLOCK_OF_CRYORITE = REGISTRY.register("block_of_cryorite", BlockOfCryoriteBlock::new);
	public static final DeferredBlock<Block> HOTH_PORTAL = REGISTRY.register("hoth_portal", HothPortalBlock::new);
	public static final DeferredBlock<Block> HOTHSTONE = REGISTRY.register("hothstone", HothstoneBlock::new);
	public static final DeferredBlock<Block> HOTHSTONE_DIAMOND_ORE = REGISTRY.register("hothstone_diamond_ore", HothstoneDiamondOreBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
