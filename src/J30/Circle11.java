package J30;

import java.util.Scanner;

public class Circle11 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        int r = sc.nextInt();
        double cir = 2*Math.PI*r;
        double area = Math.PI*r*r;
        System.out.println("the circumference is "+ cir + " and area is "+ area);
    }
}
