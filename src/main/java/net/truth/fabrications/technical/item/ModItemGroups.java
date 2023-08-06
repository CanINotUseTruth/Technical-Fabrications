package net.truth.fabrications.technical.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.truth.fabrications.technical.TechnicalFabrications;
import net.truth.fabrications.technical.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TECH_FAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TechnicalFabrications.MOD_ID, "creative_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup." + TechnicalFabrications.MOD_ID))
                    .icon(() -> new ItemStack(ModBlocks.CRUSHER)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CRUSHER);
                    }).build());

    public static void registerItemGroups() {

    }
}
