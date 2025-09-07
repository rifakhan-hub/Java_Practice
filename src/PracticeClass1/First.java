package PracticeClass1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rating");
        double rating = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the movie name");
         String name = sc.nextLine();


        if(rating>=0.0 && rating<=2.0) System.out.println(name+ " is a flop");
        else if (rating>=2.1 && rating<=3.4) System.out.println(name+ " is a Semi-hit");
        else if (rating>=3.5 && rating<=4.4) System.out.println(name + " is a Hit");
        else if (rating >= 4.5 && rating <= 5.0) System.out.println(name + " is a Superhit");
        else System.out.println("Invalid Rating");


    }
}
