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
public class MainApps {
    Customer cust;
    ArrayList<VGA> availVGA = new ArrayList<VGA>();
    ArrayList<Motherboard> availMB = new ArrayList<Motherboard>();
    ArrayList<CPU> availCPU = new ArrayList<CPU>();
    ArrayList<RAM> availRAM = new ArrayList<RAM>();
    ArrayList<PSU> availPSU = new ArrayList<PSU>();
    ArrayList<Storage> availStorage = new ArrayList<Storage>();
    
    public MainApps(){
        //set komponen2 yang dimiliki toko
        CPU cpu = new CPU();
        cpu.setName("Intel i9 9900K");
        cpu.setHarga(2000);
        availCPU.add(cpu);
        cpu = new CPU();
        cpu.setName("Ryzen 5 5800X");
        cpu.setHarga(2100);
        availCPU.add(cpu);

        Motherboard mb = new Motherboard();
        mb.setName("Asus Motherboard B460 / B550");
        mb.setHarga(1200);
        availMB.add(mb);
        mb = new Motherboard();
        mb.setName("MSI Motherboard B460 / B550");
        mb.setHarga(1200);
        availMB.add(mb);

        RAM ram = new RAM();
        ram.setName("Corsair Dominator RGB 16GB");
        ram.setHarga(1000);
        availRAM.add(ram);
        ram = new RAM();
        ram.setName("G.Skill TridentZ RGB  16GB");
        ram.setHarga(1000);
        availRAM.add(ram);
        ram = new RAM();
        ram.setName("Klevv Crash RGB 16GB");
        ram.setHarga(1000);
        availRAM.add(ram);

        VGA vga = new VGA();
        vga.setName("Asus NVDIA RTX 2070 ROG STRIX");
        vga.setHarga(2800);
        availVGA.add(vga);
        vga = new VGA();
        vga.setName("MSI RTX 2070 Gaming X");
        vga.setHarga(2700);
        availVGA.add(vga);

                vga = new VGA();
        vga.setName("Zotac RX 5700 XT");
        vga.setHarga(3000);
        availVGA.add(vga);

                vga = new VGA();
        vga.setName("Sapphire RX 5700 XT");
        vga.setHarga(2500);
        availVGA.add(vga);

        PSU psu = new PSU();
        psu.setName("Corsair 650 W Modular");
        psu.setHarga(800);
        availPSU.add(psu);
        psu = new PSU();
        psu.setName("Cooler Master 650 W Modular");
        psu.setHarga(900);
        availPSU.add(psu);

        Storage st = new Storage();
        st.setName("SPG Spectrix SSD NVME 2TB");
        st.setHarga(700);
        availStorage.add(st);
        st = new Storage();
        st.setName("Gigabyte Aourus SSD NVME 2TB");
        st.setHarga(690);
        availStorage.add(st);

        LoginRegister lr = new LoginRegister();
        cust = lr.run();

    }
    
    public void run(){
       int pilih = 0;
       while(pilih < 4){
           System.out.println("===========");
           System.out.println("ANJAY APPS");
           System.out.println("===========");
           System.out.println("1. Rakit Komputer Baru");
           System.out.println("2. Lihat Daftar Komputerku");
           System.out.println("3. Upgrade/Ubah Komputerku");
           System.out.println("4. Logout");
           System.out.print("Pilih : ");
           Scanner scan = new Scanner(System.in);
           pilih = scan.nextInt();
           switch(pilih){
               case 1:
                   newComp();
                   break;
               case 2:
                   System.out.println("=== Lihat Daftar Komputerku ===");
                   cust.viewAllKomputers();
                   System.out.println("Lhat Detil Komp no: ");
                   int no = scan.nextInt();
                   cust.getKomputer(no).viewAllComponents();
                   break;
               case 3:
                   System.out.println("=== Upgrade/Ubah Komputerku ===");
                   cust.viewAllKomputers();
                   System.out.println("Ubah komputer Komp no: ");
                    no = scan.nextInt();
                   Computer comp = cust.getKomputer(no);
                   comp = changeComponent(no, comp);
                   break;
                   
           }
           

       }
    }
    
