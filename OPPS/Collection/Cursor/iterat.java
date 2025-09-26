package OPPS.Collection.Cursor;

//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterat {
    public static void main(String[] args) {
    List list = new ArrayList();
    list.add(10);
    list.add(20);
    list.add(30);

    Iterator iterator = list.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }


}
}
