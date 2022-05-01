package HealthyHeaven.src.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private  String name;
    private List<Salad> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Salad> getData() {
        return data;
    }

    public void setData(List<Salad> data) {
        this.data = data;
    }

    public Restaurant(String name){
        this.name = name;
        this.data = new ArrayList<>();
    }

    public void add(Salad salad){
        this.data.add(salad);
    }
    public boolean buy(String name) {
        return this.data.removeIf((e -> e.getName().equals(name)));
    }

    public List<Salad> getHealthiestSalad() {
        return data;
    }
    public int geCount(){
        return  this.data.size();
    }


    public String generateMenu() {
        StringBuilder output = new StringBuilder(String.format("%s have %d salads:",
                this.getName(), this.geCount()));
        output.append(System.lineSeparator());
        this.data.forEach(e -> output.append(e).append(System.lineSeparator()));
        return output.toString().trim();
    }

}
