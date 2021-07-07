/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caeciliacitra
 */
public class LoginRegister {
    private ArrayList<Customer> custRak = new ArrayList<Customer>();
    
    public Customer run(){
        Customer cust = null;
        while(cust ==null){
            System.out.println("===============");
            System.out.println("LOGIN/ REGISTER");
            System.out.println("===============");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("Pilih : ");
            Scanner scan = new Scanner(System.in);
            int pilih = scan.nextInt();
            if(pilih == 1){
                register();
            }else{
                cust = login();
                if(cust ==null){
                    System.out.println("Login Invalid!! Please Try Again");
                }
            }
        }
        return cust;
    }
    public void register(){
        System.out.println("===Register===");
        Scanner scan = new Scanner(System.in);
        System.out.print("Username : ");
        String username = scan.next();
        System.out.print("Password : ");
        String pwd = scan.next();
        Customer newCust = new Customer();
        newCust.setUsernam(username);
        newCust.setPassword(pwd);
        custRak.add(newCust);
        
    }
    
    public Customer login(){
        System.out.println("===Login===");
        Scanner scan = new Scanner(System.in);
        System.out.print("Username : ");
        String username = scan.next();
        System.out.print("Password : ");
        String pwd = scan.next();
        for(int i=0; i<custRak.size(); i++){
            Customer cust = custRak.get(i);
            if(cust.getUsernam().equals(username) && cust.getPassword().equals(pwd)){
                return cust;
            }
        }
        return null;
    }
    
}
