package Car_Dealership.src.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    public String name;
    public int capacity;
    public List<Car> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getData() {
        return data;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }

    public Dealership(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) {
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        return this.data.removeIf
                ((e -> e.getManufacturer().equals(manufacturer)
                        && e.getModel().equals(model)));
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
            if (c.manufacturer.equals(manufacturer)
                    && c.model.equals(model)) {
                return c;
            }
        }

        return null;
    }
    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();
        out.append(String.format("The cars are in a car dealership %s:",this.name)).append(System.lineSeparator());
        getData().forEach(out::append);
        return out.toString().trim();
    }

}

