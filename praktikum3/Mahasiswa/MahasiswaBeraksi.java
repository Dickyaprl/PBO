package com.mycompany.manusia;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
       Mahasiswa anton = new Mahasiswa();
       anton.nim = "10102020";
       anton.nama = "Anton Santoso";
       anton.jeniskelamin = "Laki-laki";
       anton.umur = 28;
       anton.alamat = "Bekasi Kota";
       anton.jurusan = "Informatika";
       anton.cetakinfo();
}
}

