package Collection.Map.TreeMapComparatorDemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class treeMapCompaDemo {
    public static void main(String[] args) {
        Student4 s1=new Student4(10,"Pranav");
        Student4 s2=new Student4(20,"Anuj");
        Student4 s3=new Student4(30,"Ram");
        Student4 s4=new Student4(10,"Pranav");
        Student4 s5=new Student4(40,"Sham");
        Student4 s6=new Student4(10,"Ajit");

        NameCompare1 namcom=new NameCompare1();
        idcompare1 idcom=new idcompare1();

//        Map<Student4,Integer> tm=new TreeMap<>(namcom);
        Map<Student4,Integer> tm=new TreeMap<>(idcom);
        tm.put(s1,10);
        tm.put(s2,20);
        tm.put(s3,30);
        tm.put(s4,40);
        tm.put(s5,50);
        tm.put(s6,60);

        System.out.println(tm);

        for(Map.Entry<Student4,Integer> it:tm.entrySet()){
            System.out.println("Key = "+it.getKey()+"  "+"Value = "+it.getValue());
        }

        Iterator<Map.Entry<Student4,Integer>> itr=tm.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Student4,Integer> entr=itr.next();
            System.out.println("Key ="+entr.getKey()+"  "+"Values ="+entr.getValue());
        }

    }

    public static class Student4 {
        int r;
        String name;

        @Override
        public String toString() {
            return "Student4{" +
                    "r=" + r +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Student4(int roll, String name){
            this.r=roll;
            this.name=name;
        }
    }

    public static class NameCompare1 implements Comparator<Student4>{

        @Override
        public int compare(Student4 o1, Student4 o2) {
            int res=o1.name.compareTo(o2.name);
            return res;
        }
    }

    public static class idcompare1 implements Comparator<Student4>{

        @Override
        public int compare(Student4 o1, Student4 o2) {
            int res=0;
            if(o1.r>o2.r){
                return 1;
            } else if (o1.r==o2.r) {
                return 0;
            }else return -2;
        }
    }

}



