package praktikum2;

public class programKU{
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
       
        person1.setNama("anton");
        person1.setJeniskelamin( "pria");
        person1.setUsia(20);
        
        person2.setNama("riko");
        person2.setJeniskelamin("pria");
        person2.setUsia(22);
        
        person1.cetak();
        person2.cetak();
        
    }
}





