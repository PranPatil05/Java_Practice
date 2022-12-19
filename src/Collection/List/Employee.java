package Collection.List;

import java.util.Objects;

public class Employee {
    int i;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "i=" + i +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee (int id, String name){
        this.i=id;
        this.name=name;
    }
}
