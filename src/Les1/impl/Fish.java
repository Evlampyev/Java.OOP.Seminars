package Les1.impl;

import Les1.Animal;
import Les1.Illable;
import Les1.Swimable;

/**
 * Рыба
 */
public class Fish extends Animal implements Illable, Swimable {
    public Fish(String name, String color) {
        super(name, color, 0);
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("...");
    }

    @Override
    public void hunt() {
        System.out.println(getType() +  " Hunting");
    }

    @Override
    public void getill() {

    }

    @Override
    public int getSwimSpeed() {
        return 8;
    }
}
