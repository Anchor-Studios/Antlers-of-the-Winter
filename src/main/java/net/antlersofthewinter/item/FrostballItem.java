
package net.antlersofthewinter.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FrostballItem extends Item {
	public FrostballItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
