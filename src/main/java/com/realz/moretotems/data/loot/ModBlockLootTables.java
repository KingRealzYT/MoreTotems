package com.realz.moretotems.data.loot;

import com.realz.moretotems.MoreTotems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        // Add your loot tables here
        //add()
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues()
                .stream()
                .filter(block -> MoreTotems.MOD_ID.equals(Objects
                        .requireNonNull(block.getRegistryName(), "Registry name is null for loot")
                        .getNamespace()))
                .collect(Collectors.toSet());
    }
}
