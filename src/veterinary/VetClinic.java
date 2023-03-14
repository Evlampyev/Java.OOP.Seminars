package veterinary;

import Les1.Animal;
import Les1.Flyable;
import Les1.Runnable;
import Les1.Swimable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    private static int countPatient = 0;

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        countPatient++;
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void printAnimals() {
        for (Animal animal : animals
        ) {
            System.out.printf("%s по кличке %s", animal.getType(), animal.getName());
            if (animal.getColor() != null) {
                System.out.printf(" окрас %s", animal.getColor());
            }
            System.out.println();
        }
    }

    public int getCountPatient() {
        return countPatient;
    }

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public void getRunablePatients() {
        System.out.println("---Бегающие:--- ");
        for (Animal animal : animals) {
            if (animal instanceof Runnable) {
                System.out.printf("%s по кличке %s\n", animal.getType(), animal.name);
            }
        }
    }

    public void getSwimablePatients() {
        System.out.println("---Плавающие:--- ");
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                System.out.printf("%s по кличке %s\n", animal.getType(), animal.name);
            }
        }
    }

    public void getFlyablePatients() {
        System.out.println("---Летающие:--- ");
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.printf("%s по кличке %s\n", animal.getType(), animal.name);
            }
        }
    }

}
