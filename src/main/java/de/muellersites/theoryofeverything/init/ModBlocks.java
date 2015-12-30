package de.muellersites.theoryofeverything.init;

import de.muellersites.theoryofeverything.block.BlockCoffeeMachine;
import de.muellersites.theoryofeverything.block.BlockQGoop;
import de.muellersites.theoryofeverything.block.BlockTTOE;
import de.muellersites.theoryofeverything.block.BlockTileEntityTTOE;
import de.muellersites.theoryofeverything.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTTOE qgoop = new BlockQGoop();
    public static final BlockTileEntityTTOE coffeemachine = new BlockCoffeeMachine();

    public static void init()
    {
        GameRegistry.registerBlock(qgoop, "qgoop");
        GameRegistry.registerBlock(coffeemachine, "coffeemachine");
    }
}
