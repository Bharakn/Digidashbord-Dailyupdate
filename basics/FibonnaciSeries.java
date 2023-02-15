package basics;

import java.util.Scanner;

public class FibonnaciSeries {
    //input number
    //count of numbers required in fibonnaci series
    //make it as a custom input

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int firstnumber = sc.nextInt();
        int secondnumber = firstnumber + 1;
        int fibo;
        System.out.println("Enter the count of fibonnaci series required");
        int count = sc.nextInt();

        if (count >= 2) {
            System.out.print(firstnumber + " " + secondnumber);
            for (int i = 1; i <= count - 2; i++) {
                fibo = firstnumber + secondnumber;
                System.out.print(" " + fibo);
                firstnumber = secondnumber;
                secondnumber = fibo;

            }

        }else System.out.println("Enter valid count");
    }
}
