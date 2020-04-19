package obserwator;

public interface WeatherStation {

    void addTemperatureReader(TemperatureReader temperatureReader);

    void deleteTemperatureReader(TemperatureReader temperatureReader);

    void notifyReader();
}
