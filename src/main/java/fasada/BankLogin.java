package fasada;

public class BankLogin {

    public boolean identyfikacja(Long nrKartyBankowej, int PIN) {
        if (nrKartyBankowej == 123456789L && PIN == 1234) {
            return true;
        }
        return false;
    }

    public void identyfikacjaWeb( String id, String haslo){

    }
}
