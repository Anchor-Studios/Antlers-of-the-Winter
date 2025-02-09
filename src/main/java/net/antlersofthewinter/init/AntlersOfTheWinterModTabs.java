
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.antlersofthewinter.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.antlersofthewinter.AntlersOfTheWinterMod;

public class AntlersOfTheWinterModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AntlersOfTheWinterMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ANTLERS_OF_THE_WINTER = REGISTRY.register("antlers_of_the_winter",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.antlers_of_the_winter.antlers_of_the_winter")).icon(() -> new ItemStack(AntlersOfTheWinterModItems.CRYORITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AntlersOfTheWinterModItems.RIMEHORN_ARMOR_HELMET.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE.get());
				tabData.accept(AntlersOfTheWinterModBlocks.BLOCK_OF_CRYORITE.get().asItem());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_PICKAXE.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_AXE.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_SWORD.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_SHOVEL.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_HOE.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_ARMOR_CHESTPLATE.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_ARMOR_LEGGINGS.get());
				tabData.accept(AntlersOfTheWinterModItems.CRYORITE_ARMOR_BOOTS.get());
				tabData.accept(AntlersOfTheWinterModItems.FROSTBALL.get());
				tabData.accept(AntlersOfTheWinterModItems.SNOWWALKER_SPAWN_EGG.get());
				tabData.accept(AntlersOfTheWinterModBlocks.HOTHSTONE.get().asItem());
				tabData.accept(AntlersOfTheWinterModBlocks.HOTHSTONE_DIAMOND_ORE.get().asItem());
			}).withSearchBar().build());
}
