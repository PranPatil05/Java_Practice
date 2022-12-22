package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        Map<String,Integer> tm=new TreeMap<>();
        tm.put("Pranav",10);
        tm.put("Anuj",20);
        tm.put("Ram",30);
        tm.put("Sham",40);
        tm.put("Pranav",50);
        tm.put("RD",40);

        System.out.println(tm);

        Student3 s1=new Student3(10,"Pranav");
        Student3 s2=new Student3(20,"Anuj");
        Student3 s3=new Student3(30,"Ram");
        Student3 s4=new Student3(10,"Pranav");
        Student3 s5=new Student3(40,"Anuj");
        Student3 s6=new Student3(10,"Sham");

        Map<Student3,Integer> tm2=new TreeMap<>();
        tm2.put(s1,10);
        tm2.put(s2,20);
        tm2.put(s3,30);
        tm2.put(s4,40);
        tm2.put(s5,50);
        tm2.put(s6,60);

        System.out.println(tm2);

    }

    private static class Student3 implements Comparable{
        int r;
        String name;

        @Override
        public String toString() {
            return "Student3{" +
                    "r=" + r +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Student3(int roll, String name){
            this.r=roll;
            this.name=name;
        }

        @Override
        public int compareTo(Object o) {
            Student3 s=(Student3)o;
            if(this.r>s.r){
                return 1;
            } else if (this.r==s.r) {
                return 0;
            }
            else return -2;

        }

//        @Override
//        public int compareTo(Object o) {
//            Student3 s=(Student3)o;
//            int res=this.name.compareTo(((Student3) o).name);
//            return res;
//        }
    }
}
