/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JPanel;
import logica.Poligono;

/**
 *
 * @author gustavo
 */
public class PanelGraphiclView extends JPanel {

    private double zoom;
    private Poligono poligono;
    private boolean[][] matrizCuerdas;

    public void setMatrizCuerdas(boolean[][] matrizCuerdas) {
        this.matrizCuerdas = matrizCuerdas;
    }

    /**
     * Get the value of poligono
     *
     * @return the value of poligono
     */
    public Poligono getPoligono() {
        return poligono;
    }

    /**
     * Set the value of poligono
     *
     * @param poligono new value of poligono
     */
    public void setPoligono(Poligono poligono) {
        this.poligono = poligono;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (poligono != null) {
            Graphics2D g2D = (Graphics2D) g;
            g2D.drawPolygon(poligono);

            for (int i = 0; i < poligono.getNpoints(); i++) {
                //g2D.drawString("(" + poligono.getCartesianXpoints()[i] + "," + poligono.getCartesianYpoints()[i] + ")", poligono.getXpoints()[i], poligono.getYpoints()[i]);
            }
            if (matrizCuerdas!=null) {
                
                Random rand = new Random();
                
                for (int i = 0; i < matrizCuerdas.length; i++) {
                    for (int j = 0; j < matrizCuerdas[i].length; j++) {
                        if (matrizCuerdas[i][j]) {
                            
                            System.out.println("i: "+i);
                            System.out.println("j: "+j);
                            System.out.println("ENTRO");
                            
                            int[] xpointss=Arrays.copyOfRange(poligono.getXpoints(), i,j+1);
                            int[] ypointss=Arrays.copyOfRange(poligono.getYpoints(), i,j+1);
                            int length = xpointss.length;
                            
                            for (int k = 0; k < xpointss.length; k++) {
                                System.out.println("x: "+xpointss[k]+" y: "+ypointss[k]);
                            }
                            
                            g2D.drawPolygon(xpointss,ypointss,length);
                            
                            g2D.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
                            
                            g2D.fillPolygon(xpointss, ypointss, length);
                            
                        }
                    }
                }
            }
        }

    }

    /**
     * Get the value of zoom
     *
     * @return the value of zoom
     */
    public double getZoom() {
        return zoom;
    }

    /**
     * Set the value of zoom
     *
     * @param zoom new value of zoom
     */
    public void setZoom(double zoom) {
        this.zoom = zoom;
    }
}
