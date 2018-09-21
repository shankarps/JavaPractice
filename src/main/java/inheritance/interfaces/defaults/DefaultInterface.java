package inheritance.interfaces.defaults;

/**
 * Check the static and default methods of Interfaces in Java 8
 */
public interface DefaultInterface {
    //Static method in interface. Must have body.
    public static void printMessage(){
        System.out.println("Static message in Interface");
    }

    default void printDefaultMessage(){
        //"this" operator in Interface!!!
        System.out.println("Default message in Interface  "+ this.getClass().getName());
    }
}
