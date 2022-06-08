package com.realz.moretotems.totems;

import com.realz.moretotems.MoreTotems;
import com.realz.moretotems.init.ModItems;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;

public class chickenTotem extends Item {

    public chickenTotem() {
        super(new Item.Properties().tab(MoreTotems.TOTEMTAB).stacksTo(1).rarity(Rarity.UNCOMMON));
    }



}
