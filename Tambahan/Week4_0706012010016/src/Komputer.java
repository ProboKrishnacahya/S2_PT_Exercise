/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi
 */
public class Komputer {

    private String cpu = null, vga = null, psu = null, ram = null, storage = null, mobo = null;
    private int hcpu, hvga, hpsu, hram, hstorage, hmobo;
    
    public String getCpu() {
        return cpu;
    }

    public String getVGA() {
        return vga;
    }

    public String getPSU() {
        return psu;
    }

    public String getRAM() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getMobo() {
        return mobo;
    }
    
    public int gethCpu() {
        return hcpu;
    }

    public int gethVGA() {
        return hvga;
    }

    public int gethPSU() {
        return hpsu;
    }

    public int gethRAM() {
        return hram;
    }

    public int gethStorage() {
        return hstorage;
    }

    public int gethMobo() {
        return hmobo;
    }
    
    public void setCpu(String value, int avalue){
        cpu = value;
        hcpu = avalue;
    }
    
    public void setVGA(String value, int avalue){
        vga = value;
        hvga = avalue;
    }
    
    public void setPSU(String value, int avalue){
        psu = value;
        hpsu = avalue;
    }
    
    public void setRAM(String value, int avalue){
        ram = value;
        hram = avalue;
    }
    
    public void setStorage(String value, int avalue){
        storage = value;
        hstorage = avalue;
    }
    
    public void setMobo(String value, int avalue){
        mobo = value;
        hmobo = avalue;
    }
    
}
