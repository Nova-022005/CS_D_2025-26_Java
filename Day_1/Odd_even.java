package Day_1;
import java.util.Scanner;

public class Odd_even {
   public static void main(String[] args) {
       System.out.print("Enter number: ");
       int a;
       Scanner sc=new Scanner(System.in);
       a = sc.nextInt();
       if((a&1)==0){
           System.out.println("Even Number");
       }
       else {
           System.out.println("Odd Number");
       }
   }

}
