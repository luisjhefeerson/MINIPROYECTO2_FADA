//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: TrianguladorMinimalDinamico.java
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

//~--- JDK imports ------------------------------------------------------------

import java.awt.Point;

/**
 *
 * @author gadolforl
 */
public class TrianguladorMinimalDinamico {
    private Celda[][]   matrizCostos;
    private boolean[][] matrizCuerdas;
    private Poligono    poligono;

    /**
     * Constructs ...
     *
     *
     * @param poligono
     */
    public TrianguladorMinimalDinamico(Poligono poligono) {
        this.poligono = poligono;
        matrizCostos  = new Celda[poligono.getNpoints() - 1][poligono.getNpoints()];
        matrizCuerdas = new boolean[poligono.getNpoints()][poligono.getNpoints()];

        for (int i = 0; i < poligono.getNpoints(); i++) {
            for (int j = 0; j < poligono.getNpoints(); j++) {
                matrizCuerdas[i][j] = false;
            }
        }

        // Inicializacion de la matriz con las dos primeras filas en cero
        // -1 es el valor a utilizar cuando una celda no tiene valor o k!
        for (int i = 0; i < matrizCostos.length; i++) {
            for (int j = 0; j < matrizCostos[i].length; j++) {
                if (i < 2) {
                    matrizCostos[i][j] = new Celda(0, -1);
                } else {
                    matrizCostos[i][j] = new Celda(-1, -1);
                }

            }

        }
    }

    /**
     * Method description
     *
     *
     *
     * @param indexVertice1
     * @param indexVertice2
     *
     * @return
     */
    public double Distancia(int indexVertice1, int indexVertice2) {
        double d = 0;

        if ((Math.abs(indexVertice1 - indexVertice2) == 1)
                || ((indexVertice1 == 0) && (indexVertice2 == poligono.getNpoints() - 1))
                || ((indexVertice2 == 0) && (indexVertice1 == poligono.getNpoints() - 1))) {
            return d;
        } else {
            d = Math.sqrt(
                Math.pow(
                    poligono.getCartesianXpoints()[indexVertice1] - poligono.getCartesianXpoints()[indexVertice2],
                    2) + Math.pow(
                        poligono.getCartesianYpoints()[indexVertice1] - poligono.getCartesianYpoints()[indexVertice2],
                        2));

            return d;
        }
    }

    /**
     * Method description
     *
     *
     * @param i
     * @param s
     *
     * @return
     */
    public double calcularTriangulacion(int i, int s) {

        // Es necesario saber si el valor ya fue calculado
        if (matrizCostos[s - 2][i].getCosto() != -1) {

            return matrizCostos[s - 2][i].getCosto();
        }                                                                              // Si no esta se calcula!
                else {
            Celda minimo = new Celda(100000000, -1);

            for (int k = 1; k <= s - 2; k++) {

                double costo = calcularTriangulacion(i, k + 1) + calcularTriangulacion(i + k, s - k)
                               + Distancia(i, i + k) + Distancia(i + k, i + s - 1);    // Revisar

                if (costo < minimo.getCosto()) {
                    minimo = new Celda(costo, k);
                }
            }

            matrizCostos[s - 2][i] = minimo;

            return minimo.getCosto();
        }
    }

    /**
     * Method description
     *
     *
     * @param i
     * @param s
     */
    public void construirSolucionOptima(int i, int s) {

        // Sacar el k
        int k = matrizCostos[s - 2][i].getK();

        if (k != -1) {
            if (k != 1) {
                matrizCuerdas[i][i + k] = true;
            }

            if (k != s - 2) {
                matrizCuerdas[i + k][i + s - 1] = true;
            }

            construirSolucionOptima(i, k + 1);
            construirSolucionOptima(i + k, s - k);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="GETTERS AND SETTERS">

    /**
     * Get the value of matrizCostos
     *
     * @return the value of matrizCostos
     */
    public Celda[][] getMatrizCostos() {
        return matrizCostos;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public boolean[][] getMatrizCuerdas() {
        return matrizCuerdas;
    }

    /**
     * Set the value of matrizCostos
     *
     * @param matrizCostos new value of matrizCostos
     */
    public void setMatrizCostos(Celda[][] matrizCostos) {
        this.matrizCostos = matrizCostos;
    }

    /**
     * Method description
     *
     *
     * @param matrizCuerdas
     */
    public void setMatrizCuerdas(boolean[][] matrizCuerdas) {
        this.matrizCuerdas = matrizCuerdas;
    }

    // </editor-fold>
}
