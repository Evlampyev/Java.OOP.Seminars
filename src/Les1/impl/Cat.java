package Les1.impl;

import Les1.Animal;
import Les1.Illable;
import Les1.Runnable;

/**
 * Кот
 */
public class Cat extends Animal implements Illable, Runnable {
    public Cat(String name, String color, int i) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }

    public void toPlay() {
        System.out.println("Cat played");
    }

    public void goToSleep() {
        System.out.println("Cat already aspeep...");
    }

    private void eat() {
        System.out.println("Cat ate...");
    }

    private void findFood() {
        System.out.println("Cat found food...");
    }

    protected void wakeUp() {
        System.out.println("Cat wake up!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    public void getill() {
        System.out.printf("%s заболел \n", this.getType());
    }

    @Override
    public void speak() {
        System.out.println("Murrrr!");
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getRunSpeed() {
        return 13;
    }


}



