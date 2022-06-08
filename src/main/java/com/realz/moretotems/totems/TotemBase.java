package com.realz.moretotems.totems;

import com.realz.moretotems.MoreTotems;
import com.realz.moretotems.init.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.CriterionTrigger;
import net.minecraft.advancements.critereon.UsedTotemTrigger;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraftforge.event.RegistryEvent;

public class TotemBase extends Item {

    public TotemBase() {
        super(new Item.Properties().tab(MoreTotems.TOTEMTAB).stacksTo(1).rarity(Rarity.UNCOMMON));
    }


    @Override
    public InteractionResult useOn(UseOnContext pContext){
        Player p = pContext.getPlayer();
        if(pContext.getLevel().isClientSide()){
            System.out.println(pContext.getItemInHand());

        }
        pContext.getItemInHand().hurtAndBreak(16, p,(player) -> player.broadcastBreakEvent(player.getUsedItemHand()));
        return super.useOn(pContext);
    }
}




