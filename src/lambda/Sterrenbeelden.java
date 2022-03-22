package lambda;

import java.nio.file.Files;
import java.nio.file.Path;

public class Sterrenbeelden {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");
    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.forEach(beeld -> System.out.println(beeld.toUpperCase()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
