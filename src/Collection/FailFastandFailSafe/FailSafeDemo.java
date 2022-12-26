package Collection.FailFastandFailSafe;

import java.util.*;

public class FailSafeDemo {
    public static void main(String[] args) {
        List al=new ArrayList();
        al.add('A');
        al.add('B');
        al.add('C');

        Iterator itr=al.listIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            al.add('D'); // ConcurrentModificationException - Failsafe
        }

    }
}
