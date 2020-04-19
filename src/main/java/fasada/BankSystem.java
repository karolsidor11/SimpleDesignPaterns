package fasada;

public class BankSystem {

    public float checkAccountBalance(Long bankCardNumber) {
        if (bankCardNumber == 123456789) {
            return 10000f;
        }
        return 0.00f;
    }

    public String withdrawCash(Integer amount) {
        return "Z bankomatu wypłacono :" + amount + " PLN";
    }

    public String aktywujKarte(Long bankCardNumber) {
        return "Twoja  karta o nr: " + bankCardNumber + "  została aktywowana";
    }

    public void platnoscWeb() {

    }

    public void platnoscPrzelew() {

    }

    public void platnoscInternet() {

    }
}
