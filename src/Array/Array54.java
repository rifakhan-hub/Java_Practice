package Array;

import java.util.Scanner;

public class Array54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;


        System.out.println(" Enter the size of array " );
        int n = sc.nextInt();
        System.out.println(" enter the array");
        int arr[]= new int[n];

        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            sum+=arr[i];

        }
         int temp = sum;

        System.out.println("the sum of the array is "+ sum);
        System.out.println("The mean of the array is " +(float) temp /n);

      //  for(int i =0; i<arr.length; i++) System.out.print( arr[i] + " ");



    }
}
