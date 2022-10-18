package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(1);
        set.add(3);
        set.add(1);
        set.add(7);

        System.out.println(set);
    }
}
