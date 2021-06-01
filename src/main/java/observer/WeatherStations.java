package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherStations implements WeatherStation {

    private List<TemperatureReader> temperatureReaders;
    private int temperature;

    public WeatherStations(int temperature) {
        temperatureReaders = new ArrayList<>();
        this.temperature = temperature;
    }

    @Override
    public void addTemperatureReader(TemperatureReader temperatureReader) {
        temperatureReaders.add(temperatureReader);
    }

    @Override
    public void deleteTemperatureReader(TemperatureReader temperatureReader) {
        temperatureReaders.remove(temperatureReader);
    }

    @Override
    public void notifyReader() {
        Iterator<TemperatureReader> iterator = temperatureReaders.iterator();

        while (iterator.hasNext()) {
            TemperatureReader temperatureReader = iterator.next();
            temperatureReader.update(temperature);
        }
    }

    public void setTemperature(int newTemperature) {
        temperature = newTemperature;
        notifyReader();
    }
}
