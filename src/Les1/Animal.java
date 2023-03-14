package Les1;


public abstract class Animal {
    public String name;
    private String color;
    private int pawsCount;
    public static int animalsCount = 0;

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        animalsCount++;
    }

    public int getAnimalsCount() {
        return animalsCount;
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

    public void toPlay() {
        System.out.println("Played");
    }

    public void goToSleep() {
        System.out.println("Already aspeep...");
    }

    public abstract void speak();


    public abstract void hunt();

    @Override
    public String toString() {
        return String.format("Кличка: %s; окрас: %s", this.name, this.color);
    }
}

