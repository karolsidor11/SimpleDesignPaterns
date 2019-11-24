package obserwator;

public class Obserwator {

    public static void main(String[] args) {

        StacjaPogodowa stacjaPogodowa= new StacjaPogodowa(25);

        CzytnikTemperatury czytnikTemperatury = new CzytnikTemperatury(1);
        CzytnikTemperatury czytnikTemperatury1 = new CzytnikTemperatury(2);

        stacjaPogodowa.dodajCzytnikTemperatury(czytnikTemperatury);
        stacjaPogodowa.dodajCzytnikTemperatury(czytnikTemperatury1);

        stacjaPogodowa.setTemperatura(27);

    }
}
