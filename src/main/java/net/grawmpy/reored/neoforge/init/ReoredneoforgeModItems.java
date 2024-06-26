
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

import net.grawmpy.reored.neoforge.item.SiverPickaxeItem;
import net.grawmpy.reored.neoforge.item.SilverSwordItem;
import net.grawmpy.reored.neoforge.item.SilverShovelItem;
import net.grawmpy.reored.neoforge.item.SilverNuggetItem;
import net.grawmpy.reored.neoforge.item.SilverIngotItem;
import net.grawmpy.reored.neoforge.item.SilverHoeItem;
import net.grawmpy.reored.neoforge.item.SilverAxeItem;
import net.grawmpy.reored.neoforge.item.SilverArmorItem;
import net.grawmpy.reored.neoforge.item.RawSilverItem;
import net.grawmpy.reored.neoforge.item.RawDeepIronItem;
import net.grawmpy.reored.neoforge.item.OakArmorItem;
import net.grawmpy.reored.neoforge.item.DeepIronSwordItem;
import net.grawmpy.reored.neoforge.item.DeepIronShovelItem;
import net.grawmpy.reored.neoforge.item.DeepIronPickaxeItem;
import net.grawmpy.reored.neoforge.item.DeepIronNuggetItem;
import net.grawmpy.reored.neoforge.item.DeepIronIngotItem;
import net.grawmpy.reored.neoforge.item.DeepIronHoeItem;
import net.grawmpy.reored.neoforge.item.DeepIronAxeItem;
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
	public static final DeferredHolder<Item, Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final DeferredHolder<Item, Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final DeferredHolder<Item, Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final DeferredHolder<Item, Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final DeferredHolder<Item, Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SiverPickaxeItem());
	public static final DeferredHolder<Item, Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final DeferredHolder<Item, Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final DeferredHolder<Item, Item> SILVER_HOE = REGISTRY.register("silver_hoe", () -> new SilverHoeItem());
	public static final DeferredHolder<Item, Item> SILVER_ARMOR_HELMET = REGISTRY.register("silver_armor_helmet", () -> new SilverArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> SILVER_ARMOR_CHESTPLATE = REGISTRY.register("silver_armor_chestplate", () -> new SilverArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> SILVER_ARMOR_LEGGINGS = REGISTRY.register("silver_armor_leggings", () -> new SilverArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> SILVER_ARMOR_BOOTS = REGISTRY.register("silver_armor_boots", () -> new SilverArmorItem.Boots());
	public static final DeferredHolder<Item, Item> DEEP_IRON_ORE = block(ReoredneoforgeModBlocks.DEEP_IRON_ORE);
	public static final DeferredHolder<Item, Item> DEEPSLATE_DEEP_IRON_ORE = block(ReoredneoforgeModBlocks.DEEPSLATE_DEEP_IRON_ORE);
	public static final DeferredHolder<Item, Item> RAW_DEEP_IRON = REGISTRY.register("raw_deep_iron", () -> new RawDeepIronItem());
	public static final DeferredHolder<Item, Item> DEEP_IRON_INGOT = REGISTRY.register("deep_iron_ingot", () -> new DeepIronIngotItem());
	public static final DeferredHolder<Item, Item> DEEP_IRON_NUGGET = REGISTRY.register("deep_iron_nugget", () -> new DeepIronNuggetItem());
	public static final DeferredHolder<Item, Item> DEEP_IRON_BLOCK = block(ReoredneoforgeModBlocks.DEEP_IRON_BLOCK);
	public static final DeferredHolder<Item, Item> DEEP_IRON_SWORD = REGISTRY.register("deep_iron_sword", () -> new DeepIronSwordItem());
	public static final DeferredHolder<Item, Item> DEEP_IRON_PICKAXE = REGISTRY.register("deep_iron_pickaxe", () -> new DeepIronPickaxeItem());
	public static final DeferredHolder<Item, Item> DEEP_IRON_AXE = REGISTRY.register("deep_iron_axe", () -> new DeepIronAxeItem());
	public static final DeferredHolder<Item, Item> DEEP_IRON_SHOVEL = REGISTRY.register("deep_iron_shovel", () -> new DeepIronShovelItem());
	public static final DeferredHolder<Item, Item> DEEP_IRON_HOE = REGISTRY.register("deep_iron_hoe", () -> new DeepIronHoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
