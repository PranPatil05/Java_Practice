package Collection.Set.TreeSet;

import Collection.List.Employee;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(1);
//        ts.add('A');
//        ts.add('B');
//        ts.add('C');

        System.out.println(ts);
        System.out.println("\n" + "Only Single type of elements added \n" + "Exception in thread \"main\" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Character");

        Employee1 e1 = new Employee1(10, "Pranav");
        Employee1 e2 = new Employee1(20, "Anuj");
        Employee1 e3 = new Employee1(30, "Ram");
        Employee1 e4 = new Employee1(10, "Sham");
        Employee1 e5 = new Employee1(50, "Sham");
        Employee1 e6 = new Employee1(10, "Pranav");

        TreeSet ts1 = new TreeSet<Employee1>();
        ts1.add(e1);
        ts1.add(e2);
        ts1.add(e3);
        ts1.add(e4);
        ts1.add(e5);
        ts1.add(e6);

//        System.out.println("\nIterator Over set= ");
//
//        Iterator it=ts1.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        System.out.println(ts1);
        System.out.println("\n"+"Notes: ");
        System.out.println("1. Without CompareTo or Comparator methods implementation Class Objects throws Exception");
        System.out.println("2. For use CompateTo() methods class must implement Comparable Interface");
        System.out.println("3. Implements CompareTo method in Class by two ways i) with Genrics ii)Without Genrics");

    }

    //Case 1 - Implement Comparable with Genrics
    private static class Employee1 implements Comparable<Employee1> {

        int id;
        String name;

        @Override
        public String toString() {
            return "Employee1{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Employee1(int i, String name) {
            this.id = i;
            this.name = name;
        }

        // Compare as per ID -

//        @Override
//        public int compareTo(Employee1 o) {
//            if(this.id==o.id){
//                return 0;
//            } else if (this.id>o.id) {
//                return 1;
//            }
//            else return -1;
//        }

        //Compare as per name
        @Override
        public int compareTo(Employee1 o) {
            int res = this.name.compareTo(o.name);
            return res;
        }
    }


    //Case 2 - Implement Comparable without Genrics

//    private static class Employee1 implements Comparable {
//        int id;
//        String name;
//
//        @Override
//        public String toString() {
//            return "Employee1{" +
//                    "id=" + id +
//                    ", name='" + name + '\'' +
//                    '}';
//        }
//
//        public Employee1(int i, String name) {
//            this.id = i;
//            this.name = name;
//        }
//
//        @Override
//        public int compareTo(Object o) {
//            Employee1 e = (Employee1) o;
//            if (this.id == e.id)
//                return 0;
//            else if (this.id > e.id)
//                return 4;
//            else
//                return -2;
//        }
//    }
}
