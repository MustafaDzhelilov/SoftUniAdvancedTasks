package Healthy.src.restaurant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurant {

    private String name;
    private List<Salad> data;

    public Restaurant(String name){
        this.name = name;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(List<Salad> data) {
        this.data = data;
    }

    public List<Salad> getData() {
        return data;
    }

    public void add(Salad salad){
        this.data.add(salad);
    }
    public boolean buy(String name) {
        return this.data.removeIf((e -> e.getName().equals(name)));
    }

    public Salad getHealthiestSalad() {
        return this.data.stream().min(Comparator.comparing(Salad::getTotalCalories)).orElseThrow();
    }
    public int geCount(){
        return  this.data.size();
    }
    
    public String generateMenu() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%s have %d salads:",this.name, this.data.size())).append(System.lineSeparator());
        getData().forEach(output::append);
        return output.toString().trim();
    }
}
