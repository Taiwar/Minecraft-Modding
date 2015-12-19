package com.taiwar.theoryofeverything.item;

import com.taiwar.theoryofeverything.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCoffeeDrink extends ItemDrinkTTOE
{
    public ItemCoffeeDrink()
    {
        super();
        this.setUnlocalizedName("coffeedrink");
        this.maxStackSize = 1;
    }

    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        if (!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 10));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 500, 4));
        }

        return stack.stackSize <= 0 ? new ItemStack(ModItems.coffeecup) : stack;
    }
}
