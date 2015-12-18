package com.taiwar.theoryofeverything.block;

import com.taiwar.theoryofeverything.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCoffeeMachine extends BlockTTOE
{
    public BlockCoffeeMachine()
    {
        super();
        this.setBlockName("coffeemachine");
        this.setHardness(1F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune )
    {
        return ModItems.coffee;
    }
}
