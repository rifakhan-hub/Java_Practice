package Array;

import java.util.Scanner;

public class Sort57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the array");

        int arr[]= new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
                boolean isSorted = true;
                for (int i =0; i < arr.length - 1; i++ ){
                    if( arr[i] > arr[i+1]) {
                        isSorted = false;
                        break;
                    }
                }
        System.out.println(isSorted? " Sorted" : "Not Sorted");
    }
}
