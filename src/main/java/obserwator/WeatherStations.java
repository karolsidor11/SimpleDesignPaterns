package obserwator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherStations implements WeatherStation {

    private List<TemperatureReader> czytnikTemperaturies;
    private int temperatura;


    public WeatherStations(int temperatura) {
        czytnikTemperaturies = new ArrayList<>();
        this.temperatura = temperatura;
    }

    @Override
    public void addTemperatureReader(TemperatureReader temperatureReader) {

        czytnikTemperaturies.add(temperatureReader);
    }

    @Override
    public void deleteTemperatureReader(TemperatureReader temperatureReader) {

        czytnikTemperaturies.remove(temperatureReader);
    }

    @Override
    public void notifyReader() {

        Iterator<TemperatureReader> iterator = czytnikTemperaturies.iterator();

        while (iterator.hasNext()) {
            TemperatureReader temperatureReader = iterator.next();
            temperatureReader.update(temperatura);
        }
    }

    public void setTemperatura(int nowaTemperatura) {
        temperatura = nowaTemperatura;
        notifyReader();
    }
}
