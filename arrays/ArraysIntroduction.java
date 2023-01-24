package arrays;

import java.util.Scanner;

public class ArraysIntroduction {

    //Single dimension array creation

    public static void main(String[] args) {
        int[] arr={10,20,30};
        int[] arr1=new int[10];
        arr1[0]=100;
        arr1[1]=200;
        arr1[2]=300;
        arr1[3]=400;
        arr1[4]=500;
        arr1[5]=600;
        arr1[6]=700;
        arr1[7]=800;
        arr1[8]=900;

        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");System.out.println(arr[2]);

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        System.out.println(arr1[5]);
        System.out.println(arr1[6]);
        System.out.println(arr1[7]);
        System.out.println(arr1[8]);

        System.out.println(arr1.length);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String abc=sc.nextLine();
        System.out.println(abc);

    }
}
