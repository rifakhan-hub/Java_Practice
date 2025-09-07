package PracticeClass1;

import java.util.Scanner;

public class FifthHarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n ;
        int sum =0 ;
        while( n>0){
            int rem= n%10;
            n/=10;
            sum = sum + rem;
        }
        if(temp%sum == 0) System.out.println("Harshad number");
        else System.out.println("not a harshad number");
    }
}
