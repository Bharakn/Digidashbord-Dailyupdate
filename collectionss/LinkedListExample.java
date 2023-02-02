package collectionss;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();
        list.add(100);
        list.add("Bharath");
        list.add(0.65);
        list.add(123);
        System.out.println(list);

        list.addFirst(100);
        System.out.println(list);

        list.addLast(null);
        System.out.println(list);

        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1000);
        l.addLast(200);
        l.addFirst(3000);
        l.add(100);
        l.addAll(list);
        System.out.println(l);

        l.removeAll(list);
        System.out.println(l);
    }
}
