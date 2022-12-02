package praktikum6;

public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return (float) (sisi * sisi);
    }

    @Override
    public void draw(){
        System.out.println("Menggambar Persegi");
    }
}