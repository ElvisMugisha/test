package collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Key is integer
        // Value is string

        map.put(2, "Elvis");
        map.put(1, "Khawar");
        map.put(4, "Phase");
        map.put(3, "Ernest");
        map.put(10, "Innocent");
        map.put(0, "Mugisha");

        System.out.println(map);

    }
}
