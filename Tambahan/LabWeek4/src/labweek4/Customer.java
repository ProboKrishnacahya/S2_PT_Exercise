/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek4;

import java.util.ArrayList;

/**
 *
 * @author caeciliacitra
 */
public class Customer {
    private String usernam, password;
    private ArrayList<Computer> komps = new ArrayList<Computer>();
    
    /**
     * @return the usernam
     */
    public String getUsernam() {
        return usernam;
    }

    /**
     * @param usernam the usernam to set
     */
    public void setUsernam(String usernam) {
        this.usernam = usernam;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addKomputer(Computer k){
        komps.add(k);
    }
    public void deleteKomp(int id){
        komps.remove(id);
    }
    public Computer getKomputer(int id){
        return komps.get(id);
    }
    public void updateKomputer(int id, Computer k){
        komps.set(id, k);
    }
    public int countKomputer(){
        return komps.size();
    }
    
    public void viewAllKomputers(){
        if(komps.size()>0){
            for(int i = 0; i< komps.size(); i++){
                System.out.println((i+1) + ". " + komps.get(i).getName());
            }
        }
    }
    
}
