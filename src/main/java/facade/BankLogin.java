package facade;

public class BankLogin {

    public static final int DEFAULT_PIN = 1234;
    public static final long DEFAULT_CARD_NUMBER = 123456789L;

    public boolean identification(Long bankCardNumber, int PIN) {
        if (bankCardNumber == DEFAULT_CARD_NUMBER && PIN == DEFAULT_PIN) {
            return true;
        }
        return false;
    }

    public void webIdentification(String id, String password) {
        // Not implemented yet.
    }
}
