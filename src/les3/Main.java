package les3;

import drugs.Component;
import drugs.Drug;
import drugs.impl.CatDrug;
import drugs.impl.components.Azitron;
import drugs.impl.components.Pinecilin;
import drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrug drug = new CatDrug(componentCat);
        for (Component component : drug) {
            System.out.println(component);
        }

        List<Component> componentCat2 = List.of(new Azitron("Аз", "4", 6),
                new Pinecilin("Пин", "3", 7));
        List<Component> componentCat3 = List.of(new Pinecilin("пин", "4", 3),
                new Pinecilin("Азитромицин", "3", 7));
        List<Component> componentCat4 = List.of(new Azitron("Аз", "4", 2),
                new Pinecilin("Пин", "3", 5));


        CatDrug drug1 = new CatDrug(componentCat2);
        CatDrug drug2 = new CatDrug(componentCat3);
        CatDrug drug3 = new CatDrug(componentCat4);

        List<Drug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);

        Set <Component> componentSet = new HashSet<>();
        componentSet.add(new Pinecilin("пен", "4", 5));
        componentSet.add(new Pinecilin("пен", "4", 5));
        componentSet.add(new Azitron("азз", "4", 4));
        componentSet.add(new Water("вода", "10", 2));
        System.out.println("===== Множество ======");
        System.out.println(componentSet);

        System.out.println("Список лекарств: ");
        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println("Список лекарств отсортированный: ");
        System.out.println(drugs);

        List<Component> componentCat5 = List.of(new Azitron("Вода", "4", 5),
                new Pinecilin("Пин", "3", 5));

        CatDrug drug4 = new CatDrug(componentCat5);
        drugs.add(drug4);
        Collections.sort(drugs);
        System.out.println("-- Если два одинаковых --");
        System.out.println(drugs);


        List<Component> componentCat6 = List.of(new Azitron("Азитромиц", "4", 9),
                new Pinecilin("Водка", "10", 1));

        CatDrug drug5 = new CatDrug(componentCat6);
        drugs.add(drug5);
        Collections.sort(drugs);
        System.out.println("-- Если три одинаковых --");
        System.out.println(drugs);







    }

}
