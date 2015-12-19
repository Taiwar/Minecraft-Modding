package com.taiwar.theoryofeverything.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addSmelting(new ItemStack(ModItems.coffeecupraw), new ItemStack(ModItems.coffeecup), 10f);
        GameRegistry.addRecipe(new ItemStack(ModItems.coffeecupraw), "   ", "s s", " s ", 's', new ItemStack(Items.clay_ball));
        GameRegistry.addRecipe(new ItemStack(ModItems.speculo), " ss","  s"," ss", 's', new ItemStack(Items.cookie));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.qgoop), "   ", "ss ", "ss ", 's', new ItemStack(ModItems.qdroplet));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coffeedrink), new ItemStack(ModItems.coffeecup), new ItemStack(Items.coal));
    }
}
