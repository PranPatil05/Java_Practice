package Collection.Set.Hashset;

import java.util.Objects;

public class Student1 {
    int roll;
    String name;

    @Override
    public String toString() {
        return "Student1{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student1)) return false;
        Student1 student1 = (Student1) o;
        return roll == student1.roll && name.equals(student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    public Student1 (int r, String na){
        this.roll=r;
        this.name=na;
    }

}

