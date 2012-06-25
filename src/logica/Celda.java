//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: Celda.java
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


package logica;

/**
 *
 * @author gadolforl
 */
public class Celda {
    private double costo;
    private int    k;

    /**
     * Constructs ...
     *
     *
     * @param costo
     * @param k
     */
    public Celda(double costo, int k) {
        this.costo = costo;
        this.k     = k;
    }

    /**
     * Get the value of costo
     *
     * @return the value of costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Get the value of k
     *
     * @return the value of k
     */
    public int getK() {
        return k;
    }

    /**
     * Set the value of costo
     *
     * @param costo new value of costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Set the value of k
     *
     * @param k new value of k
     */
    public void setK(int k) {
        this.k = k;
    }
}
