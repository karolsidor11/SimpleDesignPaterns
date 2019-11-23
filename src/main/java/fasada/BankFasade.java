package fasada;

public class BankFasade implements BankFasadeInterface {

    private BankSystem bankSystem;
    private BankLogin bankLogin;

    public BankFasade() {
        bankLogin = new BankLogin();
        bankSystem = new BankSystem();
    }

    @Override
    public boolean identyfikacja(Long nrKartyBankowej, int PIN) {
        return bankLogin.identyfikacja(nrKartyBankowej, PIN);
    }

    @Override
    public float sprawdzStanKonta(Long nrKartyBankowej) {
        return bankSystem.sprawdzStanKonta(nrKartyBankowej);
    }

    @Override
    public String wyplacGotowke(int kwota) {
        return bankSystem.wyplacGotowke(kwota);
    }
}
