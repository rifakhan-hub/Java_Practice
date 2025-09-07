package J30;

import java.util.Scanner;

public class AreaOfSphere10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int a= sc.nextInt();
        System.out.println("Surface area of sphere is " + 4*Math.PI*Math.pow(a,2));
    }
}
