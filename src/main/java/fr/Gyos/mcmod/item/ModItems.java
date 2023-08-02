package fr.Gyos.mcmod.item;

import fr.Gyos.mcmod.mcmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, mcmod.MODID);

    public static final RegistryObject<Item> BOBUX = ITEMS.register("bobux",
            () -> new Item(new Item.Properties()));


    //BOBUX TIER
    public static final TagKey<Block> BOBUX_TAG = BlockTags.create(new ResourceLocation("modid", "bobux_tag"));

    public static final Tier BOBUX_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 500, 15.0F, 5, 25, BOBUX_TAG, () -> Ingredient.of()),
            new ResourceLocation("modid", "bobux_tier"),
            List.of(Tiers.DIAMOND), List.of());

    //Weapons
    public static final RegistryObject<Item> BOBUX_SWORD = ITEMS.register("bobux_sword",
            () -> new SwordItem(BOBUX_TIER, 8, 3.5f,new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

