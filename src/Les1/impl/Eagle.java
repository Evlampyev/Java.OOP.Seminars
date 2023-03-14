package Les1.impl;

import Les1.Animal;

import Les1.Flyable;
import Les1.Illable;

/**
 * Орел
 */
public class Eagle extends Animal implements Illable, Flyable {
    public Eagle(String name, String color) {
        super(name, color, 2);
    }

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void hunt(){

    };

    @Override
    public void speak() {
        System.out.println("Eagle: Piuuuuuuu!");
    }

    @Override
    public int getFlyghtSpeed() {
        return 200;
    }

    @Override
    public void getill() {

    }
}
