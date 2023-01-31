package collectionss;

import java.util.ArrayList;
import java.util.List;

public class AddExample {
    public static void main(String[] args) {
        List l1=new ArrayList();
        //add method
        l1.add(100);
        l1.add(500);
        l1.add(0.5);
        l1.add('A');
        l1.add("Bharath");
        l1.add(true);
        System.out.println("Add method :"+l1);

        List l2=new ArrayList();
        //add method
        l2.add(1);
        l2.add(5);
        l2.add(100.5);
        l2.add('C');
        l2.add("Bharath");
        l2.add(true);

        System.out.println("Add method :"+l2);

        //addAll

        l1.addAll(l2);
        System.out.println("AddAll method(l1+l2) :"+l1);


        System.out.println(" ");
        System.out.println("Elements value with index");
        for(int i=0;i<l1.size();i++){
            System.out.println("index : "+i+"  value : "+l1.get(i));
        }

        //add by index
        l1.add(0,"Start");
        System.out.println("index 0 added "+l1);
        l1.add(10,1000);
        System.out.println("index 10 changed "+l1);
        System.out.println( l1.size());
       // l1.add(100,"index 100"); index out of bound exception
        l1.add(1,101);
        l1.add(15,150);
        System.out.println(l1);


    }
}
