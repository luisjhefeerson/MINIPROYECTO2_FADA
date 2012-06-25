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
import java.awt.Polygon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author gadolforl
 */
public class Poligono extends Polygon {
    int[]          cartesianXpoints;
    int[]          cartesianYpoints;
    double         cx, cy;
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
     * @param cartesianXpoints
     * @param cartesianYpoints
     * @param npoints
     */
    public Poligono(int[] cartesianXpoints, int[] cartesianYpoints, int npoints) {
        super();
        this.npoints          = npoints;
        this.cartesianXpoints = cartesianXpoints;
        this.cartesianYpoints = cartesianYpoints;
        centroCartesiano();
        convertirPuntosCartesianos(this.cartesianXpoints, this.cartesianYpoints);
    }

    /**
     * Method description
     *
     */
    private void centroCartesiano() {
        double xMin = FuncionesAuxiliares.getMinValue(cartesianXpoints);
        double xMax = FuncionesAuxiliares.getMaxValue(cartesianYpoints);
        double yMin = FuncionesAuxiliares.getMinValue(cartesianXpoints);
        double yMax = FuncionesAuxiliares.getMaxValue(cartesianYpoints);

        cx = (xMax + xMin) / 2;
        cy = (yMax + yMin) / 2;
        System.out.println("Centro cartesiano: x" + cx + " Y: " + cy);
    }

    /**
     * Method description
     *
     *
     * @param cartesianXpoints
     * @param cartesianYpoints
     */
    private void convertirPuntosCartesianos(int[] cartesianXpoints, int[] cartesianYpoints) {

        // Encontrar el Xmin y el Y max
        int xMin = FuncionesAuxiliares.getMinValue(cartesianXpoints);
        int yMax = FuncionesAuxiliares.getMaxValue(cartesianYpoints);

        xpoints = new int[npoints];
        ypoints = new int[npoints];
        System.out.println("Convirtiendo coordenadas cartesianas a AWT");

        for (int i = 0; i < ypoints.length; i++) {
            xpoints[i] = cartesianXpoints[i] - xMin;
            ypoints[i] = yMax - cartesianYpoints[i];
            System.out.println("x: " + xpoints[i] + " y: " + ypoints[i]);
        }
    }

    /**
     * Method description
     *
     *
     * @param zoom
     */
    public void escalarAWT(int zoom) {
        System.out.println("PUNTOS CON ZOOM:" + zoom);

        int[] copyCartisianX = new int[npoints];
        int[] copyCartisianY = new int[npoints];

        for (int i = 0; i < npoints; i++) {
            copyCartisianX[i] = cartesianXpoints[i];
            copyCartisianY[i] = cartesianYpoints[i];

            // primer cuadrante
            if ((copyCartisianX[i] > cx) && (copyCartisianY[i] < cy)) {
                copyCartisianX[i] = copyCartisianX[i] + zoom;
                copyCartisianY[i] = copyCartisianY[i] - zoom;;
            }

            // segundo cuadrante
            if ((copyCartisianX[i] < cx) && (copyCartisianY[i] < cy)) {
                copyCartisianX[i] = copyCartisianX[i] - zoom;
                copyCartisianY[i] = copyCartisianY[i] - zoom;;
            }

            // tercer cuadrante
            if ((copyCartisianX[i] < cx) && (copyCartisianY[i] > cy)) {
                copyCartisianX[i] = copyCartisianX[i] - zoom;
                copyCartisianY[i] = copyCartisianY[i] + zoom;;
            }

            if ((copyCartisianX[i] > cx) && (copyCartisianY[i] > cy)) {
                copyCartisianX[i] = copyCartisianX[i] + zoom;
                copyCartisianY[i] = copyCartisianY[i] + zoom;;
            }

            System.out.println("x: " + copyCartisianX[i] + " y: " + copyCartisianY[i]);
        }

        convertirPuntosCartesianos(copyCartisianX, copyCartisianY);
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

        npoints          = tokens.countTokens() / 2;
        cartesianXpoints = new int[npoints];
        cartesianYpoints = new int[npoints];

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
                    cartesianXpoints[w] = x[i];
                    w++;
                } else {
                    cartesianYpoints[j] = x[i];
                    j++;
                }
            }

            convertirPuntosCartesianos(this.cartesianXpoints, this.cartesianYpoints);
            centroCartesiano();
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
    public int[] getCartesianXpoints() {
        return cartesianXpoints;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int[] getCartesianYpoints() {
        return cartesianYpoints;
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
     * @param cartesianXpoints
     */
    public void setCartesianXpoints(int[] cartesianXpoints) {
        this.cartesianXpoints = cartesianXpoints;
    }

    /**
     * Method description
     *
     *
     * @param cartesianYpoints
     */
    public void setCartesianYpoints(int[] cartesianYpoints) {
        this.cartesianYpoints = cartesianYpoints;
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
