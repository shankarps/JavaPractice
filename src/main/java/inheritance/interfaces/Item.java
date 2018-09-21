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
        items.add(new Item(3, "Dead list"));
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

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
