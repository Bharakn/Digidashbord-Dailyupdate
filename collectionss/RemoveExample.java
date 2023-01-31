package collectionss;

import java.util.ArrayList;
import java.util.List;

public class RemoveExample {
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


        //remove
        System.out.println("before : "+l1);
        l1.remove(0);//by index
        System.out.println("after remove(0): "+l1);

        System.out.println(" ");
        System.out.println("before : "+l2);
        l2.remove("Bharath");//by object
        System.out.println("after remove(Bharath) : "+l2);
        l2.remove(Integer.valueOf(5));//by object for int values
        l2.remove(Double.valueOf(100.5));//by object for double values
        System.out.println("Remove by object for int and double : "+l2);

    }
}
