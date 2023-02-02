package collectionss;

import java.util.ArrayList;
import java.util.List;

public class IsemptySizeClear {
    public static void main(String[] args) {
        List l1=new ArrayList<>();
        l1.add(100);
        l1.add(400.0);
        l1.add("Bharath");
        l1.add('A');

        List l2=new ArrayList<>();

        //isEmpty
        System.out.println(l1.isEmpty());
        System.out.println(l2.isEmpty());

        //size
        System.out.println(l1.size());
        System.out.println(l2.size());

        //toArray
        l1.toArray();
        System.out.println(l1);

        //clear
       l1.clear();
       System.out.println(l1.isEmpty());
       System.out.println(l1.size());



    }
}
