package predicateExample;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        Predicate<Integer> p=number ->number%348==0;
        System.out.println(p.test(num));
    }
}
