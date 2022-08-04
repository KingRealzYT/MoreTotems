package com.realz.moretotems.data;

import com.realz.moretotems.MoreTotems;
import com.realz.moretotems.data.client.ModBlockStateProvider;
import com.realz.moretotems.data.client.ModItemModelProvider;
import com.realz.moretotems.data.lang.ModEnLangProvider;
import com.realz.moretotems.data.loot.ModLootTables;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MoreTotems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated.");
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModLootTables(gen));
        gen.addProvider(new ModEnLangProvider(gen));
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
    }
}
