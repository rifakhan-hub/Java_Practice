package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftArray59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // in left rotation first vala last mein and baaki sb left mein
        int arr[] = {5, 6, 9, 8, 7};
        int n = arr.length;
        // optimize k
        int k = 300;
         k = k % n;


//        for (int k=0; k<arr.length; k++)
        while( k-- > 0){
            //step 1 : first vaale ko temp mein save karna h
            int temp = arr[0];
            // iterate from 0 to n-2, copy i+1 to i

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // last index = temp
            arr[n - 1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
