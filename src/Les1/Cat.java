package Les1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Murrrr!");
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
}



