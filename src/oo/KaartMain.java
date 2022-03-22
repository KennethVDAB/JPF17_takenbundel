package oo;

public class KaartMain {
    public static void main(String[] args) {
        var kaart1 = new Kaart();
        kaart1.printKaart();

        var kaart2 = new Kaart();
        kaart2.printKaart();

        if (kaart1.isHogerDan(kaart2))
            System.out.println("kaart1 is hoger dan kaart2");
        else
            System.out.println("kaart2 is hoger dan kaart1");
    }
}

