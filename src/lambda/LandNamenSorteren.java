package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LandNamenSorteren {
    private static final Path PATH = Path.of("/data/landcodes.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.map(regel -> regel.substring(regel.indexOf(' ') + 1))
                    .sorted()
                    .forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
