package Les1.impl;

import Les1.Animal;
import Les1.Flyable;
import Les1.Illable;

/**
 * Ворон
 */
public class Raven extends Animal implements Illable, Flyable {
    public Raven(String name, String color) {
        super(name, color, 2);
    }

    public Raven(String name) {
        super(name);
    }


    @Override
    public void speak() {
        System.out.println("Kar-Karrr!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlyghtSpeed() {
        return 50;
    }

    @Override
    public void getill() {

    }
}
