package com.mycompany.praktikum4;

public class Main {
    public static void main(String[] args){

        //Memasukkan objek ke subclass
        Lingkaran lingkaran1 = new Lingkaran();
        Segitiga segitiga1 = new Segitiga();
        Persegi persegi1 = new Persegi();

        //Memasukkan nilai ke objek dan menampilkannya
        System.out.println("\nLuas Lingkaran: " + lingkaran1.luas(10));
        System.out.println("Keliling Lingkaran: " + lingkaran1.keliling(10));
        System.out.println("\nLuas Segitiga: " + segitiga1.luas(10 , 15));
        System.out.println("Keliling segitiga: " + segitiga1.keliling(10));
        System.out.println("\nLuas Persegi: " + persegi1.luas(8));
        System.out.println("Keliling Persegi: " + persegi1.keliling(8));
    }
}