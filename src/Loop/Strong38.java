package Loop;

import java.util.Scanner;

public class Strong38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();
        int temp = a ;
        int sum = 0;


        while (a != 0){
            int rem = a%10;
            int fact = 1;
            for (int i =0; i<=rem; i++){
                fact = fact *i;
            }
            sum = sum + fact ;
        }

    }
}
