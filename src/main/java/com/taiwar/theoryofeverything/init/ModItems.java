package com.taiwar.theoryofeverything.init;

import com.taiwar.theoryofeverything.item.ItemCoffee;
import com.taiwar.theoryofeverything.item.ItemFoodTTOE;
import com.taiwar.theoryofeverything.item.ItemQuantumDroplets;
import com.taiwar.theoryofeverything.item.ItemTTOE;
import com.taiwar.theoryofeverything.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemFoodTTOE coffee = new ItemCoffee();
    public static final ItemTTOE qdroplet = new ItemQuantumDroplets();

    public static void init()
    {
        GameRegistry.registerItem(coffee, "coffee");
        GameRegistry.registerItem(qdroplet, "qdroplet");
    }
}
