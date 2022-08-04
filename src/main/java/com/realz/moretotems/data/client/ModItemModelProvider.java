package com.realz.moretotems.data.client;

import com.realz.moretotems.MoreTotems;
import com.realz.moretotems.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MoreTotems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // items
        ModItems.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(this::registerItems);
    }

    public void registerItems(Item item) {
        String itemAsAsString = item.toString();

        if (itemAsAsString.equals(ModItems.CHICKEN_TOTEM.get().toString()))
            item(ModItems.CHICKEN_TOTEM.get().toString());
    }

    private void tool(String name) {
        getBuilder(name).parent(getExistingFile(mcLoc("item/handheld")))
                .texture("layer0", "item/" + name);
    }

    private void item(String name) {
        getBuilder(name).parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }
}
