public class Manusia {
    public String merk;
    public Phone mesin;

    public Manusia(String merkMesin, int volume) {
        mesin = new Phone();
        mesin.merk = merkMesin;
        mesin.volume = volume;
    }

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