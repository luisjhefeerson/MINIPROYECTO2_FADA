/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;
import logica.Poligono;

/**
 *
 * @author gustavo
 */
public class PanelGraphiclView extends JPanel {

    private double zoom;
    private Poligono poligono;

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
                g2D.drawString("(" + poligono.getCartesianXpoints()[i] + "," + poligono.getCartesianYpoints()[i] + ")", poligono.getXpoints()[i], poligono.getYpoints()[i]);
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
