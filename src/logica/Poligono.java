//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: Poligono.java
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.StringTokenizer;

/**
 *
 * @author gadolforl
 */
public class Poligono {
    private int[]     Cx, Cy;
    private int       nVertices;
    private String    textoEnArchivo;
    private Vertice[] vertices;

    /**
     * Constructs ...
     *
     */
    public Poligono() {}

    /**
     * Constructs ...
     *
     *
     * @param vertices
     * @param nVertices
     */
    public Poligono(Vertice[] vertices, int nVertices) {
        this.vertices  = vertices;
        this.nVertices = nVertices;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int getnVertices() {
        return nVertices;
    }

    /**
     * Method description
     *
     *
     * @param selectedFile
     *
     * @return
     */
    public boolean loadFromFile(File selectedFile) {
        BufferedReader datos = null;
        String         lectura;

        try {
            datos = new BufferedReader(new FileReader(selectedFile));

            StringBuffer bufer = new StringBuffer();

            while ((lectura = datos.readLine()) != null) {
                bufer.append(lectura + "\n");
            }

            textoEnArchivo = bufer.toString();

            return procesarFileContents();
        } catch (IOException ex) {
            System.out.println(ex.toString());

            return false;
        }
    }

    /**
     * Method description
     *
     *
     * @return
     */
    private boolean procesarFileContents() {
        StringTokenizer tokens = new StringTokenizer(textoEnArchivo);

        Cx = new int[tokens.countTokens() / 2];
        Cy = new int[tokens.countTokens() / 2];

        try {
            int[] x = new int[tokens.countTokens()];
            int   h = 0;

            while (tokens.hasMoreElements()) {
                x[h] = Integer.parseInt(tokens.nextToken());
                h++;
            }

            int j = 0,
                w = 0;

            for (int i = 0; i < x.length; i++) {
                if ((i % 2) == 0) {
                    Cx[w] = x[i];
                    w++;
                } else {
                    Cy[j] = x[i];
                    j++;
                }
            }
        } catch (Exception e) {
            System.err.println("no cargo archivo" + e);

            return false;
        }

        System.out.println("archivo cargado");

        return true;
    }

    /**
     * Method description
     *
     *
     * @param nVertices
     */
    public void setnVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int[] getCx() {
        return Cx;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int[] getCy() {
        return Cy;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public String getTextoEnArchivo() {
        return textoEnArchivo;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public Vertice[] getVertices() {
        return vertices;
    }

    /**
     * Method description
     *
     *
     * @param Cx
     */
    public void setCx(int[] Cx) {
        this.Cx = Cx;
    }

    /**
     * Method description
     *
     *
     * @param Cy
     */
    public void setCy(int[] Cy) {
        this.Cy = Cy;
    }

    /**
     * Method description
     *
     *
     * @param textoEnArchivo
     */
    public void setTextoEnArchivo(String textoEnArchivo) {
        this.textoEnArchivo = textoEnArchivo;
    }

    /**
     * Method description
     *
     *
     * @param vertices
     */
    public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }
}
