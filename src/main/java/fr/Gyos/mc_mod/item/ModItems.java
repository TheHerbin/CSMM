package fr.Gyos.mc_mod.item;

import fr.Gyos.mc_mod.mc_mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, mc_mod.MODID);

    public static final RegistryObject<Item> BOBUX = ITEMS.register("bobux", () -> new bobux(new Item.Properties()));

}
