package PracticeClass1;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println(" To find the area of Circle enter 1 ");
            System.out.println(" To find the area of Rectangle enter 2 ");
            System.out.println(" To find the area of Triangle enter 3");
            n = sc.nextInt();

            switch (n) {

                case 1 -> {
                    System.out.println("Enter radius");
                    int r = sc.nextInt();
                    System.out.println(" are of circle is " + Math.PI * r * r);
                }
                case 2 -> {
                    System.out.println("Enter length");
                    int a = sc.nextInt();
                    System.out.println("Enter breadth");
                    int b = sc.nextInt();
                    System.out.println(" are of Rectangle is " + a * b);
                }
                case 3 -> {
                    System.out.println("Enter base");
                    int a = sc.nextInt();
                    System.out.println("Enter height");
                    int b = sc.nextInt();
                    System.out.println(" are of Triangle is " + (a * b) / 2);
                } default   -> System.out.println("Enter valid number");
            }break;
        }
            while (n != 0) ;



    }
}
