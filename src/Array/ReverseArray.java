package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
            int[] arr = {2, 5, 8, 6, 7};
            int[] rev = new int[arr.length];
          int i = arr.length-1, j=0;
          while (i>=0) {
              rev[j++] = arr[i--];
          }
            System.out.println(Arrays.toString(rev   ));    // toString is a method which convert an object into a readable format
    }
}
