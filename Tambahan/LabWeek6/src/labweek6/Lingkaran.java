/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek6;

/**
 *
 * @author caeciliacitra
 */
public class Lingkaran implements Bangun {

    /**
     * @return the jari
     */
    public int getJari() {
        return jari;
    }

    /**
     * @param jari the jari to set
     */
    public void setJari(int jari) {
        this.jari = jari;
    }
    private int jari;
    
    @Override
    public double luas() {
        return Math.PI*jari*jari;
    }
        

    @Override
    public double keliling() {
        return Math.PI*2*jari;
    }
}
