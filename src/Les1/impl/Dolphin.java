package Les1.impl;

import Les1.Animal;
import Les1.Illable;
import Les1.Swimable;

/**
 * Дельфин
 */
public class Dolphin extends Animal implements Illable, Swimable {
    public Dolphin(String name, String color) {
        super(name, color, 0);
    }

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Aaaau-Aaaaauuu");
    }

    /**
     * Охотится дельфин
     */
    @Override
    public void hunt() {

    }


    @Override
    public void getill() {

    }

    @Override
    public int getSwimSpeed() {
        return 28;
    }
}
