
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.antlersofthewinter.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.antlersofthewinter.item.RimehornArmorItem;
import net.antlersofthewinter.item.FrostballItem;
import net.antlersofthewinter.item.CryoriteSwordItem;
import net.antlersofthewinter.item.CryoriteShovelItem;
import net.antlersofthewinter.item.CryoritePickaxeItem;
import net.antlersofthewinter.item.CryoriteItem;
import net.antlersofthewinter.item.CryoriteHoeItem;
import net.antlersofthewinter.item.CryoriteAxeItem;
import net.antlersofthewinter.item.CryoriteArmorItem;
import net.antlersofthewinter.AntlersOfTheWinterMod;

public class AntlersOfTheWinterModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AntlersOfTheWinterMod.MODID);
	public static final DeferredItem<Item> RIMEHORN_ARMOR_HELMET = REGISTRY.register("rimehorn_armor_helmet", RimehornArmorItem.Helmet::new);
	public static final DeferredItem<Item> CRYORITE = REGISTRY.register("cryorite", CryoriteItem::new);
	public static final DeferredItem<Item> BLOCK_OF_CRYORITE = block(AntlersOfTheWinterModBlocks.BLOCK_OF_CRYORITE);
	public static final DeferredItem<Item> CRYORITE_PICKAXE = REGISTRY.register("cryorite_pickaxe", CryoritePickaxeItem::new);
	public static final DeferredItem<Item> CRYORITE_AXE = REGISTRY.register("cryorite_axe", CryoriteAxeItem::new);
	public static final DeferredItem<Item> CRYORITE_SWORD = REGISTRY.register("cryorite_sword", CryoriteSwordItem::new);
	public static final DeferredItem<Item> CRYORITE_SHOVEL = REGISTRY.register("cryorite_shovel", CryoriteShovelItem::new);
	public static final DeferredItem<Item> CRYORITE_HOE = REGISTRY.register("cryorite_hoe", CryoriteHoeItem::new);
	public static final DeferredItem<Item> CRYORITE_ARMOR_CHESTPLATE = REGISTRY.register("cryorite_armor_chestplate", CryoriteArmorItem.Chestplate::new);
	public static final DeferredItem<Item> CRYORITE_ARMOR_LEGGINGS = REGISTRY.register("cryorite_armor_leggings", CryoriteArmorItem.Leggings::new);
	public static final DeferredItem<Item> CRYORITE_ARMOR_BOOTS = REGISTRY.register("cryorite_armor_boots", CryoriteArmorItem.Boots::new);
	public static final DeferredItem<Item> FROSTBALL = REGISTRY.register("frostball", FrostballItem::new);
	public static final DeferredItem<Item> SNOWWALKER_SPAWN_EGG = REGISTRY.register("snowwalker_spawn_egg", () -> new DeferredSpawnEggItem(AntlersOfTheWinterModEntities.SNOWWALKER, -8538167, -8334081, new Item.Properties()));
	public static final DeferredItem<Item> HOTHSTONE = block(AntlersOfTheWinterModBlocks.HOTHSTONE);
	public static final DeferredItem<Item> HOTHSTONE_DIAMOND_ORE = block(AntlersOfTheWinterModBlocks.HOTHSTONE_DIAMOND_ORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
