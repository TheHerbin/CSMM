package fr.Gyos.mc_mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(mc_mod.MODID)
public class mc_mod {
    public static final String MODID = "mc_mod";

    public mc_mod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void setup(FMLCommonSetupEvent e){

    }

    private void clientSetup(FMLClientSetupEvent e){

    }

}
