package lambda;

import java.util.List;

public class Rechthoek {
    private final int lengte;
    private final int breedte;

    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public int getOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String toString() {
        return lengte + " op " + breedte;
    }
}

class Main {
    public static void main(String[] args) {
        var rechthoeken = List.of(
                new Rechthoek(3, 2), new Rechthoek(4, 5), new Rechthoek(2, 3));
        var kleinsteOppervlakte = rechthoeken.stream()
                .mapToInt(Rechthoek::getOppervlakte)
                .min();
        kleinsteOppervlakte.ifPresent(oppervlakte -> {
            System.out.println(oppervlakte);
            rechthoeken.stream()
                    .filter(rechthoek -> rechthoek.getOppervlakte() == oppervlakte)
                    .forEach(System.out::println);
        });
    }
}
