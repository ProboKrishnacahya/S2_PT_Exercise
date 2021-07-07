/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week03_0706012010040;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Wantonius
 */
public class Data_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sayur;
    int harga;
    int jumlah;
    
        System.out.println("****************************************");
        System.out.println("**** Masukan Sayur ke Dalam Gerobak ****");
        System.out.println("****************************************");
        System.out.print("Nama Sayur  : ");
        sayur= scan.nextLine();
        System.out.print("Harga Sayur : ");
        harga= scan.nextInt();
        System.out.println("");
        System.out.println("***** Pengingat, kamu hanya dapat membawa 18 pcs sayur *****");
        System.out.println("");
        System.out.println("Jumlah Sayur    :");
        jumlah= scan.nextInt();
        
    }
    
}
