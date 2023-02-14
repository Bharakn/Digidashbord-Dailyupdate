package predicateExample;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your statement ");
        String name=sc.next();
        Predicate<String> p=str -> str.contains("bharath");
        System.out.println(p.test(name));
    }
}
