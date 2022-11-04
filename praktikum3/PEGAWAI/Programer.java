package com.mycompany.pegawai;

public class Programer extends Pegawai {
    double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void cetakprogramer(){
        System.out.println("Nama        : "+ nama);
        System.out.println("Gaji pokok  :"+ gajipokok);
        System.out.println("Bonus       :"+ bonus);
    }
    public static void main(String[] args) {
        Programer programer1 = new Programer();
        programer1.setNama("GONI");
        programer1.setGajipokok(6.750);
        programer1.setBonus(1.350);
        
        programer1.cetakprogramer();
    }
        
    }
    

