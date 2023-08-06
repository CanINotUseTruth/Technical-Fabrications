package net.truth.fabrications.technical;

import net.fabricmc.api.ModInitializer;
import net.truth.fabrications.technical.block.ModBlocks;
import net.truth.fabrications.technical.block.entity.ModBlockEntities;
import net.truth.fabrications.technical.item.ModItemGroups;
import net.truth.fabrications.technical.item.ModItems;
import net.truth.fabrications.technical.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechnicalFabrications implements ModInitializer {
    public static final String MOD_ID = "techfab";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModBlockEntities.registerBlockEntities();
        ModScreenHandlers.registerScreenHandler();

    }
}
