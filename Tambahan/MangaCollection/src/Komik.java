
public class Komik extends Koleksi{
    private String Penulis;

    public Komik() {
        super();
        this.Penulis = "";
    }

    public Komik( String name, String genre, String tahun, int harga, String Penulis) {
        super(name, genre, tahun, harga);
        this.Penulis = Penulis;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }
}