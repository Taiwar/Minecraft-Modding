package com.taiwar.theoryofeverything.creativetab;

import com.taiwar.theoryofeverything.init.ModItems;
import com.taiwar.theoryofeverything.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTTOE
{
    public static final CreativeTabs TTOE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.qdroplet;
        }

    };
}
