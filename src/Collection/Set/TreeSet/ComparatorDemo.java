package Collection.Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(10, "Pranav");
        Employee2 e2 = new Employee2(20,"Anuj");
        Employee2 e3 = new Employee2(30,"Ram");
        Employee2 e4 = new Employee2(10, "Sham");
        Employee2 e5 = new Employee2(50, "Sham");
        Employee2 e6 = new Employee2(10, "Pranav");

//        IdCopmare idcom=new IdCopmare();
        NameCompare namcom=new NameCompare();

//        TreeSet ts=new TreeSet(idcom);

        TreeSet ts=new TreeSet(namcom);
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);

        System.out.println(ts);
    }

    public static class Employee2 {
        int i;
        String name;

        @Override
        public String toString() {
            return "Employee2{" +
                    "i=" + i +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Employee2(int id, String name){
            this.i=id;
            this.name=name;
        }
    }

//    public static class IdCopmare implements Comparator<Employee2>{

//        @Override
//        public int compare(Employee2 e1, Employee2 e2) {
//            if (e1.i==e2.i){
//                return 0;
//            }
//            else if (e1.i<e2.i){
//                //Revrerse Order implementation
//                return 2;
//            }
//            else return -4;
//        }

//    }

    public static class NameCompare implements Comparator<Employee2>{

        @Override
        public int compare(Employee2 e1, Employee2 e2) {
            int res= e1.name.compareTo(e2.name);
            return res;
        }
    }


}

