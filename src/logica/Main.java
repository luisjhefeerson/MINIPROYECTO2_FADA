/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author gadolforl
 */
public class Main {

    public static void main(String args[]) {

        Vertice[] vertices = new Vertice[7];
        vertices[0] = new Vertice(0, 0, 10);
        vertices[1] = new Vertice(1, 0, 20);
        vertices[2] = new Vertice(2, 8, 26);
        vertices[3] = new Vertice(3, 15, 26);
        vertices[4] = new Vertice(4, 27, 21);
        vertices[5] = new Vertice(5, 22, 12);
        vertices[6] = new Vertice(6, 10, 0);
        
        Poligono poligono = new Poligono(vertices, 7);
        
        TrianguladorMinimalDinamico triangulador = new TrianguladorMinimalDinamico(poligono);
        
        System.out.print("Costo de triangulacion Minimal: " +triangulador.calcularTriangulacion(0, 7));
        
    }

    
    
}
