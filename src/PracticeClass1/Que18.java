package PracticeClass1;

import java.util.Arrays;

public class Que18 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;
        int ans[] = new int[n];

        //first
        ans[0]= arr[0]*arr[1];
        // beech ke
        for ( int i =1; i < n-1; i++ ){
            ans[i] = arr[i-1]*arr[i+1];
        }
        //last element
        ans[n]= arr[n]*arr[n-1];

        System.out.println(Arrays.toString(ans));

    }
}
