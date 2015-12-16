package de.muellersites.firstmcmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.muellersites.firstmcmod.item.ItemCoffee;
import de.muellersites.firstmcmod.item.ItemFMM;

public class ModItems {
    public static final ItemFMM coffee = new ItemCoffee();

    public static void init()
    {
        GameRegistry.registerItem(coffee, "coffee");
    }
}
