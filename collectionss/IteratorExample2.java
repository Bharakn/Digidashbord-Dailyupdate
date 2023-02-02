package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample2 {
    public static void main(String[] args) {

        List l=new ArrayList();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);
        l.add(600);

        Iterator it=l.iterator();

        while (it.hasNext()){
            Integer n= (Integer) it.next();
            if (n<350){
                it.remove();
            }
        }
        System.out.println(l);
    }
}
