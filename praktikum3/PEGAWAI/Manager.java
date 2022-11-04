package com.mycompany.pegawai;

public class Manager extends Pegawai {
    double Tunjangan;

    public double getTunjangan() {
        return Tunjangan;
    }

    public void setTunjangan(double Tunjangan) {
        this.Tunjangan = Tunjangan;
    }
    public void cetakTunjangan(){
        System.out.println("Tunjangan : "+ Tunjangan);
    }
    public void cetakmanager(){
        System.out.println("Nama    :"+ nama);
        System.out.println("Gaji pokok:"+ gajipokok);
        System.out.println("Tunjangan:"+ Tunjangan);
        
    }
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.setNama("JOKO");
        manager1.setGajipokok(7.750);
        manager1.setTunjangan(2.350);
        
        manager1.cetakmanager();
    }
    }
