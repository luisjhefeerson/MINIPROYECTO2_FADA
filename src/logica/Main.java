//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: Main.java
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

/**
 *
 * @author gadolforl
 */
public class Main {

    /**
     * Method description
     *
     *
     * @param args
     */
    public static void main(String args[]) {
        Vertice[] vertices = new Vertice[7];

        vertices[0] = new Vertice(0, 0, 10);
        vertices[1] = new Vertice(1, 0, 20);
        vertices[2] = new Vertice(2, 8, 26);
        vertices[3] = new Vertice(3, 15, 26);
        vertices[4] = new Vertice(4, 27, 21);
        vertices[5] = new Vertice(5, 22, 12);
        vertices[6] = new Vertice(6, 10, 0);

        Poligono                    poligono     = new Poligono(vertices, 7);
        TrianguladorMinimalDinamico triangulador = new TrianguladorMinimalDinamico(poligono);

        System.out.print("Costo de triangulacion Minimal: " + triangulador.calcularTriangulacion(0, 7));
    }
}
