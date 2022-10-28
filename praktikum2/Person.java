package praktikum2;
        
public class Person {
     private String nama;
     private String jeniskelamin;
     private int usia;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
     
     

    public void cetak(){
        System.out.println("Nama          :"+nama);
        System.out.println("jenis kelamin :"+jeniskelamin);
        System.out.println("usia           :"+usia);

    }
}