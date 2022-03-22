package variabelen;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        var totSec = 5924;
        var uren = totSec / 3600; //3600 sec in een uur
        var rest = totSec % 3600; //rest bevat resterende sec

        var minuten = rest / 60;
        var seconden = rest % 60;

        System.out.println("U:" + uren + " M:" + minuten + " S:" + seconden);
    }
}
