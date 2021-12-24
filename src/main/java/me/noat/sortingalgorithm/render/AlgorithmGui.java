package me.noat.sortingalgorithm.render;

import me.noat.sortingalgorithm.helper.Data;
import me.noat.sortingalgorithm.helper.DataComparator;
import net.minecraft.client.gui.GuiScreen;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class AlgorithmGui extends GuiScreen {
    ArrayList<Data> arrays = new ArrayList<>();
    ArrayList<Data> goodOne = new ArrayList<>();

    public AlgorithmGui() {
        // arrays registeration
        for (int i = 0;i<=500;i++) {
            double copeharder=ThreadLocalRandom.current().nextDouble(400);
            arrays.add(new Data(copeharder));
            goodOne.add(new Data(copeharder));
            System.out.println("[added: " + copeharder + "]");
        }
    }
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        RenderUtil.drawRect(20, 20, 550, 450, new Color(15, 15, 15, 255));
        // RenderUtil.drawRect(30, 30, 500, 400, new Color(0, 0, 0, 255));
        if (arrays.isEmpty()) {
            mc.fontRenderer.drawString("this is a certified bruh moment", 30, 30, new Color(255, 255, 255, 255).hashCode());
        } else {
            for (int i = 0; i <= 500; i++) {
                try {
                    RenderUtil.drawRect(40 + i, 40, 1, (int) Math.floor(arrays.get(i).data), new Color(255, 255, 255, 120));
                } catch (Exception e) {
                    mc.player.sendChatMessage("this is a certified bruh moment");
                }
            }
            goodOne.sort(new DataComparator());
            for (int i = 0; i <= 500; i++) {
                try {
                    RenderUtil.drawRect(40, 40, 1, (int) Math.floor(goodOne.get(i).data), new Color(255, 255, 255, 200));
                } catch (Exception e) {
                    mc.player.sendChatMessage("this is a certified bruh moment");
                }
            }
        }
    }
}
