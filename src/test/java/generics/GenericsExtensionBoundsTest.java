package generics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test generics extension and bounds.
 */
public class GenericsExtensionBoundsTest {

    List<Phone> phones = Arrays.asList(new Phone("iPhone 6"), new Phone("iPhone 7"), new Phone("iPhone 8"));

    List<Electronics> items = Arrays.asList(new Electronics("test1"), new Electronics("test2"));

    @Test
    public void iterateListTest(){
        iterateList(phones);
    }

    @Test
    public void iterateParentList(){
        iteratePhonesAndSublclass(phones);
        iteratePhonesAndSublclass(items);

    }
    @Test
    public void iterateSuperClassTest(){
        printName(phones);
        printName(items);

    }

    public void iterateList(List<Phone> phones){
        phones.stream().map(s -> s.getName()).forEach(System.out::println);
    }

    public void iteratePhonesAndSublclass(List<? extends Electronics> list){
        list.stream().map(s -> s.getName()).forEach(System.out::println);
    }

    public void printName(List<? super Phone> list){
        list.stream().map(s -> toString()).forEach(System.out::println);
    }
}

//Create a hierarchy - An interface and ts subclass
// (Shippable <- Electronics <- Phone)

interface Shippable{
    default void printLabel(){
        System.out.println("Class "+this.getClass().getName());
    }
}

class Electronics implements Shippable{

    private String name;

    public Electronics(){
    }

    public Electronics(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Phone extends Electronics{

    private String name;

    public Phone(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

