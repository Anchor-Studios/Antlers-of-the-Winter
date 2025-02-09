package net.antlersofthewinter.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class SnowwalkerEntityIsHurtProcedure {
	public static boolean execute(DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return false;
		if (damagesource.is(DamageTypes.ON_FIRE) || damagesource.is(DamageTypes.LAVA) || damagesource.is(DamageTypes.FIREBALL) || damagesource.is(DamageTypes.CAMPFIRE) || damagesource.is(DamageTypes.IN_FIRE)) {
			entity.hurt(damagesource, 999);
			return true;
		} else if (damagesource.is(DamageTypes.FREEZE)) {
			return false;
		}
		return true;
	}
}
