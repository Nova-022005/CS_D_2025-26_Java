package OPPS.Interface;

//An empty interface in Java—also known as a marker interface—is an
//        interface that contains no methods or fields.
//It’s used to tag or mark a class with metadata that can be
//        recognized by the compiler or JVM to apply special behavior.


//abstraction is used for sharing code among related classes (e.g., Animal, Vehicle)
// Interface is used for defining capabilities across unrelated classes (e.g., Flyable)
// All methods in Interface are abstract by default (until Java 8 added default/static)

interface Inter1{
    int salar =112;   // By default, all variables are public static final in Interface.
    void method_1();   // By default, all  methods are public and abstract in Interface.
}
interface Inter2{
    int salar =122;   // By default, all variables are public static final in Interface.
    void method_2();   // By default, all  methods are public and abstract in Interface.
}
public class Test_1 implements Inter1,Inter2{

   public static void main(String[] args) {
        System.out.println("Main Entry Point");

    }
    public void method_1(){
       System.out.println("Method 1 Entry");
    }
    public void method_2(){
       System.out.println("Method 2 Entry");
    }
}
