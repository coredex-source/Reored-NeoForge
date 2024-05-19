
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.neoforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.grawmpy.reored.neoforge.item.OakArmorItem;
import net.grawmpy.reored.neoforge.item.CopperSwordItem;
import net.grawmpy.reored.neoforge.item.CopperShovelItem;
import net.grawmpy.reored.neoforge.item.CopperPickaxeItem;
import net.grawmpy.reored.neoforge.item.CopperHoeItem;
import net.grawmpy.reored.neoforge.item.CopperAxeItem;
import net.grawmpy.reored.neoforge.item.CopperArmorItem;
import net.grawmpy.reored.neoforge.ReoredneoforgeMod;

public class ReoredneoforgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ReoredneoforgeMod.MODID);
	public static final DeferredHolder<Item, Item> OAK_ARMOR_HELMET = REGISTRY.register("oak_armor_helmet", () -> new OakArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> OAK_ARMOR_CHESTPLATE = REGISTRY.register("oak_armor_chestplate", () -> new OakArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> OAK_ARMOR_LEGGINGS = REGISTRY.register("oak_armor_leggings", () -> new OakArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> OAK_ARMOR_BOOTS = REGISTRY.register("oak_armor_boots", () -> new OakArmorItem.Boots());
	public static final DeferredHolder<Item, Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final DeferredHolder<Item, Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final DeferredHolder<Item, Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final DeferredHolder<Item, Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final DeferredHolder<Item, Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final DeferredHolder<Item, Item> SILVER_ORE = block(ReoredneoforgeModBlocks.SILVER_ORE);
	public static final DeferredHolder<Item, Item> DEEPSLATE_SILVER_ORE = block(ReoredneoforgeModBlocks.DEEPSLATE_SILVER_ORE);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}