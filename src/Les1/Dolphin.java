package Les1;

/**
 * Дельфин
 */
public class Dolphin extends Animal {
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

    @Override
    public void fly() {
        System.out.println(getType() + " I can't fly");
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " I don't have paws");
    }
}
