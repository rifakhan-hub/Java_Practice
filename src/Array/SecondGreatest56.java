package Array;

import java.util.Scanner;

public class SecondGreatest56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=  {2, 96, 69, 77, 145, 20};
        int f= Math.max(arr[0], arr[1]);
        int s= Math.min(arr[0], arr[1]);

        for ( int i =2; i< arr.length; i++){
            if(arr[i]> f) {
                s = f;
                f = arr[i];
            } else if (arr[i] > s) {
                s = arr[i];
            }
        }
        System.out.println(s);

    }
}
