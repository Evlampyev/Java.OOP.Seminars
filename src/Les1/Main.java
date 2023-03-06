package Les1;

public class Main {
    /**
     * Main function to run
     *
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 1);
        System.out.println(animal.getColor());

        Animal animal1 = new Animal("Bars");
        System.out.println(animal1.name);


    }
}