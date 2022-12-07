package Collection.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
    //The stack is a linear data structure that is used to store
    // the collection of objects. It is based on Last-In-First-Out (LIFO)
    public static void main(String[] args) {
        Stack st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push('A');
        st.push('B');
        st.add('C');

        System.out.println(st.empty()); //false

        System.out.println(st);//[1, 2, 3, A, B, C]

        System.out.println(st.peek()); // C- Top Element
        System.out.println(st);

        System.out.println(st.pop());//C - Return Top element and remove
        System.out.println(st);//[1, 2, 3, A, B]

        System.out.println(st.search('A')); // 2 Position from top
        System.out.println(st.search(-1)); //-1 Object not Found
        System.out.println(st); //[1, 2, 3, A, B]

        ListIterator ltr=st.listIterator(4);
        while (ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }

        Iterator it=st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Enumeration en=st.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
}
