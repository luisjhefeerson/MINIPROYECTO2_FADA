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
public class Vertice extends Point{

    public Vertice(int i, int x, int y) {
        super(x, y);
        this.i = i;
    }
 
    
    private int i;

    /**
     * Get the value of i
     *
     * @return the value of i
     */
    public int getI() {
        return i;
    }

    /**
     * Set the value of i
     *
     * @param i new value of i
     */
    public void setI(int i) {
        this.i = i;
    }

    
    
}
