package com.realz.moretotems.totems;

import com.realz.moretotems.MoreTotems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class TotemBase extends Item {

    public TotemBase() {
        super(new Item.Properties().tab(MoreTotems.TOTEMTAB).stacksTo(1).rarity(Rarity.UNCOMMON));
    }

}
