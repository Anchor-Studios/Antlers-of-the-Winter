
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.antlersofthewinter.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.antlersofthewinter.AntlersOfTheWinterMod;

public class AntlersOfTheWinterModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, AntlersOfTheWinterMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> HOTH_MUSIC = REGISTRY.register("hoth.music", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("antlers_of_the_winter", "hoth.music")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HOTH_AMBIENT = REGISTRY.register("hoth.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("antlers_of_the_winter", "hoth.ambient")));
}
