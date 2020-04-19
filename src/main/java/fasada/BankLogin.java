package fasada;

public class BankLogin {

    public boolean identification(Long bankCardNumber, int PIN) {
        if (bankCardNumber == 123456789L && PIN == 1234) {
            return true;
        }
        return false;
    }

    public void webIdentification(String id, String password){

    }
}
