package com.realz.moretotems.init;

import com.realz.moretotems.MoreTotems;
import com.realz.moretotems.essence.EssenceBase;
import com.realz.moretotems.totems.TotemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreTotems.MOD_ID);

    // Mob Essence
    public static final RegistryObject<Item> CHICKEN_ESSENCE = ITEMS.register("chicken_essence", EssenceBase::new);

    // Totems
    public static final RegistryObject<Item> CHICKEN_TOTEM = ITEMS.register("chicken_totem", TotemBase::new);

}
