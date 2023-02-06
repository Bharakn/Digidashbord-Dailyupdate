package lambdaexpressions;

import java.util.Scanner;

interface Factorial{
    public int fact(int a);
}

public class FactorialLambda {
    Factorial fa=a->{
        int fact = 1;
        for(int i=1;i<=a;i++) {
            fact=fact*i;
        }
        return fact;
    };

    public static void main(String[] args) {
        FactorialLambda f=new FactorialLambda();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       System.out.println(f.fa.fact(sc.nextInt()));
    }

}
