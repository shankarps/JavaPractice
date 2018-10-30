package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionTest {

    public ExceptionTest(){
        int y = 1/0;
    }
    public static void main(String ar[]){
        int x= 2;
        int y= 0;
        int z =0;
        try {
            z = x / y;
        }catch(ArithmeticException e){
            System.err.println(e.getClass() +"  "+e.getMessage());
        }

        System.out.println(" z = "+z);

        try {
            ExceptionTest.class.newInstance();
        } catch (InstantiationException | IllegalAccessException|ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Finally block");
        }

        //Try with an Autoclosable resource
        try(BufferedReader br = Files.newBufferedReader(Paths.get("src","main","java","exception","ExceptionTest.java"))){
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
