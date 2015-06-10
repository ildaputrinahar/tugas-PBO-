/**
 * Created by Nin on 10/06/2015.
 */
public class testMobil {
    public static void main(String[] args) {

        author mb = new author ("Mitsubishi","Pajero Sport",4);
        System.out.println("semua data : "+ mb.toString());
        System.out.println("Perusahaan :"+mb.getPerusahaan());
        System.out.println("Merk Mobil :" + mb.getMerkMobil());
        System.out.println("jumlah roda   :" + mb.getJumlahroda());
    }
}
