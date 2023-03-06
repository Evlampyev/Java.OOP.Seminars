package Les1;

public class Cat extends Animal {
    public Cat(String name, String color){
        super(name,color,4);
    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Murrrr!");
    }
}



