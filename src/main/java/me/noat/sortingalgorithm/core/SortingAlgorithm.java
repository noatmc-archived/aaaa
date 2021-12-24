package me.noat.sortingalgorithm.core;

import me.noat.sortingalgorithm.manager.EventManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = SortingAlgorithm.MOD_ID,
        name = SortingAlgorithm.MOD_NAME,
        version = SortingAlgorithm.VERSION
)
public class SortingAlgorithm {

    public static final String MOD_ID = "sortingalgorithm";
    public static final String MOD_NAME = "Sorting Algorithm";
    public static final String VERSION = "1.0-SNAPSHOT";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static SortingAlgorithm INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        new EventManager();
        System.out.println("initialized :D, have fun!");
    }
}
