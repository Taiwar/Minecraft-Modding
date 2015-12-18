package com.taiwar.theoryofeverything.block;


import net.minecraft.block.material.Material;

public class BlockQGoop extends BlockTTOE
{
    public BlockQGoop()
    {
        super(Material.rock);
        this.setBlockName("qgoop");
        this.setHardness(0.01F);
        this.setHarvestLevel("pickaxe", 2);
    }
}
