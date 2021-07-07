
public class Koleksi {
    
    protected String name, genre, tahun;
    protected int harga;

    public Koleksi() {
        this.name = "";
        this.genre = "";
        this.tahun = "";
        this.harga = 0;
    }
    
    public Koleksi(String name, String genre, String tahun, int harga) {
        this.name = name;
        this.genre = genre;
        this.tahun = tahun;
        this.harga = harga;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}