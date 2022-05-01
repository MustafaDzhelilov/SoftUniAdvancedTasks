package Parking.src.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private List<Car> data;
    private String type;
    private int capacity;

    public String getType() {
        return this.type;
    }

    public int getCapacity() {
        return this.capacity;
    }


    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public boolean remove(String manufacturer, String model) {
        return this.data.removeIf((e -> e.getManufacturer().equals(manufacturer)
                && e.getModel().equals(model)));
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) {
            this.data.add(car);
        }
    }

    public Car getLatestCar() {
        Car car = null;
        for (Car c : data) {
            if (car == null ||
                    car.getYear() < c.getYear()) {
                car = c;

            }

        }
        return car;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car c : data) {
            if (c.getManufacturer().equals(manufacturer)
                    && c.getModel().equals(model)) {
                return c;
            }
        }

        return null;
    }

    public int getCount() {
        return this.data.size();
    }


    public String getStatistics() {
        StringBuilder out = new StringBuilder("The cars are parked in  + type + :");
        for (Car car : data) {
            out.append(System.lineSeparator());
            out.append(car.toString());
        }
        return out.toString();
    }

}

