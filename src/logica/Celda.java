/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author gadolforl
 */
public class Celda {

    private double costo;
    private int k;

    public Celda(double costo, int k) {
        this.costo = costo;
        this.k = k;
    }
  

    /**
     * Get the value of k
     *
     * @return the value of k
     */
    public int getK() {
        return k;
    }

    /**
     * Set the value of k
     *
     * @param k new value of k
     */
    public void setK(int k) {
        this.k = k;
    }

    /**
     * Get the value of costo
     *
     * @return the value of costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Set the value of costo
     *
     * @param costo new value of costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
}
