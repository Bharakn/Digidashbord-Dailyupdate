package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        //ArrayList<String> al1=new ArrayList<String>();//Generic syntax
        al.add(100);
        al.add("Bharath");
        al.add(0.5678);
        al.add(5+5);
        al.add(5+" "+10);

        System.out.println(al);
        al.add(1,2000);
        System.out.println(al);
        al.remove(1);
        al.remove(new Integer(100));
        System.out.println(al);


        // Iterating arraylist
       System.out.println("Using iterator");
        Iterator it=al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Reversing the arraylist");
        ArrayList<Integer> reverse=al;
        Collections.reverse(reverse);
        System.out.println(reverse);

        System.out.println("Using for loop");
        // iterate using for loop
        //Since for loop not support by arraylist
        Object[] arr=new Object[10];
        arr=al.toArray();
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reversing the array using for loop");
        for(int i= arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }



    }
}
