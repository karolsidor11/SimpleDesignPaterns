package fasada;

public class BankFasade implements BankFasadeInterface {

    private BankSystem bankSystem;
    private BankLogin bankLogin;

    public BankFasade() {
        bankLogin = new BankLogin();
        bankSystem = new BankSystem();
    }

    @Override
    public boolean identification(Long bankCardNumber, int PIN) {
        return bankLogin.identification(bankCardNumber, PIN);
    }

    @Override
    public float checkAccountBalance(Long bankCardNumber) {
        return bankSystem.checkAccountBalance(bankCardNumber);
    }

    @Override
    public String withdrawCash(int amount) {
        return bankSystem.withdrawCash(amount);
    }
}
