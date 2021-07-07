
public class Novel extends Komik{
    
    private String ilustator;

    public Novel() {
        super();
        this.ilustator = "";
    }

    public Novel( String name, String genre, String tahun, int harga, String Penulis, String ilustator) {
        super(name, genre, tahun, harga, Penulis);
        this.ilustator = ilustator;
    }

    public String getIlustator() {
        return ilustator;
    }

    public void setIlustator(String ilustator) {
        this.ilustator = ilustator;
    }
}