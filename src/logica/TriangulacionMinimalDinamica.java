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

    private int nVertices;
    private Celda[][] matrizCostos;
    private Vertice[] vertices;

    public TriangulacionMinimalDinamica() {
    }

    public TriangulacionMinimalDinamica(Vertice[] vertices, int nVertices) {

        this.vertices = vertices;
        this.nVertices = nVertices;

        matrizCostos = new Celda[nVertices - 1][nVertices];

        // Llenar las dos ultimas filas con cero
        for (int i = 0; i < nVertices - 1; i++) {
            for (int j = 0; j < nVertices; j++) {
                if (i>=nVertices-3) {
                    matrizCostos[i][j] = new Celda(0, -1);
                }else{
                    matrizCostos[i][j] = new Celda(-1, -1);
                }
            }
        }

    }

    public double calcularTriangulacion(int i, int s) {

        if (matrizCostos[s-2][i].getCosto()!=-1) {
            return matrizCostos[s - 2][i].getCosto();
        } else {
            Celda minimo = new Celda(100000000, -1);
            for (int k = 1; k <= s - 2; k++) {
                double costo = calcularTriangulacion(i, k + 1)
                        + calcularTriangulacion(i + k, s - k)
                        + Distancia(vertices[i], vertices[i + k])
                        + Distancia(vertices[i + k], vertices[i + s - 1]);

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
        if ((v1.getI() + 1) == v2.getI() || (v2.getI() + 1) == v1.getI() || (v1.getI() == vertices.length && v2.getI() == 0) || (v2.getI() == vertices.length && v1.getI() == 0)) {
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

    /**
     * Get the value of nVertices
     *
     * @return the value of nVertices
     */
    public int getNVertices() {
        return nVertices;
    }

    /**
     * Set the value of nVertices
     *
     * @param nVertices new value of nVertices
     */
    public void setNVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    /**
     * Get the value of vertices
     *
     * @return the value of vertices
     */
    public Vertice[] getVertices() {
        return vertices;
    }

    /**
     * Set the value of vertices
     *
     * @param vertices new value of vertices
     */
    public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }
    //</editor-fold>
}
