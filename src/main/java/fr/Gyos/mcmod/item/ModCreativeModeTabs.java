package fr.Gyos.mcmod.item;

import fr.Gyos.mcmod.mcmod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = mcmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MOD_TAB = event.registerCreativeModeTab(new ResourceLocation(mcmod.MODID, "bobux"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BOBUX.get()))
                        .title(Component.translatable("creativemodetab.bobux")));
    }
}