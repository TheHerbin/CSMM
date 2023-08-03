package fr.Gyos.mcmod.datagen;

import fr.Gyos.mcmod.blocks.ModBlocks;
import fr.Gyos.mcmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BOBUX_BLOCK.get());

        add(ModBlocks.BOBUX_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BOBUX_ORE.get(), ModItems.BOBUX.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}