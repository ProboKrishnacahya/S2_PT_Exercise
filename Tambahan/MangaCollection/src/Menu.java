
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<User> user;
    private int currUserPosition;
    private Scanner s;
    private boolean isLogin;

    public void start() {
        this.initComponent();
        while (this.LoginRegister()) {
            System.out.println("\n=============================Welcome to MyCollectionChart=================================");
            System.out.println("1. Add to my collection");
            System.out.println("2. Show my collection");
            System.out.println("3. Update my collection");
            System.out.println("4. Delete my collction");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            int pilih = s.nextInt();

            System.out.println("");

            if (pilih == 1) {
                this.addCollection();
            } else if (pilih == 2) {
                this.showCollection();
            } else if (pilih == 3) {
                this.updateCollection();
            } else if (pilih == 4) {
                this.deleteCollection();
            } else if (pilih == 0) {
                System.out.println("Bye-bye kamu berhasil logout");
                this.isLogin = false;
            } else {
                System.out.println("Menu tidak tersedia!!");
            }
            System.out.println("");
        }
    }

    public boolean LoginRegister() {
        while (!this.isLogin) {
            System.out.println("=============================Welcome!!!=================================");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            int pilih = s.nextInt();

            System.out.println("");
            if (pilih == 1) {
                System.out.println("Hi, username kamu apa?");
                String username = s.next() + s.nextLine();
                System.out.println("password kamu?");
                String password = s.next() + s.nextLine();

                for (int i = 0; i < this.user.size(); i++) {
                    User temp = this.user.get(i);
                    if (username.equalsIgnoreCase(temp.getUsername()) && password.equals(temp.getPassword())) {
                        this.isLogin = true;
                        this.currUserPosition = i;
                        System.out.println("\nBerhasil");
                        System.out.println("Selama satu bulan ini, uang kamu terkumpul sebesar Rp." + user.get(currUserPosition).getTabungan());
                        System.out.println("Gunakan uang ini sebaik mungkin untuk membeli koleksi kesukaan favoritmu!");
                        break;
                    }
                }

                if (!this.isLogin) {
                    System.out.println("Maaf, username dan password kamu salah\n");
                }
            } else if (pilih == 2) {
                System.out.println("Hi, nama kamu siapa?");
                String nama = s.next() + s.nextLine();
                System.out.println("username kamu?");
                String username = s.next() + s.nextLine();
                System.out.println("password kamu?");
                String password = s.next() + s.nextLine();
                System.out.println("Total tabungan kamu?");
                int tabungan = s.nextInt();

                User newUser = new User();
                newUser.setName(nama);
                newUser.setUsername(username);
                newUser.setPassword(password);
                newUser.setTabungan(tabungan);

                this.user.add(newUser);
                System.out.println("Oke data kamu berhasil disimpan \n");
            } else if (pilih == 0) {
                System.out.println("Thank you ^_^");
                return false;
            } else {
                System.out.println("Menu tidak tersedia!!\n");
            }
        }
        return true;
    }

    private void initComponent() {
        this.user = new ArrayList<>();
        this.currUserPosition = -1;
        this.s = new Scanner(System.in);
        this.isLogin = false;
    }

    private void addCollection() {
        System.out.println("Pilih koleksi yang mau ditambahkan");
        System.out.println("1. Anime");
        System.out.println("2. Komik");
        System.out.println("3. Novel");
        System.out.println("0. Kembali");
        System.out.print("pilih: ");
        int pilih = s.nextInt();

        if (pilih == 1) {
            System.out.println("=====Anime=====");
            System.out.print("Input nama: ");
            String nama = s.next() + s.nextLine();
            System.out.print("Input genre: ");
            String genre = s.next() + s.nextLine();
            System.out.print("Input harga: ");
            int harga = s.nextInt();
            System.out.print("Input tahun: ");
            String tahun = s.next() + s.nextLine();
            System.out.print("Input jumlah episode: ");
            String jumlah_episode = s.next() + s.nextLine();

            Anime newAnime = new Anime(nama, genre, tahun, harga, jumlah_episode);

            if (this.checkPrice(harga)) {
                User currUser = this.user.get(currUserPosition);
                currUser.addKoleksi(newAnime);
                this.tabungan_berkurang(harga);
                this.user.set(currUserPosition, currUser);
                System.out.println("Koleksi kamu bertambah. Sisa uang kamu Rp." + user.get(currUserPosition).getTabungan());
            } else {
                System.out.println("Tabungan kamu tidak cukup T_T");
            }
        } else if (pilih == 2) {
            System.out.println("=====Manga=====");
            System.out.print("Input nama: ");
            String nama = s.next() + s.nextLine();
            System.out.print("Input genre: ");
            String genre = s.next() + s.nextLine();
            System.out.print("Input harga: ");
            int harga = s.nextInt();
            System.out.print("Input tahun: ");
            String tahun = s.next() + s.nextLine();
            System.out.print("Input penulis: ");
            String penulis = s.next() + s.nextLine();

            Komik newKomik = new Komik(nama, genre, tahun, harga, penulis);

            if (this.checkPrice(harga)) {
                User currUser = this.user.get(currUserPosition);
                currUser.addKoleksi(newKomik);
                this.tabungan_berkurang(harga);
                this.user.set(currUserPosition, currUser);
                System.out.println("Koleksi kamu bertambah. Sisa uang kamu Rp." + user.get(currUserPosition).getTabungan());
            } else {
                System.out.println("Tabungan kamu tidak cukup T_T");
            }
        } else if (pilih == 3) {
            System.out.println("=====Novel=====");
            System.out.print("Input nama: ");
            String nama = s.next() + s.nextLine();
            System.out.print("Input genre: ");
            String genre = s.next() + s.nextLine();
            System.out.print("Input harga: ");
            int harga = s.nextInt();
            System.out.print("Input tahun: ");
            String tahun = s.next() + s.nextLine();
            System.out.print("Input ilustrator: ");
            String ilustrator = s.next() + s.nextLine();

            Novel newNovel = new Novel(nama, genre, tahun, harga, genre, ilustrator);

            if (this.checkPrice(harga)) {
                User currUser = this.user.get(currUserPosition);
                currUser.addKoleksi(newNovel);
                this.tabungan_berkurang(harga);
                this.user.set(currUserPosition, currUser);
                System.out.println("Koleksi kamu bertambah. Sisa uang kamu Rp." + user.get(currUserPosition).getTabungan());
            } else {
                System.out.println("Tabungan kamu tidak cukup T_T");
            }
        } else if (pilih == 0) {

        } else {
            System.out.println("Menu koleksi hanya 1 - 3");
        }
    }

    private void tabungan_berkurang(int price) {
        int tabungan = this.user.get(currUserPosition).getTabungan();
        this.user.get(currUserPosition).setTabungan(tabungan - price);
    }

    private void tabungan_bertambah(int price) {
        int tabungan = this.user.get(currUserPosition).getTabungan();
        this.user.get(currUserPosition).setTabungan(tabungan + price);
    }

    private boolean checkPrice(int price) {
        if (price <= this.user.get(currUserPosition).getTabungan()) {
            return true;
        } else {
            return false;
        }
    }

    private void showCollection() {
        User currUser = user.get(currUserPosition);
        ArrayList<Koleksi> koleksi = currUser.getKoleksi();
        int totalHarga = 0;
        System.out.println("My Collection");
        for (int i = 0; i < koleksi.size(); i++) {
            System.out.print((i + 1) + ". ");
            if (koleksi.get(i).getClass().equals(Anime.class)) {
                Anime temp = (Anime) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getJumlah_episode());
            } else if (koleksi.get(i).getClass().equals(Komik.class)) {
                Komik temp = (Komik) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getPenulis());
            } else if (koleksi.get(i).getClass().equals(Novel.class)) {
                Novel temp = (Novel) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getIlustator());
            }
        }
        System.out.println("Total biaya koleksi mu adalah Rp." + totalHarga);
        System.out.println("Sisa uang kamu adalah Rp. " + this.user.get(currUserPosition).getTabungan());
    }

    private void deleteCollection() {
        User currUser = user.get(currUserPosition);
        ArrayList<Koleksi> koleksi = currUser.getKoleksi();
        int totalHarga = 0;
        System.out.println("Delete Collection");
        for (int i = 0; i < koleksi.size(); i++) {
            System.out.print((i + 1) + ". ");
            if (koleksi.get(i).getClass().equals(Anime.class)) {
                Anime temp = (Anime) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getHarga() + "  |  " + temp.getJumlah_episode());
            } else if (koleksi.get(i).getClass().equals(Komik.class)) {
                Komik temp = (Komik) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getHarga() + "  |  " + temp.getPenulis());
            } else if (koleksi.get(i).getClass().equals(Novel.class)) {
                Novel temp = (Novel) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getHarga() + "  |  " + temp.getIlustator());
            }
        }
        System.out.println("Pilih koleksi yang mau dihapus: ");
        int pilih = s.nextInt();

        if (pilih <= 0 || pilih > koleksi.size()) {
            System.out.println("Koleksi mu tidak ada");
        } else {
            this.tabungan_bertambah(currUser.getKoleksi().get(pilih-1).getHarga());
            currUser.deleteKoleksi(pilih - 1);
            this.user.set(currUserPosition, currUser);
            System.out.println("Berhasil dihapus");
        }
    }

    private void updateCollection() {
        // Ambil user yang lagi login
        User currUser = user.get(currUserPosition);
        ArrayList<Koleksi> koleksi = currUser.getKoleksi();
        int totalHarga = 0;
        
        // Tunjukin koleksi
        System.out.println("Delete Collection");
        for (int i = 0; i < koleksi.size(); i++) {
            System.out.print((i + 1) + ". ");
            if (koleksi.get(i).getClass().equals(Anime.class)) {
                Anime temp = (Anime) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getHarga() + "  |  " + temp.getJumlah_episode());
            } else if (koleksi.get(i).getClass().equals(Komik.class)) {
                Komik temp = (Komik) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getHarga() + "  |  " + temp.getPenulis());
            } else if (koleksi.get(i).getClass().equals(Novel.class)) {
                Novel temp = (Novel) koleksi.get(i);
                totalHarga += temp.getHarga();
                System.out.println(temp.getName() + "  |  " + temp.getGenre() + "  |  " + temp.getTahun() + "  |  " + temp.getHarga() + "  |  " + temp.getIlustator());
            }
        }
        System.out.println("Pilih koleksi yang mau di ubah: ");
        int pilih = s.nextInt();

        // Proses input koleksi yang mau di update & hampir sama seperti Add Collection
        if (pilih <= 0 || pilih > koleksi.size()) {
            System.out.println("Koleksi mu tidak ada");
        } else {
            pilih -= 1; // index koleksi nya di kurangi dulu karena mulai dari 0
            Koleksi currKoleksi = koleksi.get(pilih);
            this.tabungan_bertambah(currKoleksi.getHarga());
            if (currKoleksi.getClass().equals(Anime.class)) {
                System.out.println("=====Anime=====");
                System.out.print("Input nama: ");
                String nama = s.next() + s.nextLine();
                System.out.print("Input genre: ");
                String genre = s.next() + s.nextLine();
                System.out.print("Input harga: ");
                int harga = s.nextInt();
                System.out.print("Input tahun: ");
                String tahun = s.next() + s.nextLine();
                System.out.print("Input jumlah episode: ");
                String jumlah_episode = s.next() + s.nextLine();

                Anime newAnime = new Anime(nama, genre, tahun, harga, jumlah_episode);

                if (this.checkPrice(harga)) {
                    currUser.editKoleksi(newAnime, pilih);
                    this.tabungan_berkurang(harga);
                    this.user.set(currUserPosition, currUser);
                    System.out.println("Koleksi kamu bertambah. Sisa uang kamu Rp." + user.get(currUserPosition).getTabungan());
                } else {
                    System.out.println("Tabungan kamu tidak cukup T_T");
                }
            } else if (currKoleksi.getClass().equals(Komik.class)) {
                System.out.println("=====Komik=====");
                System.out.print("Input nama: ");
                String nama = s.next() + s.nextLine();
                System.out.print("Input genre: ");
                String genre = s.next() + s.nextLine();
                System.out.print("Input harga: ");
                int harga = s.nextInt();
                System.out.print("Input tahun: ");
                String tahun = s.next() + s.nextLine();
                System.out.print("Input penulis: ");
                String penulis = s.next() + s.nextLine();

                Komik newKomik = new Komik(nama, genre, tahun, harga, penulis);

                if (this.checkPrice(harga)) {
                    currUser.editKoleksi(newKomik, pilih);
                    this.tabungan_berkurang(harga);
                    this.user.set(currUserPosition, currUser);
                    System.out.println("Koleksi kamu bertambah. Sisa uang kamu Rp." + user.get(currUserPosition).getTabungan());
                } else {
                    System.out.println("Tabungan kamu tidak cukup T_T");
                }
            } else if (currKoleksi.getClass().equals(Novel.class)) {
                System.out.println("=====Novel=====");
                System.out.print("Input nama: ");
                String nama = s.next() + s.nextLine();
                System.out.print("Input genre: ");
                String genre = s.next() + s.nextLine();
                System.out.print("Input harga: ");
                int harga = s.nextInt();
                System.out.print("Input tahun: ");
                String tahun = s.next() + s.nextLine();
                System.out.print("Input ilustrator: ");
                String ilustrator = s.next() + s.nextLine();

                Novel newNovel = new Novel(nama, genre, tahun, harga, genre, ilustrator);

                if (this.checkPrice(harga)) {
                    currUser.editKoleksi(newNovel, pilih);
                    this.tabungan_berkurang(harga);
                    this.user.set(currUserPosition, currUser);
                    System.out.println("Koleksi kamu bertambah. Sisa uang kamu Rp." + user.get(currUserPosition).getTabungan());
                } else {
                    System.out.println("Tabungan kamu tidak cukup T_T");
                }
            }
        }
    }
}
