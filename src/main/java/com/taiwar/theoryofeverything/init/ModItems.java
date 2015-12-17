package com.taiwar.theoryofeverything.init;

import com.taiwar.theoryofeverything.item.ItemCoffee;
import com.taiwar.theoryofeverything.item.ItemFMM;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemFMM coffee = new ItemCoffee();

    public static void init()
    {
        GameRegistry.registerItem(coffee, "coffee");
    }
}
