package J30;
import java.util.Scanner;
public class Perimeter7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int b = sc.nextInt();
       int c = 2*(a + b);
        System.out.println("The perimeter of rectangle is " +c );
    }
}
