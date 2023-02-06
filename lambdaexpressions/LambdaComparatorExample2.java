package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparatorExample2 {
    ArrayList<String > al=new ArrayList<>();
    {
        al.add("Bharath");
        al.add("bharath");
        al.add("Anu");
        al.add("Ram");
    }
    public static void main(String[] args) {
        LambdaComparatorExample2 l=new LambdaComparatorExample2();
      System.out.println(l.al);
        Collections.sort(l.al);
        System.out.println(l.al);

    }
}
