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

import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author gadolforl
 */
public class Poligono extends Polygon {
    private String textoEnArchivo;

    /**
     * Constructs ...
     *
     */
    public Poligono() {}

    /**
     * Constructs ...
     *
     *
     * @param xpoints
     * @param ypoints
     * @param npoints
     */
    public Poligono(int[] xpoints, int[] ypoints, int npoints) {
        super(xpoints, ypoints, npoints);
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

        npoints = tokens.countTokens() / 2;
        xpoints = new int[npoints];
        ypoints = new int[npoints];

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
                    xpoints[w] = x[i];
                    w++;
                } else {
                    ypoints[j] = x[i];
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
     * @return
     */
    public int getNpoints() {
        return npoints;
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
    public int[] getXpoints() {
        return xpoints;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int[] getYpoints() {
        return ypoints;
    }

    /**
     * Method description
     *
     *
     * @param npoints
     */
    public void setNpoints(int npoints) {
        this.npoints = npoints;
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
     * @param xpoints
     */
    public void setXpoints(int[] xpoints) {
        this.xpoints = xpoints;
    }

    /**
     * Method description
     *
     *
     * @param ypoints
     */
    public void setYpoints(int[] ypoints) {
        this.ypoints = ypoints;
    }
}
