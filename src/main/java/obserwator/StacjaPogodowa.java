package obserwator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StacjaPogodowa implements StacjaPogodowaInterface {

    private List<CzytnikTemperatury> czytnikTemperaturies;
    private int temperatura;


    public StacjaPogodowa(int temperatura) {
        czytnikTemperaturies = new ArrayList<>();
        this.temperatura = temperatura;
    }

    @Override
    public void dodajCzytnikTemperatury(CzytnikTemperatury czytnikTemperatury) {

        czytnikTemperaturies.add(czytnikTemperatury);
    }

    @Override
    public void usunCzytnikTemperatury(CzytnikTemperatury czytnikTemperatury) {

        czytnikTemperaturies.remove(czytnikTemperatury);
    }

    @Override
    public void powiadomCzytnik() {

        Iterator<CzytnikTemperatury> iterator = czytnikTemperaturies.iterator();

        while (iterator.hasNext()) {
            CzytnikTemperatury czytnikTemperatury = iterator.next();
            czytnikTemperatury.update(temperatura);
        }
    }

    public void setTemperatura(int nowaTemperatura) {
        temperatura = nowaTemperatura;
        powiadomCzytnik();
    }
}
