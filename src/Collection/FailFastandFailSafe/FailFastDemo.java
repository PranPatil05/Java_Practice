package Collection.FailFastandFailSafe;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FailFastDemo {
    public static void main(String[] args) {
        Vector vl=new Vector();
        vl.add('A');
        vl.add('B');
        vl.add('C');

        Enumeration en=vl.elements();

        //Case 1 - FailFast

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
            vl.add('D');
        }

        //Case 2- FailSafe

        Iterator itr=vl.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            vl.add('E');
        }
    }
}
