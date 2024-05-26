
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.neoforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.grawmpy.reored.neoforge.block.SilverOreBlock;
import net.grawmpy.reored.neoforge.block.DeepslateSilverOreBlock;
import net.grawmpy.reored.neoforge.ReoredneoforgeMod;

public class ReoredneoforgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, ReoredneoforgeMod.MODID);
	public static final DeferredHolder<Block, Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final DeferredHolder<Block, Block> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", () -> new DeepslateSilverOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
