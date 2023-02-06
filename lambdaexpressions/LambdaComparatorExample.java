package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaComparatorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1001);
        list.add(20);
        list.add(90000);
        list.add(87800);
        list.add(50);

        System.out.println(list);

        Collections.sort(list); // sort method sort by ascending order
        System.out.println(list);

        //desc sorting using comparator interface
        Collections.sort(list,(a,b)->{
            if(a>b){
                return -1;
            } else if (a<b) {
                return 1;
            }else {
                return 0;
            }
        });
        System.out.println(list);
    }
}
