package com.realz.moretotems.data.lang;

import com.realz.moretotems.MoreTotems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ModEnLangProvider extends LanguageProvider {
    public ModEnLangProvider(DataGenerator gen) {
        super(gen, MoreTotems.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

    }

    protected <T extends Item> void item(RegistryObject<T> entry, String name) {
        add(entry.get(), name);
    }

    protected <T extends Block> void block(RegistryObject<T> entry, String name) {
        add(entry.get(), name);
    }
}
