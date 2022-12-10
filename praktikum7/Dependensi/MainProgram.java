public class MainProgram {
    public static void main(String[] args) {
        Phone mesin = new Phone();

        mesin.merk = "Snapdragon";
        mesin.volume = 50;

        Manusia dicky = new Manusia();

        dicky.merk = "Samsung S22";
        dicky.mesin = mesin;
        dicky.powerOn();
        dicky.run();
        dicky.powerOff();
    }
}