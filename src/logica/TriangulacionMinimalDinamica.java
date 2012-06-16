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

    private Point[] vertices;
    private int nVertices;
    private Celda[][] matrizCostos;

    public TriangulacionMinimalDinamica() {
    }

    public TriangulacionMinimalDinamica(Point[] vertices, int nVertices) {
        
        this.vertices = vertices;
        this.nVertices = nVertices;
        
        matrizCostos = new Celda[nVertices-1][nVertices];
        
        // Llenar las dos ultimas filas con cero
        for (int i = nVertices-3; i < nVertices-1; i++) {
            for (int j = 0; j < nVertices; j++) {
                matrizCostos[i][j]= new Celda(0,-1);
            }
        }
        
    }

    public double calcularTriangulacion(int i, int s){
        
        Celda[] costosParciales = new Celda[s-2];
        for (int k = 1; k <= s-2; k++) {
            
            
        }
        
        
        return 0;
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
    public Point[] getVertices() {
        return vertices;
    }

    /**
     * Set the value of vertices
     *
     * @param vertices new value of vertices
     */
    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }
    
    public double Distancia(Point vertice1, Point vertice2,int ka){
        
        double d;
        Point v1=vertice1;
        Point v2=vertice2;
        int k=ka;
        if(k==1 || k=s-2){
            d=0;
        }else{
            
        }
        
        
        return d;
    }
}
