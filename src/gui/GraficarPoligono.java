//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: GraficarPoligono.java
//
// FECHA:  22.06.12
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

//~--- JDK imports ------------------------------------------------------------

import java.awt.Graphics;

/**
 *
 * @author Marx
 */
public class GraficarPoligono {

    /**
     * Constructs ...
     *
     */
    public GraficarPoligono() {}

    /**
     * Method description
     *
     *
     * @param graphics
     * @param x
     * @param y
     * @param Cx
     * @param Cy
     */
    static void poligono(Graphics graphics, int x, int y, int[] Cx, int[] Cy) {
        graphics.drawPolygon(Cx, Cy, Cx.length);
    }
}
