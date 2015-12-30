package de.muellersites.theoryofeverything;

import de.muellersites.theoryofeverything.client.handler.KeyInputEventHandler;
import de.muellersites.theoryofeverything.handler.ConfigurationHandler;
import de.muellersites.theoryofeverything.init.ModBlocks;
import de.muellersites.theoryofeverything.init.Recipes;
import de.muellersites.theoryofeverything.init.TileEntities;
import de.muellersites.theoryofeverything.reference.Reference;
import de.muellersites.theoryofeverything.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.muellersites.theoryofeverything.init.ModItems;
import de.muellersites.theoryofeverything.proxy.IProxy;

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

        TileEntities.init();

        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        LogHelper.info("Init Complete!");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInit Complete!");
    }
}
