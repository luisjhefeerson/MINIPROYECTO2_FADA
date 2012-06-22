/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
