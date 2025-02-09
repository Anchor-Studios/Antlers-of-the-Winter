
package net.antlersofthewinter.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CryoriteItem extends Item {
	public CryoriteItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
