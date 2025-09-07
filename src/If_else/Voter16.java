package If_else;

import java.util.Scanner;

public class Voter16     {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();

        System.out.println("Enter your age");
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("Hello "+ name + ", you are a valid voter.");
        } else {
            System.out.println("Sorry " + name+ ", you can't vote.");
            System.out.println("You will be valid after " + (18- age) + " years");
        }

    }
}
