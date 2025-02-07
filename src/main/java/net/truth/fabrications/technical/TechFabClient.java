package net.truth.fabrications.technical;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.truth.fabrications.technical.networking.ModMessages;
import net.truth.fabrications.technical.screen.ModScreenHandlers;
import net.truth.fabrications.technical.screen.screens.CrusherScreen;

public class TechFabClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModMessages.registerS2CPackets();

        HandledScreens.register(ModScreenHandlers.CRUSHER_SCREEN_HANDLER, CrusherScreen::new);
    }
}
