package facade;

public class BankSystem {

    public static final int DEFAULT_CARD_NUMBER = 123456789;

    public float checkAccountBalance(Long bankCardNumber) {
        if (bankCardNumber == DEFAULT_CARD_NUMBER) {
            return 10000f;
        }
        return 0.00f;
    }

    public String withdrawCash(Integer amount) {
        return "The cash dispensed from the ATM : " + amount + " PLN";
    }

    public String aktywujKarte(Long bankCardNumber) {
        return "Your card number: " + bankCardNumber + "  has been activated.";
    }

    public void webPayments() {
        // Not implemented yet.
    }

    public void paymentsByBankTransfer() {
        // Not implemented yet.
    }

    public void internetPayments() {
        // Not implemented yet.
    }
}
