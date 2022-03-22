package variabelen;

public class Rekeningnummer {
    public static void main(String[] args) {
        //    var bankreknr = 823445816730L; //OK
        var bankreknr = 237824199569L; //OK
//    var bankreknr = 662431212859L; //OK
//    var bankreknr = 737524091952L; //OK

//    var bankreknr = 111224444891L; //niet OK
//    var bankreknr = 777553241844L; //niet OK

        var bankreknrEerste10 = bankreknr / 100;
        System.out.println(bankreknrEerste10);
        var bankreknrLaatste2 = (int) (bankreknr % 100);
        System.out.println(bankreknrLaatste2);

        var rest = (int) (bankreknrEerste10 % 97);
        System.out.println("BankrekeningNr: " + bankreknr);
        System.out.println("rest van de deling door 97: " + rest);
        System.out.println("laatste 2 cijfers: " + bankreknrLaatste2);

    }
}
