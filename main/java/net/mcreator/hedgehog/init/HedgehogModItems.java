
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hedgehog.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.hedgehog.HedgehogMod;

public class HedgehogModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HedgehogMod.MODID);
	public static final RegistryObject<Item> HEDGEHOG_SPAWN_EGG = REGISTRY.register("hedgehog_spawn_egg", () -> new ForgeSpawnEggItem(HedgehogModEntities.HEDGEHOG, -40096, -57630, new Item.Properties()));
}
