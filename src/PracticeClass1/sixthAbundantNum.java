package PracticeClass1;

import java.util.Scanner;

public class sixthAbundantNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number ");
        int n = sc.nextInt();
        int fact=1;
        int sum = 0;
        int t;

        for (int i=1; i<=n/2; i++){
             t = n% i;
            if (t == 0) sum +=t;
        }if (n<sum) System.out.println("number is abundant ");

        else System.out.println("not an abundant");
    }
}
