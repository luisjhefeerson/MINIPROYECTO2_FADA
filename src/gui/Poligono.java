/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author maraes
 */
public class Poligono {

    private String textoEnArchivo;
    private int[] Cx, Cy;

    public boolean loadFromFile(File selectedFile) {
        BufferedReader datos = null;
        String lectura;

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

    private boolean procesarFileContents() {
        StringTokenizer tokens = new StringTokenizer(textoEnArchivo);
        Cx = new int[tokens.countTokens() / 2];
        Cy = new int[tokens.countTokens() / 2];
        

        try{
        int[] x = new int[tokens.countTokens()];
        int h = 0;
        while (tokens.hasMoreElements()) {
            x[h] = Integer.parseInt(tokens.nextToken());
            h++;
        }
        int j=0, w=0;
        for (int i = 0; i < x.length; i++) {

            if ((i % 2) == 0) {
                Cx[w] = x[i];
                w++;
            }else{
                Cy[j]=x[i];
                j++;
            }
            
        }

        }catch(Exception e){
            System.err.println("no cargo archivo"+e);
            return false;
         }
         System.out.println("archivo cargado");
        return true;
    }

    public String getTextoEnArchivo() {
        return textoEnArchivo;
    }

    public int[] getCx() {
        return Cx;
    }

    public void setCx(int[] Cx) {
        this.Cx = Cx;
    }

    public int[] getCy() {
        return Cy;
    }

    public void setCy(int[] Cy) {
        this.Cy = Cy;
    }
}
