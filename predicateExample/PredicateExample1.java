package predicateExample;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        int salary=10000;
        Predicate<Integer> p=i -> i>=4000;
       System.out.println( p.test(salary));
    }
}
