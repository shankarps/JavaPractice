package inheritance;

import java.time.LocalDate;

/**
 * An abstract class.
 */
public abstract class Vehicle {

    private String name;
    private LocalDate date;

    public Vehicle(){
        this("DEFAULT_NAME");
    }

    public Vehicle(String name){
        this.name = name;
    }

    //Abstract method. No body.
    public abstract double getPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
