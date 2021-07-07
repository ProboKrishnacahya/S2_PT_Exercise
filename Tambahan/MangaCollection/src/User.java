
import java.util.ArrayList;

public class User {
    
    private String username, password, name;
    private int tabungan;
    private ArrayList<Koleksi> koleksi;

    public User() {
        this.username = "";
        this.password = "";
        this.name = "";
        this.tabungan = 0;
        this.koleksi = new ArrayList<Koleksi>();
    }
    
    public User(String username, String password, String name, int tabungan, ArrayList<Koleksi> koleksi) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.tabungan = tabungan;
        this.koleksi = koleksi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTabungan() {
        return tabungan;
    }

    public void setTabungan(int tabungan) {
        this.tabungan = tabungan;
    }

    public ArrayList<Koleksi> getKoleksi() {
        return koleksi;
    }

    public void setKoleksi(ArrayList<Koleksi> koleksi) {
        this.koleksi = koleksi;
    }
    
    public void addKoleksi(Koleksi newkoleksi){
        this.koleksi.add(newkoleksi);
    }
    
    public void editKoleksi(Koleksi newkoleksi, int position){
        this.koleksi.set(position, newkoleksi);
    }
    
    public void deleteKoleksi(int position){
        this.koleksi.remove(position);
    }
}