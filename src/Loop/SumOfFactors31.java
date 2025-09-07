package Loop;

import java.util.Scanner;

public class SumOfFactors31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a number ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i =1; i<=n; i++){
            if (n%i==0) {
                if (n==i) System.out.print(i+ " ");
                else System.out.print(i+ " + ");
                sum += i;
            }

        }
        System.out.print("= " + sum );
       // System.out.println("the sum of factorials is "+sum);
    }
}
