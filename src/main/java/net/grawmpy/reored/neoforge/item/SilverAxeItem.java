
package net.grawmpy.reored.neoforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.grawmpy.reored.neoforge.init.ReoredneoforgeModItems;

public class SilverAxeItem extends AxeItem {
	public SilverAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 550;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReoredneoforgeModItems.SILVER_INGOT.get()));
			}
		}, 1, -3.05f, new Item.Properties());
	}
}
