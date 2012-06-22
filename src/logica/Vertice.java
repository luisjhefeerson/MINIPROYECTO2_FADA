//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: Vertice.java
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


package logica;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Point;

/**
 *
 * @author gadolforl
 */
public class Vertice extends Point {
    private int i;

    /**
     * Constructs ...
     *
     *
     * @param i
     * @param x
     * @param y
     */
    public Vertice(int i, int x, int y) {
        super(x, y);
        this.i = i;
    }

    /**
     * Get the value of i
     *
     * @return the value of i
     */
    public int getI() {
        return i;
    }

    /**
     * Set the value of i
     *
     * @param i new value of i
     */
    public void setI(int i) {
        this.i = i;
    }
}
