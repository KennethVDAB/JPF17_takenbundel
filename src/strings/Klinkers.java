package strings;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Tik een zin:");
        var zin = scanner.nextLine().toLowerCase() ;

        var aantal = 0;
        for (var i=0; i < zin.length(); i++) {
            var letter = zin.charAt(i);
//          if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
//             aantal++;
//          }
            //andere manier
            if ("aeiou".indexOf(letter)> -1)
                aantal++;
        }
        System.out.println("Aantal klinkers: " + aantal);
    }
}
