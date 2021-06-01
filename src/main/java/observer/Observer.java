package observer;

public class Observer {

    public static void main(String[] args) {

        WeatherStations weatherStations = new WeatherStations(25);

        TemperatureReader firstTemperatureReader = new TemperatureReader(1);
        TemperatureReader secondTemperatureReader = new TemperatureReader(2);

        weatherStations.addTemperatureReader(firstTemperatureReader);
        weatherStations.addTemperatureReader(secondTemperatureReader);

        weatherStations.setTemperature(27);
    }
}
