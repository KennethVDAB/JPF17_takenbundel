package exceptions;

public class Isbn13Exception extends RuntimeException {

    public Isbn13Exception() {
    }

    public Isbn13Exception(String message) {
        super(message);
    }
}
