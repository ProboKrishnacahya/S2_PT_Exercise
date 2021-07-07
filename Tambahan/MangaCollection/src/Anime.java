
public class Anime extends Koleksi{
    
    private String jumlah_episode;

    public Anime() {
        super();
        this.jumlah_episode = "";
    }

    public Anime(String name, String genre, String tahun, int harga, String jumlah_episode) {
        super(name, genre, tahun, harga);
        this.jumlah_episode = jumlah_episode;
    }

    public String getJumlah_episode() {
        return jumlah_episode;
    }

    public void setJumlah_episode(String jumlah_episode) {
        this.jumlah_episode = jumlah_episode;
    }
}