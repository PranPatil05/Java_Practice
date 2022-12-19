package Collection.Set.LinkedHashset;

import Collection.Student;

import java.util.LinkedHashSet;

public class linkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet ls=new LinkedHashSet<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(1);
        ls.add('A');
        ls.add('B');
        ls.add('C');
        ls.add('A');

        System.out.println(ls);

        Student2 s1=new Student2(10,"Pranav");
        Student2 s5=new Student2(10,"Pranav");
        Student2 s2=new Student2(20,"Anuj");
        Student2 s3=new Student2(10,"Chetan");
        Student2 s4=new Student2(40,"Madan");

        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        ls.add(s5);

        System.out.println(ls+"\n");

        System.out.println("Notes =\n");

        System.out.println("    /*Equals and Hascode Method\n" +
                "    1. If you wamt only roll number to be unique select only roll Number while genreating equals and Hashcode method same for Name\n" +
                "    e.g - Name selected only -[Student2{roll=10, name='Pranav'}, Student2{roll=20, name='Anuj'}, Student2{roll=10, name='Chetan'}, Student2{roll=40, name='Madan'}]\n" +
                "    e.g - roll selected only - [Student2{roll=10, name='Pranav'}, Student2{roll=20, name='Anuj'}, Student2{roll=40, name='Madan'}]\n" +
                "    \n" +
                "    2. If you want both roll and name to compare at same time then Select both of them.\n" +
                "    e.g - Both Selected - [Student2{roll=10, name='Pranav'}, Student2{roll=20, name='Anuj'}, Student2{roll=10, name='Chetan'}, Student2{roll=40, name='Madan'}] */");
    }
}
