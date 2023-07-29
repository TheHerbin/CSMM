package fr.Gyos.mc_mod.init;

import fr.Gyos.mc_mod.mc_mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, mc_mod.MODID);

    public static final RegistryObject<Item> BOBUX = Items.register("bobux", () -> new Item(new Item.Properties()));

}
