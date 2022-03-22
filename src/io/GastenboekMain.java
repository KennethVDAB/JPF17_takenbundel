package io;

import java.util.Scanner;

public class GastenboekMain {
    public static void main(String[] args) {
        var manager = new GastenboekManager();
        var gastenboek = manager.lees();
        var scanner = new Scanner(System.in);
        System.out.print("T=tonen,S=schrijven,E=einde:");
        for (String keuze;
             !(keuze = scanner.nextLine()).equalsIgnoreCase("E"); ) {
            switch (keuze) {
                case "T", "t" -> System.out.println(gastenboek);
                case "S", "s" -> {
                    System.out.print("Schrijver:");
                    var schrijver = scanner.nextLine();
                    System.out.print("Boodschap:");
                    var boodschap = scanner.nextLine();
                    gastenboek.toevoegen(new GastenboekEntry(schrijver, boodschap));
                    manager.schrijf(gastenboek);
                }
                default -> System.out.println("Verkeerde keuze");
            }
            System.out.print("T=tonen,S=schrijven,E=einde:");
        }
    }
}
