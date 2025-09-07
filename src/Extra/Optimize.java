package Extra;

import java.util.HashMap;
import java.util.Map;

public class Optimize {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 51, 458, 658, 724, 4, 548, 87, 86, 65};
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr)
            map.put(element, map.getOrDefault(element, 0)+1);
        System.out.println(      map);

    }
}
