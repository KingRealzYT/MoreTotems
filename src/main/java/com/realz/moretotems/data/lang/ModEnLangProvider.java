package com.realz.moretotems.data.lang;

import com.realz.moretotems.MoreTotems;
import com.realz.moretotems.init.ModItems;
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
        add(ModItems.CHICKEN_ESSENCE.get(), "Chicken Essence");
        add(ModItems.CHICKEN_TOTEM.get(), "Chicken Totem");
        add(MoreTotems.TOTEMTAB.getDisplayName().getString(), "TotemMod | Totem Tab");
        add(MoreTotems.ESSENCETAB.getDisplayName().getString(), "TotemMod | Essence Tab");
    }

    protected <T extends Item> void item(RegistryObject<T> entry, String name) {
        add(entry.get(), name);
    }

    protected <T extends Block> void block(RegistryObject<T> entry, String name) {
        add(entry.get(), name);
    }
}
