package Les1;

/**
 * Рыба
 */
public class Fish extends Animal {
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
    public void fly() {
        System.out.println(getType() +  " I can't fly");
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " I don't have paws");
    }
}
