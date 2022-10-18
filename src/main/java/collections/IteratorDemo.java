package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Integer>();

        arrayList.add(15);
        arrayList.add(32);
        arrayList.add(10);
        arrayList.add(22);

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
