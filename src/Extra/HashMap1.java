package Extra;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        map.put("ravi", 2);
        map.put("khizar", 29);
        map.put("pagal", 11);
        
        System.out.println(map);
        System.out.println(map.containsKey("ravi"));
        System.out.println(map.keySet());
    }
}
