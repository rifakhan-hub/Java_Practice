package If_else;

import java.util.Scanner;

public class maxVal18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//  for finding which is the greatest
        if(a>b && a>c) System.out.println(a+ " is greatest");
        else if (b>c && b>a) System.out.println(b+ " is greatest");
        else System.out.println(c + " is greatest");

//  for finding the gretest no. among all
//        int greatest = a;
//        if (b>a)
//        if (c > b) System.out.println(c);
//        else System.out.println(b);
//
//        else System.out.println(a);
    }
}
