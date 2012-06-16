/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Point;

/**
 *
 * @author gadolforl
 */
public class TriangulacionMinimalDinamica {

    private Celda[][] matrizCostos;
    private Poligono poligono;

    public TriangulacionMinimalDinamica(Poligono poligono) {

        this.poligono = poligono;

        matrizCostos = new Celda[poligono.getnVertices() - 1][poligono.getnVertices()];

        // Llenar las dos ultimas filas con cero
        for (int i = 0; i < matrizCostos.length; i++) {
            for (int j = 0; j < matrizCostos[i].length; j++) {
                if (i >= poligono.getnVertices() - 3) {
                    matrizCostos[i][j] = new Celda(0, -1);
                } else {
                    matrizCostos[i][j] = new Celda(-1, -1);
                }
            }
        }

    }

    public double calcularTriangulacion(int i, int s) {

        if (matrizCostos[s - 2][i].getCosto() != -1) {
            return matrizCostos[s - 2][i].getCosto();
        } else {
            Celda minimo = new Celda(100000000, -1);
            for (int k = 1; k <= s - 2; k++) {
                double costo = calcularTriangulacion(i, k + 1)
                        + calcularTriangulacion(i + k, s - k)
                        + Distancia(poligono.getVertices()[i], poligono.getVertices()[i + k])
                        + Distancia(poligono.getVertices()[i + k], poligono.getVertices()[i + s - 1]);

                if (costo < minimo.getCosto()) {
                    minimo = new Celda(costo, k);
                }
            }
            matrizCostos[s - 2][i] = minimo;
            return minimo.getCosto();
        }
    }

    public double Distancia(Vertice vertice1, Vertice vertice2) {
        double d = 0;
        Vertice v1 = vertice1;
        Vertice v2 = vertice2;
        if ((v1.getI() + 1) == v2.getI() || (v2.getI() + 1) == v1.getI() || (v1.getI() == poligono.getnVertices() && v2.getI() == 0) || (v2.getI() == poligono.getnVertices() && v1.getI() == 0)) {
            return d;
        } else {
            d = Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) + Math.pow(v1.getY() - v2.getY(), 2));
            return d;
        }
    }

    //<editor-fold defaultstate="collapsed" desc="GETTERS AND SETTERS">
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
    //</editor-fold>
}
