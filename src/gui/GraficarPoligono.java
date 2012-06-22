/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;

/**
 *
 * @author Marx
 */
public class GraficarPoligono {

    public GraficarPoligono() {
    }

    static void poligono(Graphics graphics, int x, int y, int[] Cx, int[] Cy) {
        graphics.drawPolygon(Cx, Cy, Cx.length);
    }

    
}
