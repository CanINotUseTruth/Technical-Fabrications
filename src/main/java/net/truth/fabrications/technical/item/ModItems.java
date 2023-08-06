package net.truth.fabrications.technical.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.truth.fabrications.technical.TechnicalFabrications;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TechnicalFabrications.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TechnicalFabrications.LOGGER.info("Registering Items for " + TechnicalFabrications.MOD_ID);
    }
}
