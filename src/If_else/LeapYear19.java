package If_else;

import java.util.Scanner;

public class LeapYear19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year ");
        int a = sc.nextInt();
        // century
        if(a%100==0) {
            if (a % 400 == 0) System.out.println(a + " is a Leap Year.");
            else System.out.println(a + " is not a Leap Year.");
        }
        else if (a % 4 == 0) System.out.println(a+ " is a Leap Year.");
        else System.out.println(a + " is not a Leap Year.");
    }

}

