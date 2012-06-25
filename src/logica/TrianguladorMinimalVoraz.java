//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: TrianguladorMinimalVoraz.java
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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gadolforl
 */
public class TrianguladorMinimalVoraz {
    private double      costoSolucion;
    private Celda[][]   matrizCostos;
    private boolean[][] matrizDiagonales;
    private Poligono    poligono;
    private int         totalDiagonales;

    /**
     * Constructs ...
     *
     *
     * @param poligono
     */
    public TrianguladorMinimalVoraz(Poligono poligono) {
        this.poligono    = poligono;
        matrizCostos     = new Celda[poligono.getNpoints() - 1][poligono.getNpoints()];
        matrizDiagonales = new boolean[poligono.getNpoints()][poligono.getNpoints()];
        totalDiagonales  = 0;
        costoSolucion    = 0;

        for (int i = 0; i < poligono.getNpoints(); i++) {
            for (int j = 0; j < poligono.getNpoints(); j++) {
                matrizDiagonales[i][j] = false;
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
            costoSolucion = matrizCostos[s - 2][i].getCosto();

            return costoSolucion;
        }                                                                                       // Si no esta se calcula!
                else {
            double distanciaMinima = 100000000;
            int    kOptimo         = -1;
            int    inicio          = 1;
            int    hasta           = s - 2;

            // Heuristica
            if (hasta > 1) {
                hasta = s - 3;
            }

            if (hasta > 2) {
                inicio = 2;
            }

            for (int k = inicio; k <= hasta; k++) {
                double distanciaMinima1 = Distancia(i, i + k) + Distancia(i + k, i + s - 1);    // Revisar

                if (distanciaMinima1 < distanciaMinima) {
                    distanciaMinima = distanciaMinima1;
                    kOptimo         = k;
                }
            }

            costoSolucion = calcularTriangulacion(i, kOptimo + 1) + calcularTriangulacion(i + kOptimo, s - kOptimo)
                            + Distancia(i, i + kOptimo) + Distancia(i + kOptimo, i + s - 1);    // Revisar
            matrizCostos[s - 2][i] = new Celda(costoSolucion, kOptimo);

            return costoSolucion;
        }
    }

    /**
     * Method description
     *
     *
     * @return
     */
    private String construirArchivoSolucion() {
        String salida = totalDiagonales + " " + costoSolucion + "\n";

        for (int i = 0; i < matrizDiagonales.length; i++) {
            for (int j = 0; j < matrizDiagonales[i].length; j++) {
                if (matrizDiagonales[i][j]) {
                    salida += poligono.getCartesianXpoints()[i] + " " + poligono.getCartesianYpoints()[i] + " ";
                    salida += poligono.getCartesianXpoints()[j] + " " + poligono.getCartesianYpoints()[j] + "\n";
                }
            }
        }

        return salida;
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
                matrizDiagonales[i][i + k] = true;
                totalDiagonales++;
            }

            if (k != s - 2) {
                matrizDiagonales[i + k][i + s - 1] = true;
                totalDiagonales++;
            }

            construirSolucionOptima(i, k + 1);
            construirSolucionOptima(i + k, s - k);
        }
    }

    /**
     * Method description
     *
     *
     * @param selectedFile
     */
    public void saveToFile(File selectedFile) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(selectedFile));
            writer.write(construirArchivoSolucion());
        } catch (IOException e) {}
        finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {}
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
        return matrizDiagonales;
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
        this.matrizDiagonales = matrizCuerdas;
    }

    // </editor-fold>
}