    private void newComp(){
        int pilih = -1;
        Computer comp = new Computer();
        while(pilih !=0){
            System.out.println("=== Rakit Komputer Baru ===");
            System.out.println("1. Pilih Komponen");
            System.out.println("2. Ganti Komponen");
            System.out.println("3. Buang Komponen");
            System.out.println("4. Rakit Komputer");
            System.out.println("0. Kembali");
            System.out.print("Pilih : ");
            Scanner scan = new Scanner(System.in);
            pilih = scan.nextInt();
            switch(pilih){
                case 1:
                    comp = showComponentsOption(comp);
                    break;
                case 2:
                    int choose = -1;
                    while(choose != 0){
                        System.out.println("++ Ganti Komponen ++");
                        comp.viewAllComponents();
                        System.out.println("0. Kembali");
                        System.out.print("Pilih : ");
                        choose = scan.nextInt();
                        comp = changeComponent(choose, comp);
                    }
                    break;
                case 3:
                    choose = -1;
                    while(choose != 0){
                        System.out.println("++ Buang Komponen ++");
                        comp.viewAllComponents();
                        System.out.println("0. Kembali");
                        System.out.print("Pilih : ");
                        choose = scan.nextInt();
                        switch(choose){
                            case 1:
                                comp.setHarga(comp.getHarga()-comp.getCpu().getHarga());
                                comp.setCpu(null);
                                System.out.println("CPU telah dibuang");
                                break;
                            case 2:
                                comp.setHarga(comp.getHarga()-comp.getMb().getHarga());
                                comp.setMb(null);
                                System.out.println("Motherboard telah dibuang");
                                break;
                            case 3:
                                comp.setHarga(comp.getHarga()-comp.getRam().getHarga());
                                comp.setRam(null);
                                System.out.println("RAM telah dibuang");
                                break;
                            case 4:
                                comp.setHarga(comp.getHarga()-comp.getVga().getHarga());
                                comp.setVga(null);
                                System.out.println("VGA telah dibuang");
                                break;
                            case 5:
                                comp.setHarga(comp.getHarga()-comp.getPsu().getHarga());
                                comp.setVga(null);
                                System.out.println("VGA telah dibuang");
                                break;
                            case 6:
                                comp.setHarga(comp.getHarga()-comp.getDisk().getHarga());
                                comp.setDisk(null);
                                System.out.println("Storage telah dibuang");
                                break;
                        }
                    }
                    break;
                case 4:
                    if(comp.getCpu()!= null && comp.getMb() != null && comp.getRam()!= null
                            && comp.getPsu()!=null && comp.getDisk()!=null){
                        System.out.println("Komputer telah berhasil dirakit");
                        cust.addKomputer(comp);
                    }
                    break;
            }
        }

    }
    
    private Computer changeComponent(int id, Computer c){
        int choose;
        int n=0,old =0;
        Scanner scan = new Scanner(System.in);
        switch(id){
                case 1:
                    System.out.println("Ganti CPU dengan");
                    CPU cpu=null;
                    for(int i=0; i<availCPU.size();i++){
                        cpu= availCPU.get(i);
                        if(!cpu.getName().equals(c.getCpu().getName())){
                            n++;
                            System.out.println((i+1)+". " + cpu.getName() +
                                    "("+ cpu.getHarga()+" USD)");
                        }else{
                            old = i;
                        }
                     }
                    choose = scan.nextInt();
                    if(choose < old){
                      cpu = availCPU.get(choose-1);
                              
                    }else{
                        cpu = availCPU.get(choose);
                    }
                    c.setHarga(c.getHarga()-c.getCpu().getHarga()+cpu.getHarga());
                    c.setCpu(cpu);
                    System.out.println("CPU telah diganti dengan "+ cpu.getName());
                    break;
                case 2:
                    System.out.println("Ganti Motherboard dengan");
                    Motherboard mb=null;
                    for(int i=0; i<availMB.size();i++){
                        mb= availMB.get(i);
                        if(!mb.getName().equals(c.getMb().getName())){
                            n++;
                            System.out.println((i+1)+". " + mb.getName() +
                                    "("+ mb.getHarga()+" USD)");
                        }else{
                            old = i;
                        }
                     }
                    choose = scan.nextInt();
                    if(choose < old){
                      mb = availMB.get(choose-1);
                              
                    }else{
                        mb = availMB.get(choose);
                    }
                    c.setHarga(c.getHarga()-c.getMb().getHarga()+mb.getHarga());
                    c.setMb(mb);
                    
                    System.out.println("Motherbard telah diganti dengan "+ mb.getName());
                    break;
                case 3:
                    System.out.println("Ganti RAM dengan");
                    RAM ram=null;
                    for(int i=0; i<availRAM.size();i++){
                        ram = availRAM.get(i);
                        if(!ram.getName().equals(c.getRam().getName())){
                            n++;
                            System.out.println((i+1)+". " + ram.getName() +
                                    "("+ ram.getHarga()+" USD)");
                        }else{
                            old = i;
                        }
                     }
                    choose = scan.nextInt();
                    if(choose < old){
                      ram = availRAM.get(choose-1);
                              
                    }else{
                        ram = availRAM.get(choose);
                    }                    
                    c.setHarga(c.getHarga()-c.getRam().getHarga()+ram.getHarga());
                    c.setRam(ram);
                    
                    System.out.println("RAM telah diganti dengan "+ ram.getName());
                    break;
                case 4:
                    System.out.println("Ganti VGA dengan");
                    VGA vga=null;
                    for(int i=0; i<availVGA.size();i++){
                        vga= availVGA.get(i);
                        if(!vga.getName().equals(c.getVga().getName())){
                            n++;
                            System.out.println((i+1)+". " + vga.getName() +
                                    "("+ vga.getHarga()+" USD)");
                        }else{
                            old = i;
                        }
                     }
                    choose = scan.nextInt();
                    if(choose < old){
                      vga = availVGA.get(choose-1);
                              
                    }else{
                        vga = availVGA.get(choose);
                    }
                    c.setHarga(c.getHarga()-c.getVga().getHarga()+vga.getHarga());
                    c.setVga(vga);
                    
                    System.out.println("VGA telah diganti dengan "+ vga.getName());
                    break;
                case 5:
                    System.out.println("Ganti PSU dengan");
                    PSU psu =null;
                    for(int i=0; i<availPSU.size();i++){
                        psu = availPSU.get(i);
                        if(!psu.getName().equals(c.getPsu().getName())){
                            n++;
                            System.out.println((i+1)+". " + psu.getName() +
                                    "("+ psu.getHarga()+" USD)");
                        }else{
                            old = i;
                        }
                     }
                    choose = scan.nextInt();
                    if(choose < old){
                      psu = availPSU.get(choose-1);
                              
                    }else{
                        psu = availPSU.get(choose);
                    }
                    c.setHarga(c.getHarga()-c.getPsu().getHarga()+psu.getHarga());
                    c.setPsu(psu);
                    
                    System.out.println("PSU telah diganti dengan "+ psu.getName());
                    break;
                case 6:
                    System.out.println("Ganti Storage dengan");
                    Storage st =null;
                    for(int i=0; i<availStorage.size();i++){
                        st = availStorage.get(i);
                        if(!st.getName().equals(c.getDisk().getName())){
                            n++;
                            System.out.println((i+1)+". " + st.getName() +
                                    "("+ st.getHarga()+" USD)");
                        }else{
                            old = i;
                        }
                     }
                    choose = scan.nextInt();
                    if(choose < old){
                      st = availStorage.get(choose-1);
                              
                    }else{
                        st = availStorage.get(choose);
                    }
                    c.setHarga(c.getHarga()-c.getDisk().getHarga()+st.getHarga());
                    c.setDisk(st);
                    System.out.println("Storage telah diganti dengan "+ st.getName());
                    break;
            }
        return c;
    }
    
