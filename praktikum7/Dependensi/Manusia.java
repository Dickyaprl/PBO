public class Manusia {
    public String merk;
    public Phone mesin;

    public void powerOn() {
        mesin.powerOn();
    }

    public void powerOff() {
        mesin.powerOff();
    }

    public void run() {
        System.out.println("Handphone booting... ");
    }
}