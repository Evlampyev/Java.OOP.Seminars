package les3;

import drugs.Component;
import drugs.Drug;
import drugs.impl.CatDrug;
import drugs.impl.components.Azitron;
import drugs.impl.components.Pinecilin;
import drugs.impl.components.Water;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
                new Pinecilin("Пин", "3", 7));
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

        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);



    }

}
