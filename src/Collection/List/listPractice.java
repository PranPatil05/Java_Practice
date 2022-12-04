package Collection.List;

import java.util.ArrayList;
import java.util.List;

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

    }

}
