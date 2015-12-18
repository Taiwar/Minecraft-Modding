package com.taiwar.theoryofeverything.item;

public class ItemCoffee extends ItemFoodTTOE
{
    public ItemCoffee()
    {
        super(10, 2, true);
        this.setUnlocalizedName("coffee");
        this.maxStackSize = 16;
    }
}
