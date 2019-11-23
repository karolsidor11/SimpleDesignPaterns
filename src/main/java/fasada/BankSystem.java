package fasada;


public class BankSystem {

    public float sprawdzStanKonta(Long nrKartyBankowej) {
        if (nrKartyBankowej == 123456789) {
            return 10000f;
        }
        return 0.00f;
    }

    public String wyplacGotowke(Integer kwota){
        return "Z bankomatu wypłącono :"+kwota+" PLN";
    }

    public String aktywujKarte(Long nrKartyBankowej){
        return "Twoja  karta o nr: "+ nrKartyBankowej+"  została aktywowana";
    }

    public void platnoscWeb(){

    }
    public void platnoscPrzelew(){

    }
    public void platnoscInternet(){

    }
}
