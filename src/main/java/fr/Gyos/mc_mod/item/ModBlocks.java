package fr.Gyos.mc_mod.item;

import com.ibm.icu.impl.BMPSet;
import fr.Gyos.mc_mod.mc_mod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mc_mod.MODID);

    public static final RegistryObject<Block> BOBUX_BLOCK = createBlock("bobux_block", () -> new Block(
            BlockBehaviour.Properties.of
                    (Material.METAL)
                    .destroyTime(3f)
                    .explosionResistance(80f)
                    .strength(2f,2f)));




    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier){
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
