package Les1.impl;

import Les1.Animal;
import Les1.Illable;
import Les1.Runnable;
import Les1.Swimable;

public class Dog extends Animal implements Illable, Runnable, Swimable {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Gau-Gau!");
    }

     @Override
    public void hunt() {

    }

    @Override
    public void getill() {

    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
