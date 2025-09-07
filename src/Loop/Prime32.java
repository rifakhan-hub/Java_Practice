package Loop;

import java.util.Scanner;

public class Prime32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
         int sum=0, count=0;

         for( int i=0; i<=n; i++){
             if (n%i == 0) {
                 count++;
             }
         }
        System.out.println(count == 2 ? "Prime" : "not a prime ");

    }
}
