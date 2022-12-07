package Collection.List;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vc=new Vector();
        vc.add(1);
        vc.add(2);
        vc.add(3);
        vc.add(2);
        vc.add('A');
        vc.add('B');
        vc.add('C');
        vc.add('D');
        vc.add('A');
        vc.add("Pranav");
        vc.add("Patil");
        vc.add(10.5);

        System.out.println(vc); //[1, 2, 3, 2, A, B, C, D, A, Pranav, Patil, 10.5]
        System.out.println(vc.get(1)); //2
        System.out.println(vc.contains("Pranav")); //true
        System.out.println(vc.contains("pranav")); //false
        System.out.println(vc.isEmpty()); //false

        vc.set(11,"Nivrutti");
        System.out.println(vc); //[1, 2, 3, 2, A, B, C, D, A, Pranav, Patil, Nivrutti]
        System.out.println(vc.subList(1,3)); //[2, 3]
        System.out.println(vc.indexOf('A')); //4
        System.out.println(vc.lastIndexOf('A')); //8
        System.out.println(vc.indexOf('z')); // -1 -element is not found

        Vector vc2=new Vector<>(vc);

        System.out.println(vc2); //[1, 2, 3, 2, A, B, C, D, A, Pranav, Patil, Nivrutti]
        System.out.println(vc.equals(vc2)); //true
        System.out.println(vc2.hashCode()); // 112589547
        vc2.add("Pat");
        System.out.println(vc2); //[1, 2, 3, 2, A, B, C, D, A, Pranav, Patil, Nivrutti, Pat]
        System.out.println(vc.equals(vc2)); //false
        System.out.println(vc2.containsAll(vc)); //true
        System.out.println(vc.containsAll(vc2)); //false
        System.out.println(vc.hashCode()); //112589547 same when the contains all elements
        System.out.println(vc2.hashCode()); // -804611336

        vc2.remove(3);
        System.out.println(vc2); //[1, 2, 3, A, B, C, D, A, Pranav, Patil, Nivrutti, Pat]
//        vc2.removeAll(vc);
//        System.out.println(vc2); //[Pat]

        vc2.retainAll(vc);
        System.out.println(vc2); //[1, 2, 3, A, B, C, D, A, Pranav, Patil, Nivrutti]
        System.out.println(vc2.size()); //11

//        ListIterator lit=vc2.listIterator();
//        while (lit.hasNext()){
//            System.out.println(lit.next());
//        }

        Enumeration en= vc2.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
}
