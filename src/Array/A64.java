package Array;

import java.util.Arrays;

public class A64 {
    public static void main(String[] args) {
        int arr[] = {8,6,7,9,-2,-8,-5,-4};
        int ans[] = new int [arr.length];
        int k =0;
        // negetive
        for (int i =0; i< arr.length; i++){
            if ( arr[i] <0)
                ans[k++] = arr[i];
        }
        // positive
        for (int i =0; i< arr.length; i++){
            if (arr[i]>0)
                ans[k++]= arr[i];

        }
        System.out.println(Arrays.toString(ans));
    }
}
