/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author gadolforl
 */
public class Poligono {

    private Vertice[] vertices;
    private int nVertices;

    public Poligono(Vertice[] vertices, int nVertices) {
        this.vertices = vertices;
        this.nVertices = nVertices;
    }

    public int getnVertices() {
        return nVertices;
    }

    public void setnVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    public Vertice[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }
}
