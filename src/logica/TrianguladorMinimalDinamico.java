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
public class TrianguladorMinimalDinamico {
    private Celda[][] matrizCostos;
    private Poligono  poligono;

    /**
     * Constructs ...
     *
     *
     * @param poligono
     */
    public TrianguladorMinimalDinamico(Poligono poligono) {
        this.poligono = poligono;
        matrizCostos  = new Celda[poligono.getNpoints() - 1][poligono.getNpoints()];

        // Llenar las dos ultimas filas con cero
        for (int i = 0; i < matrizCostos.length; i++) {
            for (int j = 0; j < matrizCostos[i].length; j++) {
                if (i >= poligono.getNpoints() - 3) {
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

        if (true) {
            return d;
        } else {
            d = Math.sqrt(Math.pow(poligono.getXpoints()[indexVertice1] - poligono.getXpoints()[indexVertice2], 2)
                          + Math.pow(poligono.getYpoints()[indexVertice1] - poligono.getYpoints()[indexVertice2], 2));

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
        if (matrizCostos[s - 2][i].getCosto() != -1) {
            return matrizCostos[s - 2][i].getCosto();
        } else {
            Celda minimo = new Celda(100000000, -1);

            for (int k = 1; k <= s - 2; k++) {
                double costo = calcularTriangulacion(i, k + 1) + calcularTriangulacion(i + k, s - k)
                               + Distancia(i, i + k) + Distancia(i + k, i + s - 1);

                if (costo < minimo.getCosto()) {
                    minimo = new Celda(costo, k);
                }
            }

            matrizCostos[s - 2][i] = minimo;

            return minimo.getCosto();
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
     * Set the value of matrizCostos
     *
     * @param matrizCostos new value of matrizCostos
     */
    public void setMatrizCostos(Celda[][] matrizCostos) {
        this.matrizCostos = matrizCostos;
    }

    // </editor-fold>
}
