package Loop;

import java.util.Scanner;

public class Sum35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        long num = sc.nextLong();
        int x=0;
        while (num>0){
            System.out.println(num%10);
            x +=(num%10);
            num = num/10;
        }
        System.out.println("the sum of digit is " + x);

    }
}
