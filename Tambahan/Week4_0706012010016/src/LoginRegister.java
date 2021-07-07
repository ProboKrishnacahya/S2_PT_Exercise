
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafi
 */
public class LoginRegister {
    private ArrayList<user> usrRak = new ArrayList<user>();
    
    public user run(){
        user usr = null;
        while(usr == null){
            System.out.println("================");
            System.out.println("LOGIN / REGISTER");
            System.out.println("================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Pilih : ");
            Scanner scan = new Scanner(System.in);
            int pilih = scan.nextInt();
            if (pilih == 1) {
                register();
            }else{
                usr = login();
                if(usr == null){
                    System.out.println("Login Invalid !!, Please Try Again!!");
                }
            }
        }
        return usr;
    }
    
    public void register(){
        Scanner regis = new Scanner(System.in);
        System.out.println("=====   Register   =====");
        System.out.print("Username : ");
        String user = regis.next();
        System.out.print("Password : ");
        String pwd = regis.next();
        user newUser = new user();
        newUser.setUser(user);
        newUser.setPwd(pwd);
        usrRak.add(newUser);
    }
    
    public user login(){
        Scanner login = new Scanner(System.in);
        System.out.println("=====   Login   =====");
        System.out.print("Username : ");
        String user = login.next();
        System.out.print("Password : ");
        String pwd = login.next();
        for(int i = 0; i < usrRak.size(); i++){
            user usr = usrRak.get(i);
            if(usr.getUser().equals(user) && usr.getPwd().equals(pwd)){
                return usr;
            }
        }
        return null;
    }
    
}
