package com.realz.moretotems.totems;

import com.realz.moretotems.MoreTotems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SimpleFoiledItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import java.util.ArrayList;
import java.util.List;

public class ChickenTotem extends SimpleFoiledItem {

    public ChickenTotem() {
        super(new Item.Properties().tab(MoreTotems.TOTEMTAB).stacksTo(1).rarity(Rarity.UNCOMMON));
    }

    boolean chickenActive = false;


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player p, InteractionHand pUsedHand) {
        chickenActive = !chickenActive;

        if (!p.getCooldowns().isOnCooldown(this)) {

            Chicken chicken;

            for (int j = 0; j < 10; ++j) {
                chicken = EntityType.CHICKEN.create(p.level);
                chicken.setAge(-24000);
                chicken.moveTo(p.getX(), p.getY(), p.getZ(), p.getYRot(), 0.0F);
                p.level.addFreshEntity(chicken);

            }


            p.getCooldowns().addCooldown(this, 200);
            InteractionResultHolder.success(p.getItemInHand(p.getUsedItemHand()));
        }
        InteractionResultHolder.fail(Minecraft.getInstance().player.getItemInHand(p.getUsedItemHand()));
        return super.use(pLevel, p, pUsedHand);
    }
}
