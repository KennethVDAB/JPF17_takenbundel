package multithreading;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var getallen = new double[1000000];
        var random = new Random();
        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = random.nextInt();
        }
        var gemiddeldeRekenaar1 =
                new GemiddeldeRekenaar(getallen, 0, getallen.length / 2);
        var gemiddeldeRekenaar2 =
                new GemiddeldeRekenaar(getallen, getallen.length / 2, getallen.length);
        var thread1 = new Thread(gemiddeldeRekenaar1);
        var thread2 = new Thread(gemiddeldeRekenaar2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println((gemiddeldeRekenaar1.getGemiddelde() +
                gemiddeldeRekenaar2.getGemiddelde()) / 2);
    }
}
