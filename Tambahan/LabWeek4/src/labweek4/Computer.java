/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek4;

/**
 *
 * @author caeciliacitra
 */
public class Computer {
    private CPU cpu;
    private Motherboard mb;
    private VGA vga;
    private RAM ram;
    private PSU psu;
    private Storage disk;
    private int harga;
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the cpu
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * @param cpu the cpu to set
     */
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    /**
     * @return the mb
     */
    public Motherboard getMb() {
        return mb;
    }

    /**
     * @param mb the mb to set
     */
    public void setMb(Motherboard mb) {
        this.mb = mb;
    }

    /**
     * @return the vga
     */
    public VGA getVga() {
        return vga;
    }

    /**
     * @param vga the vga to set
     */
    public void setVga(VGA vga) {
        this.vga = vga;
    }

    /**
     * @return the ram
     */
    public RAM getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(RAM ram) {
        this.ram = ram;
    }

    /**
     * @return the psu
     */
    public PSU getPsu() {
        return psu;
    }

    /**
     * @param psu the psu to set
     */
    public void setPsu(PSU psu) {
        this.psu = psu;
    }

    /**
     * @return the disk
     */
    public Storage getDisk() {
        return disk;
    }

    /**
     * @param disk the disk to set
     */
    public void setDisk(Storage disk) {
        this.disk = disk;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void viewAllComponents(){
        if(cpu !=null)
        System.out.println("1. CPU          : " + cpu.getName()+" ("+ cpu.getHarga()+" USD)");
        else
            System.out.println("1. CPU          :");
        if(mb!=null)
        System.out.println("2. Motherbboard :" + mb.getName()+" ("+ mb.getHarga()+" USD)");
        else
            System.out.println("2. Motherboard :");
        if(ram !=null)
        System.out.println("3. VGA          :" + ram.getName()+" ("+ ram.getHarga()+" USD)");
        else
            System.out.println("3. RAM           :");
        if(vga!=null)
        System.out.println("4. VGA          :" + vga.getName()+" ("+ vga.getHarga()+" USD)");
        else
            System.out.println("4. VGA           :");
        if(psu!=null)
        System.out.println("5. PSU          :" + psu.getName()+" ("+ psu.getHarga()+" USD)");
        else
            System.out.println("5. PSU            :");
        if(disk!=null)
        System.out.println("6. Storage      :" + disk.getName()+" ("+ disk.getHarga()+" USD)");
        else
            System.out.println("6. Storage      :");
        System.out.println("Total Harga Komputer : "+ harga + " USD");
    }
    
    
}
