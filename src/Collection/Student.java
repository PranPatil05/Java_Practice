package Collection;

import java.util.Objects;

public class Student implements Cloneable{
    int roll;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return roll == student.roll && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    public Student(int r, String n){
        this.name=n;
        this.roll=r;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student(10,"Pranav");
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s1.roll);
        System.out.println(s1.hashCode());
        System.out.println(s1.getClass());

        Student s2=new Student(20,"Anuj");
        System.out.println(s2);

        System.out.println("Equality S1 and S2 = "+(s1.equals(s2)));

        Student s3= (Student) s1.clone();
        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println("Refernce Equlaity = "+(s1==s3));
        System.out.println("Content Equality = "+(s1.equals(s3)));

        Student s4= new Student(10,"Pranav");
        System.out.println(s4.hashCode());

//        Note: As per the Java documentation, both the methods should be overridden to get the complete equality mechanism;
//        using equals() alone is not sufficient. It means, if we override the equals(),
//        we must override the hashcode() method.
//        https://www.javatpoint.com/equals-and-hashcode-in-java


    }
}
