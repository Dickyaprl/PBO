package praktikum6;

public class Lingkaran extends BangunDatar {
    int r;
    
    public Lingkaran(int r){
        this.r = r;
    }

    public float luas(){
        return (float) (Math.PI * r * r);
    }

    @Override
    public void draw(){
        System.out.println("Menggambar Lingkaran");
    }
}