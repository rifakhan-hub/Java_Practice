package Loop;

import java.util.Scanner;

public class Table26 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no. for table printing");
        int n = sc.nextInt();

        for (int i = 1; i<=10 ; i++){
            int m = n*i;
            System.out.println(n + "*" + i + "=" + m );

        }

    }
}
