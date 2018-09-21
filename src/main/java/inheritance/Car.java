package inheritance;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * A class that implements Vehicle abstract class.
 */
public class Car extends Vehicle {

    public static void main(String ar[]){
        ArrayList<Vehicle> cars = new ArrayList<>();
        cars.add(new Car("Aston Martin DB7", 10000d));
        cars.add(new Car("Ferrari 400", 20000d));
        cars.add(new Car("Bugatti Chiron", 30000d));
        cars.add(new Car("Tesla S", 40000d));

        //Print the price in different formats
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        for(Vehicle c: cars){
            System.out.println(String.format(String.format("Vehicle type " + c.getClass().getSimpleName() + " name " + c.getName() + " price " + formatter.format(c.getPrice()) )));

        }

    }
    private double price;

    public Car(){
        super();
    }

    public Car(String name, double price){
        super(name);
        this.price = price;
    }

    @Override
    /**
     * Override the abstract method.
     */
    public double getPrice() {
        return price;
    }
}
