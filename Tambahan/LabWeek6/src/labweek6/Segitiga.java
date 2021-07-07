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
public class Segitiga implements Bangun {

    /**
     * @return the alas
     */
    public int getAlas() {
        return alas;
    }

    /**
     * @param alas the alas to set
     */
    public void setAlas(int alas) {
        this.alas = alas;
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    private int alas, tinggi;

    @Override
    public double luas() {
        return 0.5*getAlas()*getTinggi();
    }

    @Override
    public double keliling() {
        double slope = Math.sqrt((getAlas()*getAlas())+(getTinggi()*getTinggi()));
        return getAlas() + getTinggi() + slope;
    }
    
}
