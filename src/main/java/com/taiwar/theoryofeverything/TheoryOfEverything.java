package com.taiwar.theoryofeverything;

import com.taiwar.theoryofeverything.client.handler.KeyInputEventHandler;
import com.taiwar.theoryofeverything.handler.ConfigurationHandler;
import com.taiwar.theoryofeverything.init.ModBlocks;
import com.taiwar.theoryofeverything.init.Recipes;
import com.taiwar.theoryofeverything.reference.Reference;
import com.taiwar.theoryofeverything.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.taiwar.theoryofeverything.init.ModItems;
import com.taiwar.theoryofeverything.proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TheoryOfEverything
{
    @Mod.Instance(Reference.MOD_ID)
    public static TheoryOfEverything instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile() );
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        proxy.registerKeybindings();

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("PreInit Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();

        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        LogHelper.info("Init Complete!");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInit Complete!");
    }
}
