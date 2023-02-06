package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LambdaExpressionExample4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Jhon");
        list.add("ram");
        list.add("Bharath");
        list.add("1Ram");
        list.add("Bill");
        list.add("Ambani");
        list.add("Adani");
        list.add("yusg");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(" ");
        System.out.println("Iterator");
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(" ");
        System.out.println("For each loop");
        for (String name:list) {
            System.out.println(name);
        }

        System.out.println(" ");
        System.out.println("Lambda");
        list.forEach(name ->System.out.println(name));

    }
}
