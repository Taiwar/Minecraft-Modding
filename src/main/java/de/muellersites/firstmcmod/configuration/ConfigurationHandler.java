package de.muellersites.firstmcmod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            configuration.load();

            configValue = configuration.get("Fancy Config Category", "configValue", true, "Example Config Value").getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }

        System.out.println("Config Test: " + configValue);
    }
}
