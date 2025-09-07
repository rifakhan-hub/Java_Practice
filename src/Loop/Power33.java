package Loop;

import java.util.Scanner;

public class Power33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number and power");
        int a = sc.nextInt();
        int b = sc.nextInt();
        long x=1;

        for (int i =1; i<=b; i++){
            x*=a;
        }
        System.out.println(a+ " raised to power " +b+ " is = " + x);
    }
}
