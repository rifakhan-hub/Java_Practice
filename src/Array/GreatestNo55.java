package Array;

import java.util.Scanner;

public class GreatestNo55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println(" enter the array");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int temp= arr[0];
        int copy=0;
        for (int i=0; i<arr.length; i++){
            if (temp<arr[i]) {
                temp = arr[i];
                copy =i;
            }
        }
        System.out.println( "the maximum value is " + temp);
        System.out.println("the index of the value is "+ copy);

    }
}
