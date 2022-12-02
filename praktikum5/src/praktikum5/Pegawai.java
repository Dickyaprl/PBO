package praktikum5;

public class Pegawai{
    private String nama;
    private double gajiPokok;

     public void setNama(String nama){
        this.nama = nama;
    }

    public void setgajiPokok(double gajipokok){
        this.gajiPokok = gajipokok;
    }

     public String getNama(){
        return this.nama ;
    }
    public double getgajiPokok(){
         return gajiPokok ;
        }
    
    
    public Pegawai(String nama){
        this.nama = nama;
    }
    public Pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }


    public void cetakInfo() {
        System.out.println ("Nama   : " + getNama());
        System.out.println ("gajiPokok : " + getgajiPokok());
    }
}