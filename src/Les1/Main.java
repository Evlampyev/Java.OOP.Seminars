package Les1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Main function to run
     *
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 1);
        System.out.println(animal.getColor());

        Animal animal1 = new Animal("Bars");
        System.out.println(animal1.name);

        System.out.println(animal1.getType());
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Bax", "Grey");
        System.out.println(cat1.name);
        System.out.println(cat1.getType());
        System.out.println("----------");
        System.out.print("Cat speak: ");
        cat1.speak();
        System.out.print("Animal speak: ");
        animal1.speak();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(new Duck("Дональд"));
        animals.add(new Dog("Бобик"));
        animals.add(cat2);
        System.out.println("Весь лист: ");
        animals.forEach(System.out::println);
        System.out.println("+++");
        for (Animal a: animals) {
            System.out.println(a);
            if (a instanceof Duck) ((Duck) a).fly();
            }
        System.out.println("--Huntering--");
        cat1.hunt();
        }
    }
