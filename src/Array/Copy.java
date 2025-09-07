package Array;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
         int arr[] = {2, 5, 8, 6, 7};
         int temp[] = new int[arr.length];
         for (int i=0; i<arr.length; i++) {
             temp[i] = arr[i];
         }
        System.out.println(Arrays.toString(temp));
    }
}
