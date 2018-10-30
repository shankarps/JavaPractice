package generics;

public class Generic<U> {
    private U var;

    public Generic(U var){
        this.var = var;
    }

    public U getValue(){
        return var;
    }

    //Notice the <G> after static. This is to specify to the static method that
    //to use a Generic. This has nothing to do with this class's generic.
    public static <G> Generic  duplicate(Generic<G> var){
        return new Generic<G>(var.getValue());
    }

    public static void main(String a[]){
        //Create a generic
        Generic<Integer> var1 = new Generic<>(123);
        Generic var2 = var1.duplicate(var1);
        System.out.println(var2.getValue());

        Generic<String> genString = new Generic("Test");

        //Notice how we use an Integer Generic to dulicate a String.
        //This is because static methods have nothing to do with the class's generics.
        Generic var3 = var1.duplicate(genString);
        System.out.println(var3.getValue());



    }
}
