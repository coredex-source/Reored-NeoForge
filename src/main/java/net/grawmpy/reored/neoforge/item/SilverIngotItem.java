
package net.grawmpy.reored.neoforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilverIngotItem extends Item {
	public SilverIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
