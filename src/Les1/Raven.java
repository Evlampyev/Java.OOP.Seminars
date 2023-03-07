package Les1;

/**
 * Ворон
 */
public class Raven extends Animal {
    public Raven(String name, String color) {
        super(name, color, 2);
    }

    public Raven(String name) {
        super(name);
    }

    public void swim() {
        super.swim("I can't swim");
    }

    @Override
    public void speak() {
        System.out.println("Kar-Karrr!");
    }
}
