package com.realz.moretotems.data;

import com.realz.moretotems.MoreTotems;
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

    }
}
