package Array;

import java.util.Scanner;

public class SecondGreat56 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        System.out.println("ENter the array ");
        int arr[] = new int[size];
        for (int i =0; i<arr.length; i++) arr[i] = sc.nextInt();


    }
}
