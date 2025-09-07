package J30;

import java.util.Scanner;

public class SwapNum6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter two numbers for swapping\n");

        //        swaping numbers without declariing 3rd var

        int a = sc.nextInt();
        int b = sc.nextInt();
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("a is "+a+" and b is "+b);

//        swapping numbers using 3rd var

//        int c;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println(" After swapping the numbers are " + a + " and " + b + "\n");



    }
}
