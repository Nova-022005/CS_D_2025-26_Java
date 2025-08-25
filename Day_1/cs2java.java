package Day_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cs2java {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Day_1/mad"));
        String name=scan.nextLine();
        System.out.println(name);
    }
}
