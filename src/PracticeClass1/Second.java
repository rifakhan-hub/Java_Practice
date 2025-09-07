package PracticeClass1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M for male and F for female ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Enter your year of service ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter P for post graduation and G for graduation ");
        char qual = sc.nextLine().charAt(0);


        if (gender == 'M' || gender == 'm') {
            if (year >= 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 15000");
                } else if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 10000");
                }

            }
            if (year < 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 10000");
                } else if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 7000");
                }
            }
        }
        else if (gender == 'F' || gender == 'f') {
            if (year >= 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 12000");
                } else if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 9000");
                }
            }
            if (year < 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 9000");
                } else if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 6000");
                }
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}