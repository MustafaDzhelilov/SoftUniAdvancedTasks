package Rabbits.src.rabbits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {

    private String name;
    private int capacity;
    private List<Rabbit> data;


    public Cage(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public  String getName(){
        return  name;
    }
    public  int getCapacity(){
        return capacity;
    }

    public void add(Rabbit rabbit){
        if(this.data.size() < this.capacity){
            this.data.add(rabbit);
        }
    }
    public boolean removeRabbit(String name) {
        for (int i = 0; i < data.size(); i++) {
            if(this.data.get(i).getName().equals(name)){
                this.data.remove(i);
                return true;
            }
        }
        return false;
    }

    public void removeSpecies(String species){
        this.data = this.data.stream().filter(e->!e.getSpecies()
                .equals(species)).collect(Collectors.toList());
    }

    public Rabbit sellRabbit(String name){
        this.data.stream().filter(e->e.getName().equals(name))
                .findFirst().ifPresent(v->v.setAvailable(false));
        return this.data.stream().filter(e->e.getName().equals(name))
                .findFirst().orElse(null);
    }

    public List<Rabbit> sellRabbitBySpecies(String species){
        this.data.stream().filter(e->e.getSpecies().equals(species))
                .forEach(v->v.setAvailable(false));
        return this.data.stream().filter(e->e.getSpecies()
                .equals(species)).collect(Collectors.toList());
    }

    public int count() {
        return this.data.size();
    }

    public String report(){
        StringBuilder output = new StringBuilder("Rabbits available at ");
        output.append(getName()).append(":").append(System.lineSeparator());
        this.data.stream().filter(Rabbit::isAvailable).forEach(v->output.append(v)
                .append(System.lineSeparator()));
        return output.toString();
    }


}
