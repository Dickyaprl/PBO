package com.mycompany.praktikum4;

public class Lingkaran extends bangundatar {
    //Memasukkan Atribut Private
    private int r;

    //Menambahkan Setter dan Getter
    public void setR(int r){
        this.r = r;
    }
    public int getR(){
        return r;
    }

    //method dengan nilai pengembalian float
    public float luas(int r) {
        return (float) (3.14 * r * r);
    }
    public float keliling(int r){
        return (float) (2 * 3.14 *r);
    }
}

   