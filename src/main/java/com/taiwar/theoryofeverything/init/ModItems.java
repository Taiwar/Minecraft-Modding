package com.taiwar.theoryofeverything.init;

import com.taiwar.theoryofeverything.item.ItemCoffee;
import com.taiwar.theoryofeverything.item.ItemTTOE;
import com.taiwar.theoryofeverything.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemTTOE coffee = new ItemCoffee();

    public static void init()
    {
        GameRegistry.registerItem(coffee, "coffee");
    }
}
