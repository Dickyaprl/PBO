package praktikum5;

public class Main{
    public static void main(String[] args){

    Manager gManager = new Manager ("Nazwa");
    Manager sManager = new Manager ("Wawan ", 500000);
    Manager lManager = new Manager("Dedi", 6000000, 2000000);

    Programmer gProgrammer = new Programmer ("Dela");
    Programmer sProgrammer = new Programmer ("Sugi", 500000);
    Programmer lProgrammer = new Programmer("Indra", 6000000, 500000);

    gManager.cetakInfo();
    sManager.cetakInfo();
    lManager.cetakInfo();

    gProgrammer.cetakInfo();
    sProgrammer.cetakInfo();
    lProgrammer.cetakInfo();
    }
}