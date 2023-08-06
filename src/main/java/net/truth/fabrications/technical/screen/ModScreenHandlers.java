package net.truth.fabrications.technical.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.truth.fabrications.technical.TechnicalFabrications;
import net.truth.fabrications.technical.screen.handlers.CrusherScreenHandler;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CrusherScreenHandler> CRUSHER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TechnicalFabrications.MOD_ID, "crusher_screen_handler"),
                    new ExtendedScreenHandlerType<>(CrusherScreenHandler::new));


    public static void registerScreenHandler() {
        TechnicalFabrications.LOGGER.info("Registering Screen Handlers for " + TechnicalFabrications.MOD_ID);
    }
}
