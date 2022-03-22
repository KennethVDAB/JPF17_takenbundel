package lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ZoekSterrenbeelden {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        System.out.print("woord:");
        var scanner = new Scanner(System.in);
        var woord = scanner.next().toUpperCase();
        try (var stream = Files.lines(PATH)) {
            stream.filter(sterrenbeeld -> sterrenbeeld.toUpperCase().contains(woord))
                    .forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
