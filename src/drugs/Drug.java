package drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        int result = Integer.compare(power, o.getDrugPower());
        if (result == 0) {
            result = this.getName().compareTo(o.getName());
        }
        return result;
    }


    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    public String getName() {
        String name = "";
        for (Component comp : components) {
            name = name + "-" + comp.getName();
        }
        return name;
    }

    private final List<Component> components;

    int index;

    public Drug(List<Component> component) {
        this.components = component;
        this.index = 0;
    }


    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, FullPower: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }
}
