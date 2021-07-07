/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek6;

import java.util.ArrayList;
import java.util.Scanner;
import sun.print.PeekGraphics;

/**
 *
 * @author caeciliacitra
 */
public class Game {
    private ArrayList<Bangun> cols = new ArrayList<Bangun>();
    private int highScore =0;
    public void run(){
        int level = 1;
        int max = 3;
        int score = 0;
        int life = 3;
        int target = 0;
        int choose=3;
        
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("+ GEOMETERY COVERED MASTER +");
        System.out.println("++++++++++++++++++++++++++++");
        while(life >0 && choose <4 ){
            if (choose == 3){
                int plus = 0;
                while(plus==0){
                    plus = (int) (Math.random()*100);
                }
                target += plus;
            }
            System.out.println("Level : "+ level + " | Life : " + life + " | Score : "+ score);
            System.out.println("=================================");
            System.out.println("Target Area Covered : " + target);
            System.out.println("Shape CollectionsL " + cols.size() + " (max:"+max+")");
            System.out.println("Choowse : 1) Add Collection | 2) Remove Collection | 3) Hit | 4) End Game :");
            Scanner scan = new Scanner(System.in);
            choose = scan.nextInt();
            if(choose == 1){
                String more = "";
                do{
                    if(cols.size()>=max){
                        System.out.println("Collecton reaches limits. Cannot add more");
                        more = "";
                    }else{
                        
                        scan = new Scanner(System.in);
                        System.out.println("== New shape ==");
                        System.out.println("1. Circle");
                        System.out.println("2. Rectangle");
                        System.out.println("3. Right Trianle");
                        System.out.println("Choose");
                        int n = scan.nextInt();

                        switch(n){
                            case 1:
                                Lingkaran c = new Lingkaran();
                                System.out.println("Circle radius");
                                c.setJari(scan.nextInt());
                                cols.add(c);
                                break;
                            case 2:
                                Persegi r = new Persegi();
                                System.out.println("Rectangle's Width :");
                                r.setLebar(scan.nextInt());
                                System.out.println("Rectangle's Length :");
                                r.setPanjang(scan.nextInt());
                                cols.add(r);
                                break;
                            case 3:
                                Segitiga t = new Segitiga();
                                System.out.println("Triangle's Width :");
                                t.setAlas(scan.nextInt());
                                System.out.println("Triangle's Height : ");
                                t.setTinggi(scan.nextInt());
                                cols.add(t);
                                break;
                        }
                        System.out.println("New shape is added to your collection");
                        System.out.println("Add agian (Y/N) ?");
                        more = scan.next();
                    }
                }while(cols.size()<= max && more.equalsIgnoreCase("y"));
                
            }else if(choose==2){
                String more = "y";
                while(cols.size()>0 && more.equalsIgnoreCase("y")){
                    scan = new Scanner(System.in);
                    System.out.println("== REemove  Shape ==");
                    for(int i = 0; i < cols.size(); i++){
                        Bangun b = cols.get(i);
                        if(b instanceof Segitiga){
                            Segitiga s = (Segitiga) b;
                            System.out.println((i+1) + ". Right Triangle {w=" + s.getAlas() +
                                    " | h="+ s.getTinggi()+")");
                        }else if(b instanceof Persegi){
                            Persegi s = (Persegi) b;
                            System.out.println((i+1) + ". Rectangle {w=" + s.getLebar() +
                                    " | h="+ s.getPanjang()+")");
                        }else{
                            Lingkaran s = (Lingkaran) b;
                            System.out.println((i+1) + ". Circle {r=" + + s.getJari()+")");
                        }

                    }
                    System.out.println("Remove : ");
                    int id = scan.nextInt() - 1;
                    System.out.println("");
                    cols.remove(id);
                    System.out.println("That shape is removed from your collection");
                    System.out.println("Remove more (Y/N) ? ");
                    more = scan.next();
                }
                
            }else if(choose == 3){
                System.out.println("== HIT !!");
                double area=0, perimeter = 0;
                for(Bangun b : cols){
                    area += b.luas();
                    perimeter += b.keliling();
                }
                if(area < target ){
                    System.out.println("YOU LOSE !!");
                    System.out.println("Youar area only " + area);
                    life --;
                }else{
                    System.out.println("Level Up !!");
                    level ++;
                    max += 2;
                    score = (int) (score + perimeter - (area-target));
                }
            }
            System.out.println("");
        }
        
    }
}
