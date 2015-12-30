package de.muellersites.theoryofeverything.client.handler;

import de.muellersites.theoryofeverything.client.settings.Keybindings;
import de.muellersites.theoryofeverything.reference.Key;
import de.muellersites.theoryofeverything.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed()){
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        if (getPressedKeybinding()==Key.RELEASE)
        {
            LogHelper.info("RELEASE Key pressed!");
        }
    }
}
