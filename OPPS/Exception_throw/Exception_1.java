package OPPS.Exception_throw;

import java.io.FileInputStream;

public class Exception_1 {
    public static void main(String[] args){
        try{
            FileInputStream fs =new FileInputStream("aa.txt");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Namaste");
        System.out.println("Hello");
        System.out.println("hi");
        System.out.println("Namaste");
        System.out.println("Hello");
        System.out.println("hi");
        try{
            System.out.println(330/0);
        }
        catch(Exception e){
      System.out.println(e.toString());

        }
        System.out.println("Hello");
        System.out.println("hi");
        try {
            Class<?> clazz = Class.forName("com.example.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }

}
