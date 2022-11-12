package com.mycompany.praktikum4;

public class Segitiga extends bangundatar{

    //Membuat atribut private
    private int alas;
    private int tinggi;
    private int sisi;

    //Memasukkan Setter dan Getter
    public void setAlas(int alas){
        this.alas = alas;
    }
    public int getAlas(){
        return alas;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }

    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }
    //Method dengan nilai pengembalian float
    public float luas(int alas, int tinggi){
        return (float) (0.5 * alas * tinggi);
    }
    public float keliling (int sisi){
        return (float) (3 * sisi);
    }
}
