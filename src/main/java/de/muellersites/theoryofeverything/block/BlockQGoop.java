package de.muellersites.theoryofeverything.block;

import de.muellersites.theoryofeverything.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockQGoop extends BlockTTOE
{
    public BlockQGoop()
    {
        super();
        this.setBlockName("qgoop");
        this.setHardness(1F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune )
    {
        return ModItems.qdroplet;
    }
}
