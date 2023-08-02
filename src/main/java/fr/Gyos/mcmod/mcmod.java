package fr.Gyos.mcmod;

import com.mojang.logging.LogUtils;
import fr.Gyos.mcmod.blocks.ModBlocks;
import fr.Gyos.mcmod.item.ModCreativeModeTabs;
import fr.Gyos.mcmod.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;




@Mod(mcmod.MODID)
public class mcmod {
    public static final String MODID = "mcmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public mcmod() {


        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
        ModBlocks.register(bus);

        bus.addListener(this::commonsetup);

        MinecraftForge.EVENT_BUS.register(this);

        bus.addListener(this::addCreative);
    }
    private void commonsetup(FMLCommonSetupEvent e){

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.MOD_TAB) {
            event.accept(ModItems.BOBUX);
            event.accept(ModBlocks.BOBUX_BLOCK);
            event.accept(ModBlocks.BOBUX_ORE);
            event.accept(ModItems.BOBUX_SWORD);
        }


    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

}
