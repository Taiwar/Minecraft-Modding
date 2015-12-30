package de.muellersites.theoryofeverything.init;

import de.muellersites.theoryofeverything.reference.Names;
import de.muellersites.theoryofeverything.tileentity.TileEntityCoffeeMachine;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityCoffeeMachine.class , Names.Blocks.COFFEE_MACHINE);
    }
}
