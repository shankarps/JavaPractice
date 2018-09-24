package inheritance.interfaces;

import java.util.ArrayList;
import java.util.Collections;

/**
 * An example of Comparable interface
 */
public class Item implements Comparable<Item> {

    private int id;
    private String name;

    public static void main(String ar[]){
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Squats"));
        items.add(new Item(2, "Bench press"));
        items.add(new Item(3, "Dead lift"));
        items.add(new Item(4, "Press"));

        System.out.println("before sorting");
        items.forEach(System.out::println);

        Collections.sort(items);
        System.out.println("after sorting");
        items.forEach(System.out::println);

    }

    @Override
    /**
     * Override the compareTo method. Using generics (Comparable<Item>) helped here.
     * We can avoid compareTo(Object) and casting.
     */
    public int compareTo(Item i) {
        return this.name.compareTo(i.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Item)) return false;
        if (!super.equals(object)) return false;

        Item item = (Item) object;

        if (getId() != item.getId()) return false;
        if (!getName().equals(item.getName())) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getId();
        result = 31 * result + getName().hashCode();
        return result;
    }
}
