package de.muellersites.firstmcmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.muellersites.firstmcmod.configuration.ConfigurationHandler;
import de.muellersites.firstmcmod.proxy.IProxy;
import de.muellersites.firstmcmod.reference.Reference;

import java.sql.Ref;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class FirstMCMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static FirstMCMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile() );
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {

    }
}
