package me.noat.sortingalgorithm.manager;

import me.noat.sortingalgorithm.Wrapper;
import me.noat.sortingalgorithm.render.AlgorithmGui;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class EventManager {
    public EventManager() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            Wrapper.mc.displayGuiScreen(new AlgorithmGui());
        }
    }
}
