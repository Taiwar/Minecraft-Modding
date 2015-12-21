package com.taiwar.theoryofeverything.init;

import com.taiwar.theoryofeverything.reference.Names;
import com.taiwar.theoryofeverything.tileentity.TileEntityCoffeeMachine;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityCoffeeMachine.class , Names.Blocks.COFFEE_MACHINE);
    }
}
