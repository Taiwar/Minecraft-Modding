package de.muellersites.theoryofeverything.reference;


public final class Names
{
    public static final class Blocks
    {
        public static final String COFFEE_MACHINE = "coffeemachine";

    }

    public final class Keys
    {
        public static final String CATEGORY = "keys.theoryofeverything.category";
        public static final String CHARGE = "keys.theoryofeverything.charge";
        public static final String RELEASE = "keys.theoryofeverything.release";
    }
    public static final class NBT
    {
        public static final String STATE = "teState";
        public static final String CUSTOM_NAME = "CustomName";
        public static final String DIRECTION = "teDirection";
        public static final String OWNER_UUID_MOST_SIG = "ownerUUIDMostSig";
        public static final String OWNER_UUID_LEAST_SIG = "ownerUUIDLeastSig";
        public static final String ITEMS = "Items";
    }

    public static final class Containers
    {
        public static final String VANILLA_INVENTORY = "container.inventory";
        public static final String VANILLA_CRAFTING = "container.crafting";
        public static final String COFFE_MACHINE = "container.theoryofeverything:" + Blocks.COFFEE_MACHINE;
    }
}
