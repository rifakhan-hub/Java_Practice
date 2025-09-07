package Loop;

import java.util.Scanner;

public class EvenOdd29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sumEven =0;
        int sumOdd = 0;

        for (int i =1; i<=n; i++){
            if (i%2 ==0) {
                sumEven += i;
            }else
                sumOdd += i;
        }
        System.out.println("Sum of even = " +sumEven+ " \nSum of odd = " +sumOdd);

// sasta tareeka
//        for (int i = 0; i<=n; i+=2) {
//            even = even + i;
//        }
//        System.out.println( "the sum of all positive even number upto "+n+ " is "+even);
//
//        for (int i = 1; i<=n; i+=2) {
//            odd = odd + i;
//        }
//        System.out.println( "the sum of all positive even number upto "+n+ " is "+odd);
    }
}
