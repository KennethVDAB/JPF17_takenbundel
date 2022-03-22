package oo;

public class GetalMain {
    public static void main(String[] args) {
        //var getalA = new Getal();   (a)
        //System.out.println(getalA.x); (a)

        // (b) System.out.println(getalA.x);
        // kan niet meer omdat x private is en niet meer public

        var getalA = new Getal(-45); // (d)

        getalA.print(); // (c)

        var absWaarde = getalA.absoluut();  // (e)
        System.out.println("absolute waarde van x = " + absWaarde);

        var som = getalA.som(7);  // (f)
        System.out.println("som van x en a " + som);

        getalA.add(56);  // (g)
        getalA.print();

        var f = getalA.som(123.67F);  // (h)
        System.out.println("som van x en float " + f);

        var d = getalA.som(1234567.98765);  // (h)
        System.out.println("som van x en double " + d);

        var xd = getalA.toDouble(); // (i)
        System.out.println("toDouble van x " + xd);

        getalA.setX(99); // (j)
        getalA.print();
        var xx = getalA.getX();
        System.out.println("getX geeft " + xx);

    }
}
