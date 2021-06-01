package observer;

public class TemperatureReader {

    private int nextNumber;

    public TemperatureReader(int nextNumber) {
        this.nextNumber = nextNumber;
    }

    public void update(int temperature) {
        System.out.println("Reader with the number : " + nextNumber + " indicates temperature " + temperature);
    }
}
