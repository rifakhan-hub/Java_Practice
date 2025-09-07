package pattern;

import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i=1; i<=n ; i++){
           // space print karega
            for ( int j=1; j<=n-i ; j++){
                System.out.print(" ");
            }

            // * print karega
            for ( int j =1; j<=n; j++){
                if(i==j)
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
