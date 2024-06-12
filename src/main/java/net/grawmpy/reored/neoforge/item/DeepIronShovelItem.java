
package net.grawmpy.reored.neoforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.grawmpy.reored.neoforge.init.ReoredneoforgeModItems;

public class DeepIronShovelItem extends ShovelItem {
	public DeepIronShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReoredneoforgeModItems.DEEP_IRON_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
