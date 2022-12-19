package Collection.Set.LinkedHashset;

import java.util.Objects;

public class Student2 {
    int roll;
    String name;

    @Override
    public String toString() {
        return "Student2{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

// Case 1 - Only Roll compare
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student2)) return false;
//        Student2 student2 = (Student2) o;
//        return roll == student2.roll;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(roll);
//    }

    // Case 2 - Name Compare Only
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student2)) return false;
//        Student2 student2 = (Student2) o;
//        return name.equals(student2.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2)) return false;
        Student2 student2 = (Student2) o;
        return roll == student2.roll && name.equals(student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }


    /*Equals and Hascode Method
    1. If you wamt only roll number to be unique select only roll Number while genreating equals and Hashcode method same for Name
    e.g - Name selected only -[Student2{roll=10, name='Pranav'}, Student2{roll=20, name='Anuj'}, Student2{roll=10, name='Chetan'}, Student2{roll=40, name='Madan'}]
    e.g - roll selected only - [Student2{roll=10, name='Pranav'}, Student2{roll=20, name='Anuj'}, Student2{roll=40, name='Madan'}]

    2. If you want both roll and name to compare at same time then Select both of them.
    e.g - Both Selected - [Student2{roll=10, name='Pranav'}, Student2{roll=20, name='Anuj'}, Student2{roll=10, name='Chetan'}, Student2{roll=40, name='Madan'}] */

    public Student2(int i, String name) {
        this.roll=i;
        this.name=name;
    }
}
