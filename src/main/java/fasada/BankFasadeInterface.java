package fasada;

public interface BankFasadeInterface {

    boolean identyfikacja(Long nrKartyBankowej, int PIN);

    float sprawdzStanKonta(Long nrKartyBankowej);

    String wyplacGotowke(int kwota);
}
