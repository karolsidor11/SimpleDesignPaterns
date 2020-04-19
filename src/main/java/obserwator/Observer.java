package obserwator;

public class Observer {

    public static void main(String[] args) {

        WeatherStations weatherStations = new WeatherStations(25);

        TemperatureReader temperatureReader = new TemperatureReader(1);
        TemperatureReader temperatureReader1 = new TemperatureReader(2);

        weatherStations.addTemperatureReader(temperatureReader);
        weatherStations.addTemperatureReader(temperatureReader1);

        weatherStations.setTemperatura(27);

    }
}
