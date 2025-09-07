package pattern;

import java.util.Scanner;

public class X53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows" );
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            System.out.println("  ");
            for (int j=1; j<=n-1; j++){
                System.out.print("  ");
                if(i==j || i+j == 10) System.out.print("*");
            }
        }
    }
}
