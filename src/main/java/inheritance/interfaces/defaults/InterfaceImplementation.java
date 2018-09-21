package inheritance.interfaces.defaults;

public class InterfaceImplementation implements DefaultInterface {

    //Note that we cannot override the static method & default method.
    //Default method can be overridden by a child iterface, but not by implementing class.

    public static void main(String a[]){
        InterfaceImplementation impl = new InterfaceImplementation();
        //only way to call the static method
        DefaultInterface.printMessage();
        //call the default message
        impl.printDefaultMessage();
    }
}
