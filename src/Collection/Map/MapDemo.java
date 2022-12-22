package Collection.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("Pranav",10);
        hm.put("Anuj",20);
        hm.put("Ram",30);
        hm.put("Sham",40);
        hm.put("Pranav",50);
        hm.put("RD",40);

        System.out.println(hm);

        System.out.println("Size ="+hm.size());
        System.out.println("Check isEmpty = "+hm.isEmpty());
        System.out.println("Get Value of Pranav Key ="+hm.get("Pranav"));
        System.out.println("\nChange RD key value to 60 using Put ="+hm.put("RD",60));
        System.out.println("Note : put method written old Kry value");
        System.out.println(hm+"\n");

        System.out.println(hm.containsKey("Pranav"));
        System.out.println(hm.containsValue(10));

        System.out.println("\nKey Set ="+hm.keySet());
        System.out.println("Value Set ="+hm.values());
        System.out.println("Entry Set(k,v) ="+hm.entrySet());

//        HashSet hs=new HashSet<>(hm.entrySet());
//        System.out.println(hs);
//
//        Iterator itr= hs.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }



    }
}
