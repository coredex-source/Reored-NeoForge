
package net.grawmpy.reored.neoforge.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public abstract class OakArmorItem extends ArmorItem {
	public OakArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 10;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{1, 4, 4, 1}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_LOG));
			}

			@Override
			public String getName() {
				return "oak_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends OakArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "reoredneoforge:textures/models/armor/wood__layer_1.png";
		}
	}

	public static class Chestplate extends OakArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "reoredneoforge:textures/models/armor/wood__layer_1.png";
		}
	}

	public static class Leggings extends OakArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "reoredneoforge:textures/models/armor/wood__layer_2.png";
		}
	}

	public static class Boots extends OakArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "reoredneoforge:textures/models/armor/wood__layer_1.png";
		}
	}
}
