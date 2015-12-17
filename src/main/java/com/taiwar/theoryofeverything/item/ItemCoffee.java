package com.taiwar.theoryofeverything.item;

import com.taiwar.theoryofeverything.creativetab.CreativeTabTTOE;

public class ItemCoffee extends ItemTTOE
{
    public ItemCoffee()
    {
        super();
        this.setUnlocalizedName("coffee");
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabTTOE.TTOE_TAB);
    }
}
