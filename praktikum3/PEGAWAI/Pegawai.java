package com.mycompany.pegawai;

public class Pegawai{
    String nama;
    double gajipokok;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }
    public void cetakinfo(){
        System.out.println("Nama    :" + nama);
        System.out.println("Gaji pokok  :"+ gajipokok);
    }
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNama("anton");
        pegawai1.setGajipokok(4.750);
        
        pegawai1.cetakinfo();
        
  
    }
    
} 


