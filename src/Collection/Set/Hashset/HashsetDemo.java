package Collection.Set.Hashset;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet hs=new HashSet();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add('A');
        hs.add('B');
        hs.add('C');
        hs.add(1);
        hs.add('B');

        System.out.println(hs);

        Student1 s1=new Student1(10,"Ram");
        Student1 s2=new Student1(20,"Ram");
        Student1 s3=new Student1(300,"Ram");
        Student1 s4=new Student1(300,"Ram");

        HashSet hs1=new HashSet();

        hs1.add(s1);
        hs1.add(s2);
        hs1.add(s3);

        System.out.println(hs1);

    }
}
