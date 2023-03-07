package Les1;

/**
 * Орел
 */
public class Eagle extends Animal {
    public Eagle(String name, String color) {
        super(name, color, 2);
    }

    public Eagle(String name) {
        super(name);
    }

    public void swim() {
        super.swim("I can't swim");
    }

    @Override
    public void speak() {
        System.out.println("Eagle: Piuuuuuuu!");
    }

}
