class Person{
    String nama;
    String jeniskelamin;
    String umur;
}



public class Main{
    public static void main(String[] args) throws Exception {
       
        Person person1 = new Person();
        person1.nama = "anton";
        person1.jeniskelamin = "pria";
        person1.umur = "20"; 

        System.out.println(person1.nama);
        System.out.println(person1.jeniskelamin);
        System.out.println(person1.umur);
       
        Person person2 = new Person();
        person2.nama = "riko";
        person2.jeniskelamin = "pria";
        person2.umur = "22"; 
        
        System.out.println(person2.nama);
        System.out.println(person2.jeniskelamin);
        System.out.println(person2.umur);
        }
}
