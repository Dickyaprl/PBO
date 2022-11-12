public class Persegi extends bangundatar {

    //Membuat attribut private
    private int sisi;

    //Memasukkan Setter dan Getter
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }

    //Method dengan nilai pengembalian float
    public float luas(int sisi){
        return (float) (sisi * sisi);
    }

    public float keliling(int sisi){
        return (float) (4 * sisi);
    }
}
