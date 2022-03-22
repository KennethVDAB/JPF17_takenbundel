package oo;

public class Kaart {
    private static final String[] kleuren = {"harten", "ruiten", "klaveren",
            "schoppen"};
    private static final String[] rangen = {"2", "3", "4", "5", "6", "7", "8",
            "9", "10", "boer", "vrouw", "heer", "aas"};
    //static --> gelijk voor alle objecten!!
    private final int kleur;
    private final int rang;

    public Kaart() {
        kleur = (int) (Math.random() * 4); //index van de array's
        rang = (int) (Math.random() * 13);
    }

    public String getKleur() {
        return kleuren[kleur];
    }

    public String getRang() {
        return rangen[rang];
    }

    public void printKaart() {
        System.out.println("kleur = " + getKleur() +
                " en rang = " + getRang());
    }

    public boolean isHogerDan(Kaart k2) {
        return (kleur > k2.kleur) ||
                ((kleur == k2.kleur) && (rang > k2.rang));
    }

}
