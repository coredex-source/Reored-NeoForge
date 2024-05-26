
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.neoforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.grawmpy.reored.neoforge.ReoredneoforgeMod;

public class ReoredneoforgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReoredneoforgeMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> REORED_BLOCKS = REGISTRY.register("reored_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.reoredneoforge.reored_blocks")).icon(() -> new ItemStack(ReoredneoforgeModBlocks.SILVER_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ReoredneoforgeModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(ReoredneoforgeModBlocks.DEEPSLATE_SILVER_ORE.get().asItem());
				tabData.accept(ReoredneoforgeModItems.RAW_SILVER.get());
				tabData.accept(ReoredneoforgeModItems.SILVER_INGOT.get());
				tabData.accept(ReoredneoforgeModItems.SILVER_NUGGET.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> REORED_ARMORY = REGISTRY.register("reored_armory",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.reoredneoforge.reored_armory")).icon(() -> new ItemStack(ReoredneoforgeModItems.SILVER_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ReoredneoforgeModItems.OAK_ARMOR_HELMET.get());
				tabData.accept(ReoredneoforgeModItems.OAK_ARMOR_CHESTPLATE.get());
				tabData.accept(ReoredneoforgeModItems.OAK_ARMOR_LEGGINGS.get());
				tabData.accept(ReoredneoforgeModItems.OAK_ARMOR_BOOTS.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_SWORD.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_ARMOR_HELMET.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_ARMOR_BOOTS.get());
				tabData.accept(ReoredneoforgeModItems.SILVER_SWORD.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> REORED_TOOLS = REGISTRY.register("reored_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.reoredneoforge.reored_tools")).icon(() -> new ItemStack(ReoredneoforgeModItems.SIVER_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ReoredneoforgeModItems.COPPER_PICKAXE.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_AXE.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_SHOVEL.get());
				tabData.accept(ReoredneoforgeModItems.COPPER_HOE.get());
				tabData.accept(ReoredneoforgeModItems.SIVER_PICKAXE.get());
				tabData.accept(ReoredneoforgeModItems.SILVER_AXE.get());
				tabData.accept(ReoredneoforgeModItems.SILVER_SHOVEL.get());
				tabData.accept(ReoredneoforgeModItems.SILVER_HOE.get());
			})

					.build());
}
