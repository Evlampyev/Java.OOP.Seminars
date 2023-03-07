package Les1;

/**
 * Кот
 */
public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }

    public void swim() {
        super.swim("I can't swim");
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

    private void wakeUp() {
        System.out.println("Cat wake up!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public void speak() {
        System.out.println("Murrrr!");
    }

    @Override
    public void fly() {
        System.out.println(getType() +  " I can't fly");
    }
}



