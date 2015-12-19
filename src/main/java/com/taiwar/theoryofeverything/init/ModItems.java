package com.taiwar.theoryofeverything.init;

import com.taiwar.theoryofeverything.item.*;
import com.taiwar.theoryofeverything.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemFoodTTOE coffee = new ItemCoffee();
    public static final ItemDrinkTTOE coffeedrink = new ItemCoffeeDrink();
    public static final ItemTTOE qdroplet = new ItemQuantumDroplets();
    public static final ItemCoffeeCup coffeecup = new ItemCoffeeCup();

    public static void init()
    {
        GameRegistry.registerItem(coffee, "coffee");
        GameRegistry.registerItem(qdroplet, "qdroplet");
        GameRegistry.registerItem(coffeedrink, "coffeedrink");
        GameRegistry.registerItem(coffeecup, "coffeecup");
    }
}
