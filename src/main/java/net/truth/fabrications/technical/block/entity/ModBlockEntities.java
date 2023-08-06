package net.truth.fabrications.technical.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.truth.fabrications.technical.TechnicalFabrications;
import net.truth.fabrications.technical.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<CrusherBlockEntity> CRUSHER_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TechnicalFabrications.MOD_ID, "crusher_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CrusherBlockEntity::new,
                            ModBlocks.CRUSHER).build(null));

    public static void registerBlockEntities() {
        TechnicalFabrications.LOGGER.info("Registering Block Entities for " + TechnicalFabrications.MOD_ID);
    }
}
