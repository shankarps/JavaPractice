package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsFeatureTest {

    @Test(expected = ClassCastException.class)
    public void runNoGenericsWithClassCashException(){
        List noGenericList = new ArrayList();
        noGenericList.add(4);
        noGenericList.add(5);
        noGenericList.add("A String");

        //Iterate and Cast. An exception will be thrown
        for(Object obj: noGenericList){
            Integer intg = (Integer) obj;
            System.out.println("integer "+intg);
        }
    }

    @Test
    public void testGenerics(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(System.out::println);

    }


}
