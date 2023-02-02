package collectionss;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("Amar");
        //str.add(1); compile time error
        str.add("Sahana");
        str.add("Yashwanth");
        str.add("Anusha");

        System.out.println(str);

        List<Integer> i=new ArrayList<>();
        i.add(1);
        //i.add("Bharath"); compile time error
        i.add(2);
        i.add(10);

        System.out.println(i);
    }
}