    private Computer showComponentsOption(Computer c){
        int pilih = -1;
        while(pilih !=0){
            System.out.println("++ Pilih Komponen ++");
            System.out.println("1. CPU");
            System.out.println("2. Motherboard");
            System.out.println("3. RAM");
            System.out.println("4. VGA");
            System.out.println("5. PSU");
            System.out.println("6. Storage");
            System.out.println("0. Kembali");
            System.out.print("Pilih : ");
            Scanner scan = new Scanner(System.in);
            pilih = scan.nextInt();
            int choose;
            switch(pilih){
                case 1:
                    CPU cpu=null;
                    for(int i=0; i<availCPU.size();i++){
                        cpu= availCPU.get(i);
                        System.out.println((i+1)+". " + cpu.getName() + "("+ cpu.getHarga()+" USD)");
                    }
                    choose = scan.nextInt();
                    cpu = availCPU.get(choose-1);
                    c.setCpu(cpu);
                    c.setHarga(c.getHarga()+cpu.getHarga());
                    break;
                case 2:
                    Motherboard mb=null;
                    for(int i=0; i<availMB.size();i++){
                        mb= availMB.get(i);
                        System.out.println((i+1)+". " + mb.getName() + "("+ mb.getHarga()+" USD)");
                    }
                    choose = scan.nextInt();
                    mb = availMB.get(choose-1);
                    c.setMb(mb);
                    c.setHarga(c.getHarga()+mb.getHarga());
                    break;
                case 3:
                    RAM ram=null;
                    for(int i=0; i<availRAM.size();i++){
                        ram = availRAM.get(i);
                        System.out.println((i+1)+". " + ram.getName() + "("+ ram.getHarga()+" USD)");
                    }
                    choose = scan.nextInt();
                    ram = availRAM.get(choose-1);
                    c.setRam(ram);
                    c.setHarga(c.getHarga()+ram.getHarga());
                    break;
                case 4:
                    VGA vga=null;
                    for(int i=0; i<availVGA.size();i++){
                        vga= availVGA.get(i);
                        System.out.println((i+1)+". " + vga.getName() + "("+ vga.getHarga()+" USD)");
                    }
                    choose = scan.nextInt();
                    vga = availVGA.get(choose-1);
                    c.setVga(vga);
                    c.setHarga(c.getHarga()+vga.getHarga());
                    break;
                case 5:
                    PSU psu =null;
                    for(int i=0; i<availPSU.size();i++){
                        psu = availPSU.get(i);
                        System.out.println((i+1)+". " + psu.getName() + "("+ psu.getHarga()+" USD)");
                    }
                    choose = scan.nextInt();
                    psu = availPSU.get(choose-1);
                    c.setPsu(psu);
                    c.setHarga(c.getHarga()+psu.getHarga());
                    break;
                case 6:
                    Storage st =null;
                    for(int i=0; i<availStorage.size();i++){
                        st = availStorage.get(i);
                        System.out.println((i+1)+". " + st.getName() + "("+ st.getHarga()+" USD)");
                    }
                    choose = scan.nextInt();
                    st = availStorage.get(choose-1);
                    c.setDisk(st);
                    c.setHarga(c.getHarga()+st.getHarga());
                    break;
            }

        }
        return c;
    }
    
}