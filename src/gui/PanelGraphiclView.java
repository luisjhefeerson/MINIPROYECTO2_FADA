//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: PanelGraphiclView.java
//
// FECHA:  25.06.12
//
// AUTORES:
//     Marx Arturo Arias - 0840247-3743
//     marxarturoariasescobar@gmail.com
//
//     Luis Jeferson Gallardo - 0843805-2711
//     luisjhefeerson@gmail.com
//
//     Fidel Herney Palacios - 0832691-3743
//     herney400@gmail.com
//
//     Gustavo Adolfo Rodriguez - 0932979-3743    
//     gustalibreros@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//*************************************************************


package gui;

//~--- non-JDK imports --------------------------------------------------------

import logica.Poligono;

import sun.font.Font2D;

//~--- JDK imports ------------------------------------------------------------

import java.awt.*;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JPanel;

/**
 *
 * @author gustavo
 */
public class PanelGraphiclView extends JPanel {
    private boolean[][] matrizDiagonales;
    private Poligono    poligono;
    private double      zoom;

    /**
     * Method description
     *
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Si existe un poligono
        if (poligono != null) {
            Graphics2D g2D = (Graphics2D) g;

            g2D.setStroke(new BasicStroke(2));
            g2D.drawPolygon(poligono);

            // Si la triangulacion ya fue calculada
            if (matrizDiagonales != null) {
                Random rand = new Random();

                for (int i = 0; i < matrizDiagonales.length; i++) {
                    for (int j = 0; j < matrizDiagonales[i].length; j++) {
                        if (matrizDiagonales[i][j]) {
                            int[] xpointss = Arrays.copyOfRange(poligono.getXpoints(), i, j + 1);
                            int[] ypointss = Arrays.copyOfRange(poligono.getYpoints(), i, j + 1);
                            int   length   = xpointss.length;

                            g2D.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
                            g2D.fillPolygon(xpointss, ypointss, length);
                        }
                    }
                }

                // Pintar Nuevamente las Lineas
                for (int i = 0; i < matrizDiagonales.length; i++) {
                    for (int j = 0; j < matrizDiagonales[i].length; j++) {
                        if (matrizDiagonales[i][j]) {
                            g2D.setColor(Color.black);
                            g2D.setStroke(new BasicStroke(2));
                            g2D.drawLine(poligono.getXpoints()[i], poligono.getYpoints()[i], poligono.getXpoints()[j],
                                         poligono.getYpoints()[j]);
                        }
                    }
                }
            }

            // Pintar las coordenadas en cada punto y los puntos
            for (int i = 0; i < poligono.getNpoints(); i++) {
                g2D.setColor(Color.red);
                g2D.fillOval(poligono.getXpoints()[i] - 5, poligono.getYpoints()[i] - 5, 10, 10);
                g2D.setColor(Color.black);
                g2D.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
                g2D.drawString("[" + poligono.getCartesianXpoints()[i] + "," + poligono.getCartesianYpoints()[i] + "]",
                               poligono.getXpoints()[i], poligono.getYpoints()[i]);
            }
        }
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
     * Get the value of zoom
     *
     * @return the value of zoom
     */
    public double getZoom() {
        return zoom;
    }

    /**
     * Method description
     *
     *
     * @param matrizCuerdas
     */
    public void setMatrizCuerdas(boolean[][] matrizCuerdas) {
        this.matrizDiagonales = matrizCuerdas;
    }

    /**
     * Set the value of poligono
     *
     * @param poligono new value of poligono
     */
    public void setPoligono(Poligono poligono) {
        this.poligono = poligono;
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
