package Grooming_salon.src.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private  int capacity;
    private List<Pet> data;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Pet> getData() {
        return data;
    }

    public void setData(List<Pet> data) {
        this.data = data;
    }

    public GroomingSalon(int capacity){
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet){
        if(this.data.size() < this.capacity){
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf((e -> e.getName().equals(name)));
    }

    public Pet getPet(String name,String owner) {
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }

        return null;
    }

    public int getCount () {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder("The grooming salon has the following clients: ");
        for (Pet pet : data) {
            out.append(System.lineSeparator());
            out.append(pet.getName());
            out.append(" ");
            out.append(pet.getOwner());
        }
        return out.toString().trim();
    }



}
