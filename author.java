/**
 * Created by Nin on 10/06/2015.
 */
public class author {

    private String perusahaan;
    private String merkMobil;
    private int jumlahroda;

    public author(String perusahaan, String merkMobil, int jumlahroda) {
        this.perusahaan = perusahaan;
        this.merkMobil = merkMobil;
        this.jumlahroda = jumlahroda;
    }

    public author(String perusahaan, String merkMobil) {
        this.perusahaan = perusahaan;
        this.merkMobil = merkMobil;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public int getJumlahroda() {
        return jumlahroda;
    }

    public void setJumlahroda(int jumlahroda) {
        this.jumlahroda = jumlahroda;
    }

    @Override
    public String toString() {
        return "author{" +
                "perusahaan='" + perusahaan + '\'' +
                ", merkMobil='" + merkMobil + '\'' +
                ", jumlahroda=" + jumlahroda +
                '}';
    }
}
