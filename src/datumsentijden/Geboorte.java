package datumsentijden;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Geboorte {
    public static void main(String[] args) {
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        var scanner = new Scanner(System.in);

        System.out.print("geboortedatum (dag/maand/jaar):");
        var geboorteAlsString = scanner.next();
        var geboorte = LocalDate.parse(geboorteAlsString, formatter);

        System.out.println(geboorte.getDayOfWeek());
        System.out.println(
                ChronoUnit.YEARS.between(geboorte, LocalDate.now()));

    }
}
