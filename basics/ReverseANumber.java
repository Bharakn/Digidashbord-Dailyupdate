package basics;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        String s= String.valueOf(number);
        System.out.print("Reverse of the number : ");
        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
