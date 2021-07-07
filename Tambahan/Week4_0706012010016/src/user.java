
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafi
 */
public class user {

    private ArrayList<Komputer> komRak = new ArrayList<Komputer>();

    private String username, password;

    public String getUser() {
        return username;
    }

    public String getPwd() {
        return password;
    }

    public void setUser(String value) {
        username = value;
    }

    public void setPwd(String value) {
        password = value;
    }

    //Access
    public void addKomputer(Komputer kom) {
        komRak.add(kom);
    }

    //R/W
    public int getSizeKom(){
        return komRak.size();
    }
    
    public Komputer getKom(int index) {
        return komRak.get(index);
    }

    public void deleteKom(int index) {
        komRak.remove(index);
    }

    public void ubahKom(int index, Komputer kom) {
        komRak.set(index, kom);
    }

    public int tharga(int value) {
        int sumHarga = 0;
        Komputer kom = komRak.get(value);
        sumHarga = kom.gethCpu() + kom.gethMobo() + kom.gethPSU() + kom.gethRAM() + kom.gethStorage() + kom.gethVGA();
        return sumHarga;
    }

    public void lihatKomputer() {
        for (int i = 0; i < komRak.size(); i++) {
            Komputer kom = komRak.get(i);
            System.out.println(" ");
            System.out.println("+++ " + "Komputer " + (i + 1) + " +++");
            System.out.println("CPU : " + kom.getCpu() + " [ Harga : " + kom.gethCpu() + " ]");
            System.out.println("Motherboard : " + kom.getMobo() + " [ Harga : " + kom.gethMobo() + " ]");
            System.out.println("RAM : " + kom.getRAM() + " [ Harga : " + kom.gethRAM() + " ]");
            System.out.println("VGA : " + kom.getVGA() + " [ Harga : " + kom.gethVGA() + " ]");
            System.out.println("PSU : " + kom.getPSU() + " [ Harga : " + kom.gethPSU() + " ]");
            System.out.println("Storage : " + kom.getStorage() + " [ Harga : " + kom.gethStorage() + " ]");
            System.out.println("Total Harga : " + "Rp." + tharga(i));
        }
    }

    public void jumlahKomputer() {
        for (int i = 0; i < komRak.size(); i++) {
            Komputer kom = komRak.get(i);
            System.out.println((i + 1) + ". " + "Komputer " + (i + 1));
        }
    }
}
