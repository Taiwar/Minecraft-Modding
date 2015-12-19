package com.taiwar.theoryofeverything.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.coffee), "   ","s s"," s ", 's', "stickWood"));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.qgoop), "   ", "ss ", "ss ", 's', new ItemStack(ModItems.qdroplet));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coffeedrink), new ItemStack(ModItems.coffeecup), new ItemStack(Items.coal));
    }
}
