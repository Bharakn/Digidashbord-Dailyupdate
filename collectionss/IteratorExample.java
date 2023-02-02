package collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);

        System.out.println(l);

        Iterator it=l.iterator();
    //   System.out.println( it.next());//prints 1 number of the list

        while (it.hasNext()){
            System.out.println(it.next());
        } //create loop and prints the elements of the list one by one
    }
}
