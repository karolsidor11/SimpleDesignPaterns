package fasada;

public interface BankFasadeInterface {

    boolean identification(Long bankCardNumber, int PIN);

    float checkAccountBalance(Long bankCardNumber);

    String withdrawCash(int amount);
}
