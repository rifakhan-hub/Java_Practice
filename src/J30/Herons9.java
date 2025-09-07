package J30;

import java.util.Scanner;

public class Herons9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three sides of trianle");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int s = a+b+c;
        System.out.println("Area of the triangle is " + Math.sqrt((s-a)*(s-b)*(s-c)));

    }
}
