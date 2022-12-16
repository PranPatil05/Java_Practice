package Collection.Set;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        int res= 0;
        if (o1.roll> o2.roll)
            res= 1;
        else if (o1.roll< o2.roll) {
            res= -1;
        } else if (o1.roll==o2.roll) {
            res=0;
        }
        return res;
    }
}
