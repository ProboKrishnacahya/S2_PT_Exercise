
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
public class shop {

    private user currentUser;

    public void start() {
        Scanner scan = new Scanner(System.in);
        int loop = -1;
        int loop2 = -1;
        LoginRegister lr = new LoginRegister();
        currentUser = lr.run();
        int menu = 1;
        while (menu > 0) {
            System.out.println("==========");
            System.out.println("ANJAY APPS");
            System.out.println("==========");
            System.out.println("1. Rakit Komputer Baru");
            System.out.println("2. Lihat Daftar Komputerku");
            System.out.println("3. Upgrade / Ubah Komputerku");
            System.out.println("4. Jual Komputer");
            System.out.println("5. Logout");
            System.out.print("Pilih : ");
            int pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    loop2 = -1;
                    Komputer kom = new Komputer();
                    while (loop2 < 0) {
                        System.out.println("=== Rakit Komputer Baru ===");
                        System.out.println("1. Pilih Komponen");
                        System.out.println("2. Ganti Komponen");
                        System.out.println("3. Buang Komponen");
                        System.out.println("4. Rakit Komputer");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih : ");
                        int pilih2 = scan.nextInt();
                        switch (pilih2) {
                            case 1:
                                loop = -1;
                                while (loop < 0) {
                                    System.out.println("++ Pilih Komponen ++");
                                    System.out.println("1. CPU");
                                    System.out.println("2. Motherboard");
                                    System.out.println("3. RAM");
                                    System.out.println("4. VGA");
                                    System.out.println("5. PSU");
                                    System.out.println("6. Storage");
                                    System.out.println("0. Kembali");
                                    System.out.print("Pilih : ");
                                    int pilih3 = scan.nextInt();
                                    switch (pilih3) {
                                        case 1:
                                            String cp1 = "Intel I9 9900K";
                                            int hcp1 = 6100000;
                                            String cp2 = "Ryzen 7 5800X";
                                            int hcp2 = 7500000;
                                            System.out.println("CPU :");
                                            System.out.println("1. " + cp1 + " | " + "Harga : " + hcp1);
                                            System.out.println("2. " + cp2 + " | " + "Harga : " + hcp2);
                                            System.out.print("Pilih : ");
                                            int pcpu = scan.nextInt();
                                            if (pcpu == 1) {
                                                kom.setCpu(cp1, hcp1);
                                                System.out.println("CPU " + cp1 + " telah dipilih, seharga " + hcp1);
                                            } else if (pcpu == 2) {
                                                kom.setCpu(cp2, hcp2);
                                                System.out.println("CPU " + cp2 + " telah dipilih, seharga " + hcp2);
                                            }
                                            break;
                                        case 2:
                                            String mb1 = "Asus Motherboard B460 / B550";
                                            int hmb1 = 2200000;
                                            String mb2 = "MSI Motherboard B460 / B550";
                                            int hmb2 = 2500000;
                                            System.out.println("Motherboard :");
                                            System.out.println("1. " + mb1 + " | " + "Harga : " + hmb1);
                                            System.out.println("2. " + mb2 + " | " + "Harga : " + hmb2);
                                            System.out.print("Pilih : ");
                                            int pmobo = scan.nextInt();
                                            if (pmobo == 1) {
                                                kom.setMobo(mb1, hmb1);
                                                System.out.println("Motherboard " + mb1 + " telah dipilih, seharga " + hmb1);
                                            } else if (pmobo == 2) {
                                                kom.setMobo(mb2, hmb2);
                                                System.out.println("Motherboard " + mb2 + " telah dipilih, seharga " + hmb2);
                                            }
                                            break;
                                        case 3:
                                            String rm1 = "Corsair Dominator RGB 16GB";
                                            int hrm1 = 2500000;
                                            String rm2 = "G.Skill TridentZ RGB 16GB";
                                            int hrm2 = 2100000;
                                            String rm3 = "Klevv Crash RGB 16GB";
                                            int hrm3 = 1950000;
                                            System.out.println("RAM :");
                                            System.out.println("1. " + rm1 + " | " + "Harga : " + hrm1);
                                            System.out.println("2. " + rm2 + " | " + "Harga : " + hrm2);
                                            System.out.println("3. " + rm3 + " | " + "Harga : " + hrm3);
                                            System.out.print("Pilih : ");
                                            int pram = scan.nextInt();
                                            if (pram == 1) {
                                                kom.setRAM(rm1, hrm1);
                                                System.out.println("RAM " + rm1 + " telah dipilih, seharga " + hrm1);
                                            } else if (pram == 2) {
                                                kom.setRAM(rm2, hrm2);
                                                System.out.println("RAM " + rm2 + " telah dipilih, seharga " + hrm2);
                                            } else if (pram == 3) {
                                                kom.setRAM(rm2, hrm2);
                                                System.out.println("RAM " + rm3 + " telah dipilih, seharga " + hrm3);
                                            }
                                            break;
                                        case 4:
                                            String vg1 = "Asus NVDIA RTX 2070 ROG STRIX";
                                            int hvg1 = 8950000;
                                            String vg2 = "MSI RTX 2070 Gaming X";
                                            int hvg2 = 8800000;
                                            String vg3 = "Zotac RX 5700 XT";
                                            int hvg3 = 7600000;
                                            String vg4 = "Sapphire RX 5700 XT";
                                            int hvg4 = 7450000;
                                            System.out.println("VGA :");
                                            System.out.println("1. " + vg1 + " | " + "Harga : " + hvg1);
                                            System.out.println("2. " + vg2 + " | " + "Harga : " + hvg2);
                                            System.out.println("3. " + vg3 + " | " + "Harga : " + hvg3);
                                            System.out.println("4. " + vg4 + " | " + "Harga : " + hvg4);
                                            System.out.print("Pilih : ");
                                            int pvga = scan.nextInt();
                                            if (pvga == 1) {
                                                kom.setVGA(vg1, hvg1);
                                                System.out.println("VGA " + vg1 + " telah dipilih, seharga " + hvg1);
                                            } else if (pvga == 2) {
                                                kom.setVGA(vg2, hvg2);
                                                System.out.println("VGA " + vg2 + " telah dipilih, seharga " + hvg2);
                                            } else if (pvga == 3) {
                                                kom.setVGA(vg3, hvg3);
                                                System.out.println("VGA " + vg3 + " telah dipilih, seharga " + hvg3);
                                            } else if (pvga == 4) {
                                                kom.setVGA(vg2, hvg2);
                                                System.out.println("VGA " + vg4 + " telah dipilih, seharga " + hvg4);
                                            }
                                            break;
                                        case 5:
                                            String ps1 = "Corsair 650 W Modular";
                                            int hps1 = 1375000;
                                            String ps2 = "Cooler Master 650 W Modular";
                                            int hps2 = 1300000;
                                            System.out.println("PSU :");
                                            System.out.println("1. " + ps1 + " | " + "Harga : " + hps1);
                                            System.out.println("2. " + ps2 + " | " + "Harga : " + hps2);
                                            System.out.print("Pilih : ");
                                            int ppsu = scan.nextInt();
                                            if (ppsu == 1) {
                                                kom.setPSU(ps1, hps1);
                                                System.out.println("PSU " + ps1 + " telah dipilih, seharga " + hps1);
                                            } else if (ppsu == 2) {
                                                kom.setPSU(ps2, hps2);
                                                System.out.println("PSU " + ps2 + " telah dipilih, seharga " + hps2);
                                            }
                                            break;
                                        case 6:
                                            String str1 = "SPG Spectrix SSD NVME 2TB";
                                            int hstr1 = 5252000;
                                            String str2 = "Gigabyte Aourus SSD NVME 2TB";
                                            int hstr2 = 6550000;
                                            System.out.println("Storage :");
                                            System.out.println("1. " + str1 + " | " + "Harga : " + hstr1);
                                            System.out.println("2. " + str2 + " | " + "Harga : " + hstr2);
                                            System.out.print("Pilih : ");
                                            int pstr = scan.nextInt();
                                            if (pstr == 1) {
                                                kom.setStorage(str1, hstr1);
                                                System.out.println("Storage " + str1 + " telah dipilih, seharga " + hstr1);
                                            } else if (pstr == 2) {
                                                kom.setStorage(str2, hstr2);
                                                System.out.println("Storage " + str2 + " telah dipilih, seharga " + hstr2);
                                            }
                                            break;
                                        case 0:
                                            loop = 1;
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                loop = -1;
                                while (loop < 0) {
                                    System.out.println("++ Pilih Komponen Yang Akan Diganti ++");
                                    System.out.println("1. " + "CPU: " + kom.getCpu() + " [ Harga : " + kom.gethCpu() + " ]");
                                    System.out.println("2. " + "Motherboard: " + kom.getMobo() + " [ Harga : " + kom.gethMobo() + " ]");
                                    System.out.println("3. " + "RAM: " + kom.getRAM() + " [ Harga : " + kom.gethRAM() + " ]");
                                    System.out.println("4. " + "VGA: " + kom.getVGA() + " [ Harga : " + kom.gethVGA() + " ]");
                                    System.out.println("5. " + "PSU: " + kom.getPSU() + " [ Harga : " + kom.gethPSU() + " ]");
                                    System.out.println("6. " + "Storage: " + kom.getStorage() + " [ Harga : " + kom.gethStorage() + " ]");
                                    System.out.println("0. Kembali");
                                    System.out.print("Pilih : ");
                                    int pilih3 = scan.nextInt();
                                    switch (pilih3) {
                                        case 1:
                                            if (kom.getCpu() != null) {
                                                String cp1 = "Intel I9 9900K";
                                                int hcp1 = 6100000;
                                                String cp2 = "Ryzen 7 5800X";
                                                int hcp2 = 7500000;
                                                System.out.println("CPU :");
                                                System.out.println("1. " + cp1 + " | " + "Harga : " + hcp1);
                                                System.out.println("2. " + cp2 + " | " + "Harga : " + hcp2);
                                                System.out.print("Pilih : ");
                                                int pcpu = scan.nextInt();
                                                if (pcpu == 1) {
                                                    kom.setCpu(cp1, hcp1);
                                                    System.out.println("CPU telah diganti dengan " + cp1 + ", seharga " + hcp1);
                                                } else if (pcpu == 2) {
                                                    kom.setCpu(cp2, hcp2);
                                                    System.out.println("CPU telah diganti dengan" + cp2 + ", seharga " + hcp2);
                                                }
                                                break;
                                            } else {
                                                System.out.println("Kamu belum memilih komponen, silahkan pilih komponen terlebih dahulu!");
                                                break;
                                            }
                                        case 2:
                                            if (kom.getMobo() != null) {
                                                String mb1 = "Asus Motherboard B460 / B550";
                                                int hmb1 = 2200000;
                                                String mb2 = "MSI Motherboard B460 / B550";
                                                int hmb2 = 2500000;
                                                System.out.println("Motherboard :");
                                                System.out.println("1. " + mb1 + " | " + "Harga : " + hmb1);
                                                System.out.println("2. " + mb2 + " | " + "Harga : " + hmb2);
                                                System.out.print("Pilih : ");
                                                int pmobo = scan.nextInt();
                                                if (pmobo == 1) {
                                                    kom.setMobo(mb1, hmb1);
                                                    System.out.println("Motherboard telah diganti dengan " + mb1 + ", seharga " + hmb1);
                                                } else if (pmobo == 2) {
                                                    kom.setMobo(mb2, hmb2);
                                                    System.out.println("Motherboard telah diganti dengan " + mb2 + ", seharga " + hmb2);
                                                }
                                            } else {
                                                System.out.println("Kamu belum memilih komponen, silahkan pilih komponen terlebih dahulu!");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            if (kom.getRAM() != null) {
                                                String rm1 = "Corsair Dominator RGB 16GB";
                                                int hrm1 = 2500000;
                                                String rm2 = "G.Skill TridentZ RGB 16GB";
                                                int hrm2 = 2100000;
                                                String rm3 = "Klevv Crash RGB 16GB";
                                                int hrm3 = 1950000;
                                                System.out.println("RAM :");
                                                System.out.println("1. " + rm1 + " | " + "Harga : " + hrm1);
                                                System.out.println("2. " + rm2 + " | " + "Harga : " + hrm2);
                                                System.out.println("3. " + rm3 + " | " + "Harga : " + hrm3);
                                                System.out.print("Pilih : ");
                                                int pram = scan.nextInt();
                                                if (pram == 1) {
                                                    kom.setRAM(rm1, hrm1);
                                                    System.out.println("RAM telah diganti dengan " + rm1 + ", seharga " + hrm1);
                                                } else if (pram == 2) {
                                                    kom.setRAM(rm2, hrm2);
                                                    System.out.println("RAM telah diganti dengan " + rm2 + ", seharga " + hrm2);
                                                } else if (pram == 3) {
                                                    kom.setRAM(rm3, hrm3);
                                                    System.out.println("RAM telah diganti dengan " + rm3 + ", seharga " + hrm3);
                                                }
                                            } else {
                                                System.out.println("Kamu belum memilih komponen, silahkan pilih komponen terlebih dahulu!");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            if (kom.getVGA() != null) {
                                                String vg1 = "Asus NVDIA RTX 2070 ROG STRIX";
                                                int hvg1 = 8950000;
                                                String vg2 = "MSI RTX 2070 Gaming X";
                                                int hvg2 = 8800000;
                                                String vg3 = "Zotac RX 5700 XT";
                                                int hvg3 = 7600000;
                                                String vg4 = "Sapphire RX 5700 XT";
                                                int hvg4 = 7450000;
                                                System.out.println("VGA :");
                                                System.out.println("1. " + vg1 + " | " + "Harga : " + hvg1);
                                                System.out.println("2. " + vg2 + " | " + "Harga : " + hvg2);
                                                System.out.println("3. " + vg3 + " | " + "Harga : " + hvg3);
                                                System.out.println("4. " + vg4 + " | " + "Harga : " + hvg4);
                                                System.out.print("Pilih : ");
                                                int pvga = scan.nextInt();
                                                if (pvga == 1) {
                                                    kom.setVGA(vg1, hvg1);
                                                    System.out.println("VGA telah diganti dengan " + vg1 + ", seharga " + hvg1);
                                                } else if (pvga == 2) {
                                                    kom.setVGA(vg2, hvg2);
                                                    System.out.println("VGA telah diganti dengan " + vg2 + ", seharga " + hvg2);
                                                } else if (pvga == 3) {
                                                    kom.setVGA(vg3, hvg3);
                                                    System.out.println("VGA telah diganti dengan " + vg3 + ", seharga " + hvg3);
                                                } else if (pvga == 4) {
                                                    kom.setVGA(vg4, hvg4);
                                                    System.out.println("VGA telah diganti dengan " + vg4 + ", seharga " + hvg4);
                                                }
                                            } else {
                                                System.out.println("Kamu belum memilih komponen, silahkan pilih komponen terlebih dahulu!");
                                                break;
                                            }
                                            break;
                                        case 5:
                                            if (kom.getPSU() != null) {
                                                String ps1 = "Corsair 650 W Modular";
                                                int hps1 = 1375000;
                                                String ps2 = "Cooler Master 650 W Modular";
                                                int hps2 = 1300000;
                                                System.out.println("PSU :");
                                                System.out.println("1. " + ps1 + " | " + "Harga : " + hps1);
                                                System.out.println("2. " + ps2 + " | " + "Harga : " + hps2);
                                                System.out.print("Pilih : ");
                                                int ppsu = scan.nextInt();
                                                if (ppsu == 1) {
                                                    kom.setPSU(ps1, hps1);
                                                    System.out.println("PSU telah diganti dengan " + ps1 + ", seharga " + hps1);
                                                } else if (ppsu == 2) {
                                                    kom.setPSU(ps2, hps2);
                                                    System.out.println("PSU telah diganti dengan " + ps2 + ", seharga " + hps2);
                                                }
                                            } else {
                                                System.out.println("Kamu belum memilih komponen, silahkan pilih komponen terlebih dahulu!");
                                                break;
                                            }
                                            break;
                                        case 6:
                                            if (kom.getStorage() != null) {
                                                String str1 = "SPG Spectrix SSD NVME 2TB";
                                                int hstr1 = 5252000;
                                                String str2 = "Gigabyte Aourus SSD NVME 2TB";
                                                int hstr2 = 6550000;
                                                System.out.println("Storage :");
                                                System.out.println("1. " + str1 + " | " + "Harga : " + hstr1);
                                                System.out.println("2. " + str2 + " | " + "Harga : " + hstr2);
                                                System.out.print("Pilih : ");
                                                int pstr = scan.nextInt();
                                                if (pstr == 1) {
                                                    kom.setStorage(str1, hstr1);
                                                    System.out.println("Storage telah diganti dengan " + str1 + ", seharga " + hstr1);
                                                } else if (pstr == 2) {
                                                    kom.setStorage(str2, hstr2);
                                                    System.out.println("Storage telah diganti dengan " + str2 + ", seharga " + hstr2);
                                                }
                                            } else {
                                                System.out.println("++ Kamu belum memilih komponen, silahkan pilih komponen terlebih dahulu! ++");
                                                break;
                                            }
                                            break;
                                        case 0:
                                            loop = 1;
                                            break;
                                        default:
                                            System.out.println("++ Input hanya berupa angka (1-6) ++");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                loop = -1;
                                while (loop < 0) {
                                    System.out.println("++ Pilih Komponen Yang Akan Diganti ++");
                                    System.out.println("1. " + "CPU: " + kom.getCpu() + " [ Harga : " + kom.gethCpu() + " ]");
                                    System.out.println("2. " + "Motherboard: " + kom.getMobo() + " [ Harga : " + kom.gethMobo() + " ]");
                                    System.out.println("3. " + "RAM: " + kom.getRAM() + " [ Harga : " + kom.gethRAM() + " ]");
                                    System.out.println("4. " + "VGA: " + kom.getVGA() + " [ Harga : " + kom.gethVGA() + " ]");
                                    System.out.println("5. " + "PSU: " + kom.getPSU() + " [ Harga : " + kom.gethPSU() + " ]");
                                    System.out.println("6. " + "Storage: " + kom.getStorage() + " [ Harga : " + kom.gethStorage() + " ]");
                                    System.out.println("0. Kembali");
                                    System.out.print("Pilih : ");
                                    int pilih3 = scan.nextInt();
                                    switch (pilih3) {
                                        case 1:
                                            System.out.println("++ CPU berhasil dibuang! ++");
                                            kom.setCpu(null, 0);
                                            break;
                                        case 2:
                                            System.out.println("++ Motherboard berhasil dibuang! ++");
                                            kom.setMobo(null, 0);
                                            break;
                                        case 3:
                                            System.out.println("++ RAM berhasil dibuang! ++");
                                            kom.setRAM(null, 0);
                                            break;
                                        case 4:
                                            System.out.println("++ VGA berhasil dibuang! ++");
                                            kom.setVGA(null, 0);
                                            break;
                                        case 5:
                                            System.out.println("++ PSU berhasil dibuang! ++");
                                            kom.setPSU(null, 0);
                                            break;
                                        case 6:
                                            System.out.println("++ Storage berhasil dibuang! ++");
                                            kom.setStorage(null, 0);
                                            break;
                                        case 0:
                                            loop = 1;
                                            break;
                                        default:
                                            System.out.println("++ Input hanya berupa angka (1-6) ++");
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                if (kom.getCpu() != null && kom.getMobo() != null && kom.getRAM() != null && kom.getPSU() != null && kom.getStorage() != null) {
                                    currentUser.addKomputer(kom);
                                    System.out.println("++ Komputer berhasil di rakit! ++");
                                    loop2 = 1;
                                    break;
                                } else {
                                    System.out.println("++ Kamu hanya bisa merakit komputer jika sudah memilih CPU, Motherboard, RAM, PSU, dan Storage! ++");
                                    break;
                                }
                            case 0:
                                loop2 = 1;
                                break;
                            default:
                                System.out.println("++ Input hanya berupa angka (1-4) ++");
                                break;

                        }
                    }
                    break;
                case 2:
                    if (currentUser.getSizeKom() != 0) {
                        System.out.println("====    List Komputer   ====");
                        currentUser.jumlahKomputer();
                        System.out.print("Lihat Detil (Y/N) ? ");
                        String lihat = scan.next() + scan.nextLine();
                        if (lihat.equalsIgnoreCase("Y")) {
                            currentUser.lihatKomputer();
                            System.out.print("Ketik apapun untuk kembali ke menu awal : ");
                            String balik = null;
                            balik = scan.next() + scan.nextLine();
                            if (balik == null || balik != null) {
                                break;
                            }

                        } else {
                            break;
                        }
                    } else {
                        System.out.println("++ Kamu belum memiliki komputer! ++");
                    }
                    break;
                case 3:
                    if (currentUser.getSizeKom() != 0) {
                        loop2 = -1;
                        while (loop2 < 0) {
                            System.out.println("====    Upgrade Komputer   ====");
                            currentUser.jumlahKomputer();
                            System.out.print("Pilih komputer yang akan diupgrade : ");
                            int ubah = scan.nextInt();
                            if (currentUser.getSizeKom() < (ubah)) {
                                System.out.println("++ Kamu hanya memiliki " + (currentUser.getSizeKom()) + " komputer ++");
                            } else {
                                Komputer ukom = currentUser.getKom(ubah - 1);
                                loop = -1;
                                while (loop < 0) {
                                    System.out.println("== Komputer " + ubah + " ==");
                                    System.out.println("++ Pilih Komponen Yang Akan Diupgrade ++");
                                    System.out.println("1. " + "CPU: " + ukom.getCpu() + " [ Harga : " + ukom.gethCpu() + " ]");
                                    System.out.println("2. " + "Motherboard: " + ukom.getMobo() + " [ Harga : " + ukom.gethMobo() + " ]");
                                    System.out.println("3. " + "RAM: " + ukom.getRAM() + " [ Harga : " + ukom.gethRAM() + " ]");
                                    System.out.println("4. " + "VGA: " + ukom.getVGA() + " [ Harga : " + ukom.gethVGA() + " ]");
                                    System.out.println("5. " + "PSU: " + ukom.getPSU() + " [ Harga : " + ukom.gethPSU() + " ]");
                                    System.out.println("6. " + "Storage: " + ukom.getStorage() + " [ Harga : " + ukom.gethStorage() + " ]");
                                    System.out.println("0. Kembali");
                                    System.out.print("Pilih : ");
                                    int pilih3 = scan.nextInt();
                                    switch (pilih3) {
                                        case 1:
                                            String cp1 = "Intel I9 9900K";
                                            int hcp1 = 6100000;
                                            String cp2 = "Ryzen 7 5800X";
                                            int hcp2 = 7500000;
                                            System.out.println("CPU :");
                                            System.out.println("1. " + cp1 + " | " + "Harga : " + hcp1);
                                            System.out.println("2. " + cp2 + " | " + "Harga : " + hcp2);
                                            System.out.print("Pilih : ");
                                            int pcpu = scan.nextInt();
                                            if (pcpu == 1) {
                                                ukom.setCpu(cp1, hcp1);
                                                System.out.println("CPU telah diupgrade dengan " + cp1 + ", seharga " + hcp1);
                                            } else if (pcpu == 2) {
                                                ukom.setCpu(cp2, hcp2);
                                                System.out.println("CPU telah diupgrade dengan" + cp2 + ", seharga " + hcp2);
                                            }
                                            break;

                                        case 2:
                                            if (ukom.getMobo() != null) {
                                                String mb1 = "Asus Motherboard B460 / B550";
                                                int hmb1 = 2200000;
                                                String mb2 = "MSI Motherboard B460 / B550";
                                                int hmb2 = 2500000;
                                                System.out.println("Motherboard :");
                                                System.out.println("1. " + mb1 + " | " + "Harga : " + hmb1);
                                                System.out.println("2. " + mb2 + " | " + "Harga : " + hmb2);
                                                System.out.print("Pilih : ");
                                                int pmobo = scan.nextInt();
                                                if (pmobo == 1) {
                                                    ukom.setMobo(mb1, hmb1);
                                                    System.out.println("Motherboard telah diupgrade dengan " + mb1 + ", seharga " + hmb1);
                                                } else if (pmobo == 2) {
                                                    ukom.setMobo(mb2, hmb2);
                                                    System.out.println("Motherboard telah diupgrade dengan " + mb2 + ", seharga " + hmb2);
                                                }
                                            } else {
                                                System.out.println("Kamu belum memilih komponen, silahkan pilih komponen terlebih dahulu!");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            String rm1 = "Corsair Dominator RGB 16GB";
                                            int hrm1 = 2500000;
                                            String rm2 = "G.Skill TridentZ RGB 16GB";
                                            int hrm2 = 2100000;
                                            String rm3 = "Klevv Crash RGB 16GB";
                                            int hrm3 = 1950000;
                                            System.out.println("RAM :");
                                            System.out.println("1. " + rm1 + " | " + "Harga : " + hrm1);
                                            System.out.println("2. " + rm2 + " | " + "Harga : " + hrm2);
                                            System.out.println("3. " + rm3 + " | " + "Harga : " + hrm3);
                                            System.out.print("Pilih : ");
                                            int pram = scan.nextInt();
                                            if (pram == 1) {
                                                ukom.setRAM(rm1, hrm1);
                                                System.out.println("RAM telah diupgradedengan " + rm1 + ", seharga " + hrm1);
                                            } else if (pram == 2) {
                                                ukom.setRAM(rm2, hrm2);
                                                System.out.println("RAM telah diupgrade dengan " + rm2 + ", seharga " + hrm2);
                                            } else if (pram == 3) {
                                                ukom.setRAM(rm3, hrm3);
                                                System.out.println("RAM telah diupgrade dengan " + rm3 + ", seharga " + hrm3);
                                            }
                                            break;
                                        case 4:
                                            String vg1 = "Asus NVDIA RTX 2070 ROG STRIX";
                                            int hvg1 = 8950000;
                                            String vg2 = "MSI RTX 2070 Gaming X";
                                            int hvg2 = 8800000;
                                            String vg3 = "Zotac RX 5700 XT";
                                            int hvg3 = 7600000;
                                            String vg4 = "Sapphire RX 5700 XT";
                                            int hvg4 = 7450000;
                                            System.out.println("VGA :");
                                            System.out.println("1. " + vg1 + " | " + "Harga : " + hvg1);
                                            System.out.println("2. " + vg2 + " | " + "Harga : " + hvg2);
                                            System.out.println("3. " + vg3 + " | " + "Harga : " + hvg3);
                                            System.out.println("4. " + vg4 + " | " + "Harga : " + hvg4);
                                            System.out.print("Pilih : ");
                                            int pvga = scan.nextInt();
                                            if (pvga == 1) {
                                                ukom.setVGA(vg1, hvg1);
                                                System.out.println("VGA telah diupgrade dengan " + vg1 + ", seharga " + hvg1);
                                            } else if (pvga == 2) {
                                                ukom.setVGA(vg2, hvg2);
                                                System.out.println("VGA telah diupgrade dengan " + vg2 + ", seharga " + hvg2);
                                            } else if (pvga == 3) {
                                                ukom.setVGA(vg3, hvg3);
                                                System.out.println("VGA telah diupgrade dengan " + vg3 + ", seharga " + hvg3);
                                            } else if (pvga == 4) {
                                                ukom.setVGA(vg4, hvg4);
                                                System.out.println("VGA telah diupgrade dengan " + vg4 + ", seharga " + hvg4);
                                            }
                                            break;
                                        case 5:
                                            String ps1 = "Corsair 650 W Modular";
                                            int hps1 = 1375000;
                                            String ps2 = "Cooler Master 650 W Modular";
                                            int hps2 = 1300000;
                                            System.out.println("PSU :");
                                            System.out.println("1. " + ps1 + " | " + "Harga : " + hps1);
                                            System.out.println("2. " + ps2 + " | " + "Harga : " + hps2);
                                            System.out.print("Pilih : ");
                                            int ppsu = scan.nextInt();
                                            if (ppsu == 1) {
                                                ukom.setPSU(ps1, hps1);
                                                System.out.println("PSU telah diupgrade dengan " + ps1 + ", seharga " + hps1);
                                            } else if (ppsu == 2) {
                                                ukom.setPSU(ps2, hps2);
                                                System.out.println("PSU telah diupgrade dengan " + ps2 + ", seharga " + hps2);
                                            }
                                            break;
                                        case 6:
                                            String str1 = "SPG Spectrix SSD NVME 2TB";
                                            int hstr1 = 5252000;
                                            String str2 = "Gigabyte Aourus SSD NVME 2TB";
                                            int hstr2 = 6550000;
                                            System.out.println("Storage :");
                                            System.out.println("1. " + str1 + " | " + "Harga : " + hstr1);
                                            System.out.println("2. " + str2 + " | " + "Harga : " + hstr2);
                                            System.out.print("Pilih : ");
                                            int pstr = scan.nextInt();
                                            if (pstr == 1) {
                                                ukom.setStorage(str1, hstr1);
                                                System.out.println("Storage telah diupgrade dengan " + str1 + ", seharga " + hstr1);
                                            } else if (pstr == 2) {
                                                ukom.setStorage(str2, hstr2);
                                                System.out.println("Storage telah diupgrade dengan " + str2 + ", seharga " + hstr2);
                                            }
                                            break;
                                        case 0:
                                            loop = 1;
                                            break;
                                        default:
                                            System.out.println("++ Input hanya berupa angka (1-6) ++");
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                    } else {
                        System.out.println("++ Kamu belum memiliki komputer! ++");
                    }
                    break;
                case 4:
                    if (currentUser.getSizeKom() != 0) {
                        loop2 = -1;
                        while (loop2 < 0) {
                            System.out.println("====    Jual Komputer   ====");
                            currentUser.jumlahKomputer();
                            System.out.print("Pilih komputer yang akan dijual : ");
                            int ubah = scan.nextInt();
                            if (currentUser.getSizeKom() < (ubah)) {
                                System.out.println("++ Kamu hanya memiliki " + (currentUser.getSizeKom()) + " komputer ++");
                            } else {
                                Komputer jkom = currentUser.getKom(ubah - 1);
                                loop = -1;
                                while (loop < 0) {
                                    System.out.println("== Komputer " + ubah + " ==");
                                    System.out.println("1. " + "CPU: " + jkom.getCpu() + " [ Harga : " + jkom.gethCpu() + " ]");
                                    System.out.println("2. " + "Motherboard: " + jkom.getMobo() + " [ Harga : " + jkom.gethMobo() + " ]");
                                    System.out.println("3. " + "RAM: " + jkom.getRAM() + " [ Harga : " + jkom.gethRAM() + " ]");
                                    System.out.println("4. " + "VGA: " + jkom.getVGA() + " [ Harga : " + jkom.gethVGA() + " ]");
                                    System.out.println("5. " + "PSU: " + jkom.getPSU() + " [ Harga : " + jkom.gethPSU() + " ]");
                                    System.out.println("6. " + "Storage: " + jkom.getStorage() + " [ Harga : " + jkom.gethStorage() + " ]");
                                    System.out.println("Harga Komputer : Rp." + currentUser.tharga(ubah - 1));
                                    System.out.printf("Harga Jual : Rp. %.0f\n", ((double) (currentUser.tharga(ubah - 1) * 0.5)), " [ Harga jual adalah 50% dari harga komputer! ]");
                                    System.out.print("Jual (Y/N) ? ");
                                    String pilih3 = scan.next() + scan.nextLine();
                                    if (pilih3.equalsIgnoreCase("Y")) {
                                        currentUser.deleteKom(ubah - 1);
                                        System.out.println("++ Komputer Berhasil dijual! ++");
                                        loop2 = 1;
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("++ Kamu belum memiliki komputer! ++");
                    }
                    break;
                case 5:
                    currentUser = lr.run();
                    break;
                default:
                    System.out.println("++ Input hanya berupa angka (1-5) ++");
                    break;
            }
        }
    }
}
