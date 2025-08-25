package Day_1;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        a = scan.nextInt();
        System.out.println("Enter Second Number");
        b = scan.nextInt();
        System.out.println("Enter third Number");
        c = scan.nextInt();
        if(a>=b && a>=c){
            System.out.println("First Number");
        }
        else if(b>=a && b>=c){
            System.out.println("Second Number");
        }
        else {
            System.out.println("Third Number");
        }
    }
}
