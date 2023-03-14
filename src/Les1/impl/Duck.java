package Les1.impl;

import Les1.Animal;
import Les1.Flyable;
import Les1.Illable;
import Les1.Swimable;

/**
 * Утка
 */
public class Duck extends Animal implements Flyable, Illable, Swimable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("I fly");
    }

    @Override
    public void speak() {
        System.out.println("Krya-krya!");
    }

    @Override
    public void hunt() {
        System.out.println("Hunting");
    }



    @Override
    public void getill() {

    }

    @Override
    public int getFlyghtSpeed() {
        return 90;
    }

    @Override
    public int getSwimSpeed() {
        return 12;
    }
}
