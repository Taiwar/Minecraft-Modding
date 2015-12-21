package com.taiwar.theoryofeverything.init;

import com.taiwar.theoryofeverything.block.BlockCoffeeMachine;
import com.taiwar.theoryofeverything.block.BlockQGoop;
import com.taiwar.theoryofeverything.block.BlockTTOE;
import com.taiwar.theoryofeverything.block.BlockTileEntityTTOE;
import com.taiwar.theoryofeverything.reference.Reference;
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
