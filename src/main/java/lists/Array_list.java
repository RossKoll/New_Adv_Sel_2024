package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_list {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Black");
        arrayList.add("Yellow");
        arrayList.add("White");
        arrayList.add("Pink");
        arrayList.add("Purple");

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));

        List<String> asSublist = arrayList.subList(arrayList.size()/2, arrayList.size());
        System.out.println(asSublist);
        System.out.println("----------");
        for (String element : arrayList){
            System.out.println(element);
        }

        System.out.println("---- Linked List -----");

        LinkedList<String> linkedList = new LinkedList<>();
        var list = new LinkedList<Double>();

        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        list.add(4.4);
        list.add(5.5);

        System.out.println(list.get(0));



    }
}
