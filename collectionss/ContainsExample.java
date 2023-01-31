package collectionss;

import java.util.ArrayList;
import java.util.List;

public class ContainsExample {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add(100);
        l1.add(500);
        l1.add(0.5);
        l1.add('A');
        l1.add("Bharath");
        l1.add(true);


        List l2=new ArrayList();
        l2.add(1);
        l2.add(5);
        l2.add(100.5);
        l2.add('C');
        l2.add("Bharath");
        l2.add(true);

        List l3=new ArrayList<>();
        l3.add(100);

        System.out.println(l1);
        System.out.println(l2);
       System.out.println( l1.contains(100));
       System.out.println(l2.contains(100000));
       System.out.println(l1.containsAll(l3));
       System.out.println(l3.containsAll(l1));
    }
}
