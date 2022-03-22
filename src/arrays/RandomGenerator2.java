package arrays;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];

        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }

        // SORTEREN van de 100 getallen
        for (var pos = 0; pos < getallen.length - 1; pos++) {
            for (var vgl = pos + 1; vgl < getallen.length; vgl++) {
                if (getallen[pos] > getallen[vgl]) {
                    var tempGetal = getallen[pos];
                    getallen[pos] = getallen[vgl];
                    getallen[vgl] = tempGetal;

                }
            }
        }
        for (int j : getallen) {
            System.out.print(j + "\t");
        }
    }
}