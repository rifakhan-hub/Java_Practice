package String;

import java.util.Arrays;

public class Anagram82 {
    public static void main(String[] args) {
        // achcha pr time complexity zyada h
        // iske alava bitMap use kr skte h

        String s = "act";
        String t = "cat";

        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);


        System.out.println(Arrays.equals(arr1, arr2));

    }
}
