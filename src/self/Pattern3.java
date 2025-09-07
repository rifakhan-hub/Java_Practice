package self;

import java.util.Scanner;
public class Pattern3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows and coloumn");
            int row = sc.nextInt();
            int col = sc.nextInt();

            for (int i = 1; i <= col; i++) {
                for (int j = 1; j <= row; j++) {
                    if (i >= j) {
                        System.out.print(" ");
                    } else {
                        for (j = i + 1; j <= row + i + 1; j++) System.out.print("*");
                    }
                }
                System.out.println();

            }
        }
}


