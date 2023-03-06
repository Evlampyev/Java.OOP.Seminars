package Les1;

public class Dog extends Animal{
    public Dog(String name, String color){
        super(name,color,4);
    }
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Gau-Gau!");
    }
}
