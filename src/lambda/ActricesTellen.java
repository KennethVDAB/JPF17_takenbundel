package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ActricesTellen {
    private static final Path PATH = Path.of("/data/acteurs-actrices.csv");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            System.out.println(
                    stream.map(regel -> regel.split(";")[2])
                            .filter("F"::equals)
                            .count());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
