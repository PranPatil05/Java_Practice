package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('A');
        ll.add("Pranav");
        ll.add("Patil");

        System.out.println(ll); //[1, 2, 3, A, B, C, A, Pranav, Patil]

        ll.addFirst(0);
        ll.addLast("Nivrutti");
        System.out.println(ll); //[0, 1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti]

        System.out.println(ll.element()); //0
        System.out.println(ll); // [0, 1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti]

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll.offer(1)); //true
        System.out.println(ll); //[0, 1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti, 1]
        System.out.println(ll.offerFirst(1)); //true
        System.out.println(ll.offerLast("Pnp")); //true
        System.out.println(ll); //[1, 0, 1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti, 1, Pnp]

        System.out.println(ll.peek()); //1
        System.out.println(ll.peekFirst()); //1
        System.out.println(ll.peekLast()); //Pnp

        //Q. Difference between peek and Offer ?

        System.out.println(ll.poll()); //1
        System.out.println(ll); //[0, 1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti, 1, Pnp]
        System.out.println(ll.pollFirst()); //0
        System.out.println(ll); //[1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti, 1, Pnp]
        System.out.println(ll.pollLast()); //Pnp
        System.out.println(ll); //[1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti, 1]

        System.out.println(ll.pop());
        System.out.println(ll); //[2, 3, A, B, C, A, Pranav, Patil, Nivrutti, 1]

        ll.push(1);
        System.out.println(ll); //[1, 2, 3, A, B, C, A, Pranav, Patil, Nivrutti, 1]

        System.out.println(ll.remove("Nivrutti")); //true
        System.out.println(ll); //[1, 2, 3, A, B, C, A, Pranav, Patil, 1]
        System.out.println(ll.removeFirstOccurrence('A')); //true
        System.out.println(ll); //[1, 2, 3, B, C, A, Pranav, Patil, 1]
        System.out.println(ll.removeLastOccurrence(1)); //true
        System.out.println(ll); //[1, 2, 3, B, C, A, Pranav, Patil]

//        Iterator it=ll.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        ListIterator lit=ll.listIterator();
//        while (lit.hasPrevious()){
//            System.out.println(lit.previous());
//        }

        ListIterator ltr=ll.listIterator();
        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }







    }
}
