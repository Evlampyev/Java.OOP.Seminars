package Les1;

import java.sql.SQLSyntaxErrorException;

public class Animal {
    public String name;
    private String color;
    private int pawsCount;

    public String getType() {
        return this.getClass().getSimpleName();
    }
    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public void toPlay() {
        System.out.println("Played");
    }

    public void goToSleep() {
        System.out.println("Already aspeep...");
    }

    public void speak() {
        System.out.println("Yarr!!!");
    }

    public void eat() {
        System.out.println("Ate...");
    }

    public void findFood() {
        System.out.println("Found food...");
    }
    public void wakeUp () {
        System.out.println("I am wake up!");
    }
}
