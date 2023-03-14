package Les2;

import Les1.Animal;
import Les1.Flyable;
import Les1.Illable;
import Les1.Runnable;
import Les1.impl.*;
import veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик", "чёрный", 4))
                .addAnimal(new Dog("Бобик"))
                .addAnimal((new Duck("Дональд")));


        List<Illable> illableList = new ArrayList<>();
        illableList.add((new Cat("Бакс")));
        illableList.add(new Human());

        List<Flyable> flyableList = new ArrayList<>();
        flyableList.add(new Eagle("Белый орел"));
        flyableList.add(new Duck("Дональд"));
        for (Flyable flyer : flyableList) {
            System.out.printf("%s летает со скоростью %d \n", flyer.getType(), flyer.getFlyghtSpeed());
        }

        System.out.println("Сколько животных - " + Animal.animalsCount);

        List<Runnable> runableList = new ArrayList<>();
        runableList.add(new Cat("Бакс"));
        runableList.add(new Cat("Василий"));
        runableList.add(new Dog("Рекс"));

        for (Runnable runner : runableList) {
            System.out.printf("%s бегает со скоростью %d \n", runner.getType(), runner.getRunSpeed());

        }

        vetClinic
                .addAnimal(new Dog("Rex"))
                .addAnimal(new Duck("Duck"))
                .addAnimal(new Dolphin("Willy"))
                .addAnimal(new Eagle("Alex"))
                .addAnimal(new Raven("Ворон", "Черный ворон"));


        System.out.printf("В клинике всего %d пациентов", vetClinic.getCountPatient());
        System.out.println(vetClinic.getAnimals());
        vetClinic.printAnimals();
        vetClinic.getRunablePatients();
        vetClinic.getSwimablePatients();
        vetClinic.getFlyablePatients();
    }
}
