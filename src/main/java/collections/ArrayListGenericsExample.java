package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenericsExample {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();

        arrayList.add("Elvis");
        arrayList.add("Ernest");

        // arrayList.add(20); // Compiler won't work

        System.out.println(" String arraylist: " + arrayList);

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);

        // list.add("Elvis"); // Compiler won't work

        System.out.println(" Integer list: " + list);
    }
}
