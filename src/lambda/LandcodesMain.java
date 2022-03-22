package lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class LandcodesMain {
    private static final Path PATH = Path.of("/data/landcodes.txt");

    private static Optional<String> landNaam(String landcode) {
        try (var reader = Files.newBufferedReader(PATH)) {
            for (String regel; (regel = reader.readLine()) != null; ) {
                var spatieIndex = regel.indexOf(' ');
                if (landcode.equals(regel.substring(0, spatieIndex))) {
                    return Optional.of(regel.substring(spatieIndex + 1));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        landNaam("BE").ifPresent(System.out::println);
    }
}
