
package net.grawmpy.reored.neoforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.grawmpy.reored.neoforge.init.ReoredneoforgeModItems;

public class SiverPickaxeItem extends PickaxeItem {
	public SiverPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 550;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ReoredneoforgeModItems.SILVER_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
