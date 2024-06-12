
package net.grawmpy.reored.neoforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.grawmpy.reored.neoforge.init.ReoredneoforgeModItems;

public class DeepIronPickaxeItem extends PickaxeItem {
	public DeepIronPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReoredneoforgeModItems.DEEP_IRON_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
