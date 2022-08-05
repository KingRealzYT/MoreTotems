package com.realz.moretotems.data.loot;

import com.realz.moretotems.MoreTotems;
import com.realz.moretotems.init.ModItems;
import net.minecraft.data.loot.EntityLoot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ModEntityLootTables extends EntityLoot {
    @Override
    protected void addTables() {
        add(EntityType.CHICKEN, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(ModItems.CHICKEN_ESSENCE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 0.10F)))
                .apply(LootingEnchantFunction
                        .lootingMultiplier(UniformGenerator.between(0.0F, 0.10F))))));
    }

    @Override
    protected Iterable<EntityType<?>> getKnownEntities() {
        return StreamSupport.stream(ForgeRegistries.ENTITIES.spliterator(), false)
                .filter(entry -> entry.getRegistryName() != null
                        && entry.getRegistryName().getNamespace().equals(MoreTotems.MOD_ID))
                .collect(Collectors.toSet());
    }
}
