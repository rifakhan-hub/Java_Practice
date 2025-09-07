package J30;

import java.util.Scanner;

public class CompoundInterest8 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter your principal amount");
        double P = sc.nextDouble();
        System.out.println("Enter the number of years the money is invested");
        int t = sc.nextInt();
//        System.out.println("Enter the number of time the money is compound every year ");
//         int n = sc.nextInt();
        System.out.println("Enter the annual rate of interest ");
        double r = sc.nextDouble();
        double A = (P*(Math.pow(1+r/t,t)));
        System.out.println("Your compound Interest is " +A );


    }
}
