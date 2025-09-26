package OPPS.Collection.Cursor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;

public class enumer {
    public static void main(String[] args) {
        Stack list = new Stack();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Enumeration items = list.elements();
        while (items.hasMoreElements()) {
            System.out.println(items.nextElement());
        }
    }
}
