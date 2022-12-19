package Collection.List;

import java.util.*;

public class listPractice {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add('A');
        al.add('B');
        al.add('C');
        al.add('A');
        al.add("Pranav");
        al.add("Patil");

        System.out.println(al);

        System.out.println(al.get(1)); //2
        System.out.println(al.contains("Pranav")); //true
        System.out.println(al.contains("pranav")); //false
        System.out.println(al.isEmpty()); //false
        al.set(8,"Nivrutti");
        System.out.println(al); //[1, 2, 3, A, B, C, A, Pranav, Nivrutti]
        System.out.println(al.subList(1,3)); //[2, 3]
        System.out.println(al.indexOf('A')); //3
        System.out.println(al.lastIndexOf('A')); //6
        System.out.println(al.indexOf('z')); // -1 -element is not found

        ArrayList al2=new ArrayList();
        al2.addAll(al);
        System.out.println(al2); //[1, 2, 3, A, B, C, A, Pranav, Nivrutti]
        System.out.println(al.equals(al2)); //true
        System.out.println(al2.hashCode()); // -493355513
        al2.add("Patil");
        System.out.println(al2); //[1, 2, 3, A, B, C, A, Pranav, Nivrutti, Patil]
        System.out.println(al.equals(al2)); //false
        System.out.println(al2.containsAll(al)); //true
        System.out.println(al.containsAll(al2)); //false
        System.out.println(al.hashCode()); //-493355513 same when the contains all elements
        System.out.println(al2.hashCode()); // 1962734527

        al2.remove(3);
        System.out.println(al2); //[1, 2, 3, B, C, A, Pranav, Nivrutti, Patil]
//        al2.removeAll(al);
//        System.out.println(al2);

        al2.retainAll(al);
        System.out.println(al2); //[1, 2, 3, B, C, A, Pranav, Nivrutti]
        System.out.println(al2.size()); //8

        Object[] ar=al2.toArray();

//        for(int i=0; i<ar.length;i++){
//            System.out.println(ar[i]);
//        }

        String s=al2.toString();
        System.out.println(s); //[1, 2, 3, B, C, A, Pranav, Nivrutti]

//        Iterator it=al.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        ListIterator lit=al2.listIterator();

        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        Employee e1=new Employee(10,"Pranav");
        Employee e2=new Employee(20,"Anuj");
        Employee e3=new Employee(30,"Ram");
        Employee e4=new Employee(30,"Ram");
        Employee e5=new Employee(40,"Anuj");
        Employee e6=new Employee(10,"Sham");

        ArrayList al3=new ArrayList<>();
        al3.add(e1);
        al3.add(e2);
        al3.add(e3);
        al3.add(e4);
        al3.add(e5);
        al3.add(e6);

        System.out.println(al3);


    }

}
