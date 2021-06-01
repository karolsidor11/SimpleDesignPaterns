package facade;

public interface BankFacadeInterface {

    boolean identification(Long bankCardNumber, int PIN);

    float checkAccountBalance(Long bankCardNumber);

    String withdrawCash(int amount);
}
