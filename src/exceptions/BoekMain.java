package exceptions;

public class BoekMain {
    public static void main(String[] args) {
        try {
            var boekje = new Leesboek("Boektitel", "Lasers in space", "Aewyn", 20.0F, "978-0-306-48615-6", "SciFi");
            System.out.println(boekje);
        } catch (Isbn13Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
