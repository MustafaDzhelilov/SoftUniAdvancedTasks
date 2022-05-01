package VetClinic.src.vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {

    private  int capacity;
    private List<Pet> data;

    public int getCapacity() {
        return capacity;
    }

    public Clinic(int capacity){
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

    public Pet getPet(String name, String owner) {
        for (Pet c : data) {
            if (c.getName().equals(name)
                    && c.getOwner().equals(owner)) {
                return c;
            }
        }

        return null;
    }

    public Pet getOldestPet() {
        Pet car = null;
        for (Pet c : data) {
            if (car == null ||
                    car.getAge() < c.getAge()) {
                car = c;

            }

        }
        return car;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder("The clinic has the following patients:");
        for (Pet pet : data) {
            out.append(System.lineSeparator());
            out.append(pet.toString());
            out.append(pet.getOwner().toString());
        }
        return out.toString();
    }



}
