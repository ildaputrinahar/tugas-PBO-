/**
 * Created by Nin on 10/06/2015.
 */
public class mobil {

  private String kecepatanMobil;
    private int kapasitas;
    private author pemilik;

    public mobil(String kecepatanMobil, int kapasitas, author pemilik) {
        this.kecepatanMobil = kecepatanMobil;
        this.kapasitas = kapasitas;
        this.pemilik = pemilik;
    }

    public mobil(String kecepatanMobil, int kapasitas) {
        this.kecepatanMobil = kecepatanMobil;
        this.kapasitas = kapasitas;
    }

    public String getKecepatanMobil() {
        return kecepatanMobil;
    }

    public void setKecepatanMobil(String kecepatanMobil) {
        this.kecepatanMobil = kecepatanMobil;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public author getPemilik() {
        return pemilik;
    }

    public void setPemilik(author pemilik) {
        this.pemilik = pemilik;
    }

    @Override
    public String toString() {
        return "mobil{" +
                "kecepatanMobil='" + kecepatanMobil + '\'' +
                ", kapasitas=" + kapasitas +
                ", pemilik=" + pemilik +
                '}';
    }
}
