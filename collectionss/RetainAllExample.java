package collectionss;

import java.util.ArrayList;
import java.util.List;

public class RetainAllExample {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add("pen");
        l1.add("paper");
        l1.add("book");
        l1.add("box");
        l1.add("bharath");



        List l2=new ArrayList();
        l2.add("pen1");
        l2.add("pen");
        l2.add("paper");
        l2.add("book1");
        l2.add("box");
        l2.add("bharath1");


        System.out.println(l1);
        System.out.println(l2);
        l1.retainAll(l2);
        System.out.println(l1);


    }
}
