package Collection.Set;

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

    public Student1 (int r, String na){
        this.roll=r;
        this.name=na;
    }

}

