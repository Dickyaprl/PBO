package praktikum6;


public class Utama {
    public static void main(String[] args) {
        // buat object dari class BangunDatar
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar segitiga = new Segitiga(8, 12);
        BangunDatar persegi = new Persegi (4);

        //memanggil method gambar
        lingkaran.draw();
        segitiga.draw();
        persegi.draw();

        //mencetak luas bangunan
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Luas Persegi: " + persegi.luas());
    }
}