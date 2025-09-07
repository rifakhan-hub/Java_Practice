package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseCopy58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        System.out.println("enter array");
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[n-1-i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
