package lambdaexpressions;

import java.util.ArrayList;
import java.util.Iterator;

public class LambdaExpressionExample {
    //even or odd using lamda

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(101);
        list.add(203);
        list.add(20);
        list.add(487);
        list.add(674);
        list.add(29404);
        list.add(2382);
        list.add(1238);
        list.add(1121233);
        list.add(394403);
        list.add(33828);
        list.add(1019239);
        list.add(102373);
        list.add(1487);

        list.forEach(number -> {
            if (number%2==0){
                System.out.println("The number is even "+number);
            }else {
                System.out.println("The number is odd "+number);
            }
                }
        );
    }
}
