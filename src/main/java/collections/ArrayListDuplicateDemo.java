package collections;

import java.util.ArrayList;

public class ArrayListDuplicateDemo {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(3);

        System.out.println(arrayList);

        System.out.println("Is arrayList empty ? " + arrayList.isEmpty());

        System.out.println("ArrayList size is " + arrayList.size());

        arrayList.remove(1);

        System.out.println(arrayList);
    }
}
