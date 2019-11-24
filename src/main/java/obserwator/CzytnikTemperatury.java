package obserwator;

public class CzytnikTemperatury {

    private int nrKolejny;

    public CzytnikTemperatury(int nrKolejny) {
        this.nrKolejny = nrKolejny;
    }

    public void   update(int temperatura){
        System.out.println("Czytnik o numerze : "+nrKolejny+" wskazuje temperature "+temperatura);
    }
}
