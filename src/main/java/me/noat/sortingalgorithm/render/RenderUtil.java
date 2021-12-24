package me.noat.sortingalgorithm.render;

import net.minecraft.client.gui.Gui;

import java.awt.*;

public class RenderUtil {
    public static void drawRect(int x, int y, int width, int height, Color color) {
        Gui.drawRect(x, y, x + width, y + height, color.hashCode());
    }
}
