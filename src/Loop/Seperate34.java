package Loop;

import java.util.Scanner;

public class Seperate34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long a = sc.nextLong();
        int x;
        while (a>0){
            System.out.println(a%10);
            a=a/10;

        }
    }
}
