package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorDemo {
    public static void main(String[] args) {

        Map<String,Integer> mp=new HashMap<>();

        mp.put("Pranav",10);
        mp.put("Anuj",20);
        mp.put("Ram",30);
        mp.put("Sham",40);
        mp.put("Pranav",50);
        mp.put("RD",40);

        System.out.println(mp);

        System.out.println("\nIterate EnterySet using for each method :");

        for (Map.Entry<String,Integer> entry:mp.entrySet()){
            System.out.println("Key ="+entry.getKey()+" "+"Value ="+entry.getValue());
        }

        System.out.println("\nIterate KeySet using for each method :");

        for (String key:mp.keySet()){
            System.out.println("Key ="+key);
        }

        System.out.println("\nIterate ValueSet using for each method :");

        for (Integer val:mp.values()){
            System.out.println("Value ="+val);
        }

        System.out.println("\nIterate EnterySet using Iterator method :");

        Iterator<Map.Entry<String,Integer>> itr=mp.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<String,Integer> entr= itr.next();
            System.out.println("Key ="+entr.getKey()+"    "+"Values = "+entr.getValue());
        }

        System.out.println("\nIterate KeySet using Iterator method :");
        Iterator<String> key=mp.keySet().iterator();

        while (key.hasNext()){
            System.out.println("Key ="+key.next());
        }

        System.out.println("\nIterate ValueSet using Iterator method :");

        Iterator valu=mp.values().iterator();
        while (valu.hasNext()){
            System.out.println("Values ="+valu.next());
        }

    }
}
