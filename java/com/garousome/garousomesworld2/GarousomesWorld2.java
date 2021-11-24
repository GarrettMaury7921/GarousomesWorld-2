package com.garousome.garousomesworld2;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.garousome.garousomesworld2.core.init.BlockInIt;
import com.garousome.garousomesworld2.core.init.ItemInit;
import com.garousome.garousomesworld2.world.OreGeneration;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("garousomesworld2")
public class GarousomesWorld2 {
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "garousomesworld2";
    
    public GarousomesWorld2() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	ItemInit.ITEMS.register(bus);
    	BlockInIt.BLOCKS.register(bus);
    	
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    	
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        
    }

}
