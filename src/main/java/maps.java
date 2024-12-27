import java.util.*;

public class maps {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Jan");
        map.put(2, "Feb");
        map.put(3, "Mar");
        map.put(4, "Apr");

        System.out.println(map.get(4));

        var set = map.values();

        Collection<String> set2 = new TreeSet<String>();
        set2 = map.values();
        System.out.println(set2);

        System.out.println(set);

        TreeMap<Integer, String > treeMap = new TreeMap<>();
        treeMap.put(4, "A");
        treeMap.put(3, "B");
        treeMap.put(2, "C");
        treeMap.put(1, "D");

        System.out.println(treeMap);

        for (Map.Entry<Integer, String > e : map.entrySet()){
            System.out.println(e);
        }

        System.out.println("_____________-----------");
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }




}
